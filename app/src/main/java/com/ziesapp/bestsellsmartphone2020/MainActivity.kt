package com.ziesapp.bestsellsmartphone2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
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

    //recyclerView
    private fun showRecycler() {
        rvSmartphone.layoutManager = LinearLayoutManager(this)
        rvSmartphone.adapter = ListSmartphoneAdapter(list)
    }

    //menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intent = Intent(this, AboutActivity::class.java)
        startActivity(intent)
        return super.onOptionsItemSelected(item)
    }
}
