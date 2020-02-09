package com.example.movie_app.model

import com.google.gson.annotations.SerializedName

data class FavouriteMovie (
    val title : String,
    val genre: Int,
    val thumbnail: String,
    val releaseDate: String,
    val overview: String,
    val isLiked: Boolean
)