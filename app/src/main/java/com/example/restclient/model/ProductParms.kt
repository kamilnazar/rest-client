package com.example.restclient.model

import com.google.gson.annotations.SerializedName

data class ProductParms(
        @SerializedName("page_number") val page_number:Int,
        @SerializedName("language_id") val language_id:Int,
        @SerializedName("type") val type:String
)