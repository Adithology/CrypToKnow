package com.kriptoadit.a10120240.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kriptoadit.a10120240.R
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}