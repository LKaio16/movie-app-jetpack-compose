package br.com.movieapp.core.data.remote.model

import com.google.gson.annotations.SerializedName

data class ProductionCountry(
    @SerializedName("iso_3166_1")
    val iso3166_1: String,

    @SerializedName("name")
    val name: String
)