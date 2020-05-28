package com.ziesapp.bestsellsmartphone2020

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListSmartphoneAdapter(private val listSmartphone: ArrayList<Smartphone>) :
    RecyclerView.Adapter<ListSmartphoneAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvNama: TextView = itemView.findViewById(R.id.tv_nama)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_detail)
        var ivFoto: ImageView = itemView.findViewById(R.id.img_phone)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.list_utama, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listSmartphone.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val smartphone = listSmartphone[position]

        Glide.with(holder.itemView.context)
            .load(smartphone.foto)
            .apply(RequestOptions().override(72, 72))
            .into(holder.ivFoto)
        holder.tvNama.text = smartphone.nama
        holder.tvDetail.text = smartphone.detail

    }

}

