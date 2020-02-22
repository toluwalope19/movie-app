package com.example.movie_app.repository

import android.util.Log
import com.example.movie_app.network.Service
import com.example.movie_app.model.Movie
import kotlinx.coroutines.*


object NetworkRepository {



    private val api = Service.provideMovieApi()

        suspend fun getMovies(): List<Movie>{
            var data=  listOf<Movie>()
            withContext(Dispatchers.IO) {
                try {
                    val getMovies = api.getMoviesAsync()
                    val listResult = getMovies.await()
                    data = listResult.movies
                    Log.d("check", data.toString())
                } catch (t: Throwable) {
                    Log.e("Repository", t.message!!)
                }
            }
            return data

        }
    }



