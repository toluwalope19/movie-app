package com.example.movie_app.repository

import android.app.Application
import android.util.Log
import androidx.lifecycle.LiveData
import com.example.movie_app.model.FavouriteMovie
import com.example.movie_app.model.Movie
import com.example.movie_app.model.database.MovieDB
import com.example.movie_app.model.database.MovieDao
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class FavouriteRepository(application: Application) : CoroutineScope {


    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main

    private var movieDao: MovieDao

    init {
        val db = MovieDB.getDatabase(application)
        movieDao = db.movieDao()
    }

    fun getFavouriteMovies() = movieDao.getFavourites()

    fun insertFavourite(movie: Movie) {
        launch { insertFavouriteBackGround(movie) }
    }

    fun deleteFavourite(movie: Movie) {
        launch { deleteFavouriteBackGround(movie) }
    }


    private suspend fun insertFavouriteBackGround(movie: Movie) {
        withContext(Dispatchers.IO) {
            movieDao.insertFavourite(movie)
        }
    }

    private suspend fun deleteFavouriteBackGround(movie: Movie) {
        withContext(Dispatchers.IO) {
            movieDao.removeFavourite(movie)
        }
    }

    suspend fun isFavorite(id: Long): Boolean {
        return withContext(Dispatchers.IO) {
            Log.i("Toly", movieDao.isFavorite(id).toString())
            movieDao.isFavorite(id).isNotEmpty()

        }


    }
}