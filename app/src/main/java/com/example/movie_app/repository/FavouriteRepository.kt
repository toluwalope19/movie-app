package com.example.movie_app.repository

import android.app.Application
import com.example.movie_app.model.FavouriteMovie
import com.example.movie_app.model.Movie
import com.example.movie_app.model.database.MovieDB
import com.example.movie_app.model.database.MovieDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext

class FavouriteRepository(application: Application) : CoroutineScope {


    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main

    private lateinit var movieDao: MovieDao

    init {
        val db = MovieDB.getDatabase(application)
        movieDao = db.MovieDao()
    }

    fun getFavouriteMessages() = movieDao.getFavourites()

    fun insertFavourite(movie: Movie){
        launch { insertFavouriteBackGround(movie) }
    }


    private suspend fun insertFavouriteBackGround(movie: Movie){
        withContext(Dispatchers.IO){
            movieDao.insertFavourite(movie)
        }
    }
}