package com.example.movie_app.model.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.movie_app.model.FavouriteMovie
import com.example.movie_app.model.Movie

@Dao
interface MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertFavourite(movie: Movie)

    @Query("SELECT * from movieTable ORDER BY id ASC")
    fun getFavourites() : LiveData<List<Movie>>
}