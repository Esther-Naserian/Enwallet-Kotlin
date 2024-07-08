package com.example.enwallet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
class NameRecyclerViewAdapter(var namesList: List<String>):
    RecyclerView.Adapter<NamesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_mysalary,parent,false)
        return NamesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        holder.tvname.text = namesList[position]
    }

    override fun getItemCount(): Int {
        return namesList.size

    }
}
class NamesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvname = itemView.findViewById<TextView>(R.id.tvnames)
}