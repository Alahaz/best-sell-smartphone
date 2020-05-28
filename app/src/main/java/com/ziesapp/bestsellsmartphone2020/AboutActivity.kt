package com.ziesapp.bestsellsmartphone2020

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_activity)
        this.supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}