package com.yothman.islamiapp


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter


class AhadethRvAdapte(var ahadethName: List<String>) :Adapter<AhadethRvAdapte.ViewHolder>() {


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val ahadethNameTV = itemView.findViewById<TextView>(R.id.ahadethNameTv )
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AhadethRvAdapte.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.ahadeth_rv,parent,false)
        return AhadethRvAdapte.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AhadethRvAdapte.ViewHolder, position: Int) {
        val ahadethName = ahadethName[position]
        holder.ahadethNameTV.text = ahadethName
    }

    override fun getItemCount() = ahadethName.size
}