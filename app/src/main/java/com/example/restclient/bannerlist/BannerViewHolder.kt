package com.example.restclient.bannerlist

import android.support.v7.widget.RecyclerView
import android.view.View
import com.example.restclient.model.Banner
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.banner_list_item.view.*

class BannerViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(banner: Banner) {
        itemView.banner_type.text = banner.type
        itemView.banner_title.text = banner.title
        Picasso.get()
                .load("http://192.168.20.7/${banner.image}")
                .into(itemView.banner_image)
    }
}