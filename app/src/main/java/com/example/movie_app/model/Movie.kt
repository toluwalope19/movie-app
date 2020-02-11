package com.example.movie_app.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie (
        @SerializedName("title")
        var title : String,
        @SerializedName("genre_ids")
        var genre: List<Int>,
        @SerializedName("poster_path")
        var thumbnail: String,
        @SerializedName("release_date")
        var releaseDate: String,
        @SerializedName("vote_average")
        var voteAverage: Double,
        @SerializedName("overview")
        var overview: String


):Parcelable