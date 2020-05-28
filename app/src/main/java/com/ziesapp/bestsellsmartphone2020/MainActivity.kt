package com.ziesapp.bestsellsmartphone2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvSmartphone: RecyclerView
    private var list: ArrayList<Smartphone> = arrayListOf()
    private val listSmartphoneAdapter = ListSmartphoneAdapter(list)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showRecycler()
        clickAction()
    }

    //recyclerView
    private fun showRecycler() {
        rvSmartphone = findViewById(R.id.rv_utama)
        rvSmartphone.setHasFixedSize(true)
        list.addAll(ObjekSmartphone.listData)
        rvSmartphone.layoutManager = LinearLayoutManager(this)
        rvSmartphone.adapter = listSmartphoneAdapter
    }

    //about-menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intent = Intent(this, AboutActivity::class.java)
        startActivity(intent)
        return super.onOptionsItemSelected(item)
    }

    private fun clickAction() {
        listSmartphoneAdapter.setOnItemClickCallBack(object :
            ListSmartphoneAdapter.OnItemClickCallBack {
            override fun onItemClicked(data: Smartphone) {
                selected(data)
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                    .apply {
                        putExtra(DetailActivity.EXTRA_NAMA, data.nama)
                        putExtra(DetailActivity.EXTRA_DETAIL, data.detail)
                        putExtra(DetailActivity.EXTRA_IMAGE, data.foto)
                    }
                startActivity(intent)
            }
        })
    }

    //detail
    private fun selected(smartphone: Smartphone) {
        Toast.makeText(this, "Kamu Memilih " + smartphone.nama, Toast.LENGTH_SHORT).show()
    }
}
