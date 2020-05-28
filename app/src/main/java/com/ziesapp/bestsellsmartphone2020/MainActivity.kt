package com.ziesapp.bestsellsmartphone2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvSmartphone: RecyclerView
    private var list: ArrayList<Smartphone> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvSmartphone = findViewById(R.id.rv_utama)
        rvSmartphone.setHasFixedSize(true)

        list.addAll(ObjekSmartphone.listData)
        showRecycler()
    }

    private fun showRecycler() {
        rvSmartphone.layoutManager = LinearLayoutManager(this)
        rvSmartphone.adapter = ListSmartphoneAdapter(list)

    }

}
