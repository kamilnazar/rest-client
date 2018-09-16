package com.example.restclient.model

import com.google.gson.annotations.SerializedName


data class BannerResponse(
        @SerializedName("success") val success: String?,
        @SerializedName("data") val data: List<Banner>?,
        @SerializedName("message") val message: String?
)

