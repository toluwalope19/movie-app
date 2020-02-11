package com.example.movie_app.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class FavouriteMovie (
   @ColumnInfo(name = "id")
   var id: Int = 0,
   @ColumnInfo(name="title")
    val title : String,
//   @ColumnInfo(name="genre")
//    val genre: List<Int>,
   @ColumnInfo(name="thumbnail")
    val thumbnail: String,
    @ColumnInfo(name="rating")
    val voteAverage: Double,
   @ColumnInfo(name = "releaseDate")
    val releaseDate: String,
   @ColumnInfo(name="overview")
    val overview: String,
   @ColumnInfo(name="isLiked")
    val isLiked: Boolean
):Parcelable