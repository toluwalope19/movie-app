package com.example.movie_app.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.movie_app.model.FavouriteMovie
import com.example.movie_app.model.Movie

@Dao
interface MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFavourite(movie: Movie)

    @Query("SELECT * from movieTable ORDER BY id ASC")
    fun getFavourites() : LiveData<List<Movie>>

    @Query("SELECT * from movieTable where id = :id")
    fun isFavorite(id: Long) : List<Movie>

    @Delete
    suspend fun removeFavourite(movie: Movie)
}