package com.yothman.islamiapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class SuraNameRvAdapter(var suraName: List<String>) : Adapter<SuraNameRvAdapter.ViewHolder>() {


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val suraNameTv = itemView.findViewById<TextView>(R.id.item_suraNameTv )
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.sura_name_rv,parent,false)
        return ViewHolder(view)

    }

    override fun getItemCount() = suraName.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val suraName = suraName[position]
        holder.suraNameTv.text = suraName
    }
}