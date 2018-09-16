package com.example.restclient

import android.app.Application
import com.example.restclient.api.Api
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class App : Application() {
    private val retrofit by lazy {
        Retrofit.Builder()
                .baseUrl("http://192.168.20.7/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

    val api: Api by lazy { retrofit.create(Api::class.java) }
}