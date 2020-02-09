package com.example.movie_app.model

import com.google.gson.annotations.SerializedName

data class Movie (
        @SerializedName("title")
        val title : String,
        @SerializedName("genre_ids")
        val genre: Int,
        @SerializedName("poster_path")
        val thumbnail: String,
        @SerializedName("release_date")
        val releaseDate: String,
        @SerializedName("overview")
        val overview: String,
        val isLiked: Boolean
)