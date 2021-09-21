package com.dicoding.submission1

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ItemAdapter(private val listHero: ArrayList<Item>) : RecyclerView.Adapter<ItemAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_list, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val hero = listHero[position]
        Glide.with(holder.itemView.context)
            .load(hero.photo)
            .apply(RequestOptions().override(75, 75))
            .into(holder.photo)
        holder.name.text = hero.name
        holder.detail.text = hero.detail
        holder.itemView.setOnClickListener {onItemClickCallback.onItemClicked(listHero[holder.adapterPosition])}
    }

    override fun getItemCount(): Int {
        return listHero.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView = itemView.findViewById(R.id.item_name)
        var detail: TextView = itemView.findViewById(R.id.item_detail)
        var photo: ImageView = itemView.findViewById(R.id.item_photo)
    }
    interface OnItemClickCallback {
        fun onItemClicked(data: Item)
    }
}