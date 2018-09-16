package com.example.restclient.api

import com.example.restclient.model.BannerResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("getBanners/")
    fun getBanners(): Call<BannerResponse>
}