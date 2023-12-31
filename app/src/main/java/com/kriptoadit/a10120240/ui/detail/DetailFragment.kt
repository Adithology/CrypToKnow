package com.kriptoadit.a10120240.ui.detail

import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.google.gson.Gson
import com.kriptoadit.a10120240.base.BaseFragment
import com.kriptoadit.a10120240.databinding.FragmentDetailBinding
import com.kriptoadit.a10120240.model.detail.CoinDetail
import com.kriptoadit.a10120240.model.detail.DetailResponse
import com.kriptoadit.a10120240.utils.Constants.API_KEY
import com.kriptoadit.a10120240.utils.loadImage
import dagger.hilt.android.AndroidEntryPoint
import org.json.JSONArray
import org.json.JSONObject



@AndroidEntryPoint
class DetailFragment : BaseFragment<FragmentDetailBinding, DetailViewModel>(
    FragmentDetailBinding::inflate
) {
    override val viewModel by viewModels<DetailViewModel>()
    private val args by navArgs<DetailFragmentArgs>()


    override fun onCreateFinished() {
        viewModel.getDetail(API_KEY, args.symbol)
    }

    override fun initializeListeners() {}

    override fun observeEvents() {
        with(viewModel) {
            detailResponse.observe(viewLifecycleOwner) {
                parseData(it)
            }
            isLoading.observe(viewLifecycleOwner) {
                handleView(it)
            }
            onError.observe(viewLifecycleOwner) {
                Toast.makeText(requireContext(), it, Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun parseData(it: DetailResponse?) {
        val gson = Gson()
        val json = gson.toJson(it?.data)
        val jsonObject = JSONObject(json)
        val jsonArray = jsonObject[args.symbol] as JSONArray

        val coin = gson.fromJson(jsonArray.getJSONObject(0).toString(), CoinDetail::class.java)

        coin?.let {
            with(binding) {
                ivDetail.loadImage(it.logo)
                tvDetailTitle.text = it.name
                tvDetailSymbol.text = it.symbol
                tvDetailDescription.text = it.description
            }
        }
    }

    private fun handleView(isLoading: Boolean = false) {
        binding.detailGroup.isVisible = !isLoading
        binding.pbDetail.isVisible = isLoading
    }
}