package com.example.restclient.api

import com.example.restclient.model.BannerResponse
import com.example.restclient.model.ProductParms
import com.example.restclient.model.ProductResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface Api {
    @GET("getBanners/")
    fun getBanners(): Call<BannerResponse>

    @POST("getAllProducts/")
    fun getProducts(@Body productParms: ProductParms): Call<ProductResponse>
}