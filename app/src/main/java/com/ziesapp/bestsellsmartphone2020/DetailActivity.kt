package com.ziesapp.bestsellsmartphone2020

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAMA = "extra_name"
        const val EXTRA_DETAIL = "extra_price"
        const val EXTRA_IMAGE = "extra_image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity)

        val tvNama:TextView = findViewById(R.id.detail_tv_nama)
        val tvDetail:TextView = findViewById(R.id.detail_tv_detail)
        val getGambar: Int = intent.getIntExtra(EXTRA_IMAGE,0)
        val imgPhone:ImageView = findViewById(R.id.detail_img_phone)

        tvNama.text = intent.getStringExtra(EXTRA_NAMA)
        tvDetail.text = intent.getStringExtra(EXTRA_DETAIL)
        Glide.with(this)
            .asBitmap()
            .load(getGambar)
            .into(imgPhone)

    }
}