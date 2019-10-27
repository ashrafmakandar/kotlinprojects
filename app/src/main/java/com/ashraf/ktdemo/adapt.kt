package com.ashraf.ktdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class adapt(var context: Context, var users: ArrayList<User>) : RecyclerView.Adapter<adapt.views>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): views {
        var v = LayoutInflater.from(context).inflate(R.layout.item, parent, false)
        return views(v)
    }

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: views, position: Int) {
        holder.t1.text = users[position].city.toString()
        holder.t2.text = users[position].name.toString()


    }


    class views(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var t1 = itemView.t1
        var t2 = itemView.t2


    }
}