package com.ashraf.ktdemo

import android.content.Context
import android.net.Uri
import android.net.Uri.parse
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.branditem.view.*

class brandAdapter(var context: Context, var brand: List<Brands>) : RecyclerView.Adapter<brandAdapter.brandholder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): brandholder {
        var view = LayoutInflater.from(context).inflate(R.layout.branditem, parent, false)
        return brandholder(view)
    }

    override fun getItemCount(): Int {
        return brand.size
    }

    override fun onBindViewHolder(holder: brandholder, position: Int) {
        holder.brandName.text = brand[position].name
        Picasso.get().load(brand[position].logo).into(holder.brandImage)

    }


    class brandholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var brandName = itemView.brand_name
        var brandImage = itemView.brand_image
    }
}