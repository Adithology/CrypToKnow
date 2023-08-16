package com.kriptoadit.a10120240.bindingadapters

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.kriptoadit.a10120240.utils.loadImage

class CoinBinding {

    companion object {
        @BindingAdapter("load_image")
        @JvmStatic
        fun loadImage(imageView: ImageView, coinImage: String) {
            val imageUrl = "https://s2.coinmarketcap.com/static/img/coins/64x64/$coinImage.png"
            imageView.loadImage(imageUrl)
        }
    }
}