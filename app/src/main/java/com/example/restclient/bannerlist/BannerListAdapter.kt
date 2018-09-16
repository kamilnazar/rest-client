package com.example.restclient.bannerlist

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.restclient.R
import com.example.restclient.model.Banner

class BannerListAdapter(private val bannerList: List<Banner>) : RecyclerView.Adapter<BannerViewHolder>() {
    override fun onCreateViewHolder(view: ViewGroup, index: Int): BannerViewHolder {
        return BannerViewHolder(LayoutInflater.from(view.context)
                .inflate(R.layout.banner_list_item, view, false))
    }

    override fun getItemCount(): Int = bannerList.size

    override fun onBindViewHolder(viewHolder: BannerViewHolder, index: Int) {
        viewHolder.bind(bannerList[index])
    }
}