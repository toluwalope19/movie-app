package com.example.movie_app.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
@Entity(tableName = "movieTable")
@Parcelize
data class Movie (@PrimaryKey

          @ColumnInfo(name = "id")
         @SerializedName("id")
          var id: Long = 0,

        @SerializedName("title")
        @ColumnInfo(name="title")
        var title : String,

//        @SerializedName("genre_ids")
//        @ColumnInfo(name="genre_ids")
       // var genre: List<Int>,
        @SerializedName("poster_path")
        @ColumnInfo(name="thumbnail")
        var thumbnail: String,

        @SerializedName("release_date")
          @ColumnInfo(name="rating")
        var releaseDate: String,

        @SerializedName("vote_average")
        @ColumnInfo(name="vote_average")
        var voteAverage: Double,

        @SerializedName("overview")
          @ColumnInfo(name="overview")
        var overview: String,

      @SerializedName("backdrop_path")
      @ColumnInfo(name="backdrop")
      var backdrop: String,

        @Transient
        @ColumnInfo(name = "favourite")
        var isFavourite: Boolean




):Parcelable