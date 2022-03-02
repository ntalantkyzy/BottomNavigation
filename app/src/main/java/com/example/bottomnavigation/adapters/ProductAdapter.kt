package com.example.bottomnavigation.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.bottomnavigation.R
import com.example.bottomnavigation.models.Product

class ProductAdapter ( private val array: ArrayList<Product>) : RecyclerView.Adapter<ProductAdapter.ViewHolder> (){

    class ViewHolder (view:View) : RecyclerView.ViewHolder(view) {
        val image = view.findViewById<ImageView>(R.id.image)
        val productName = view.findViewById<TextView>(R.id.productName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item = LayoutInflater.from(parent.context).inflate(R.layout.product_item_cell, parent, false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = array[position]
        holder. productName.text = item.name
        Glide.with(holder.itemView)
            .load(item.image)
            .into(holder.image)
    }

    override fun getItemCount(): Int {
        return array.size
    }
}

fun sumTwoDigits (a: Int, b: Int) {
    a + b
}