package com.example.restclient.model

import com.google.gson.annotations.SerializedName

data class Banner(
        @SerializedName("id") val id: Int?,
        @SerializedName("title") val title: String?,
        @SerializedName("url") val url: String?,
        @SerializedName("image") val image: String?,
        @SerializedName("type") val type: String?
)