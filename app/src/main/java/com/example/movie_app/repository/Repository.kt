package com.example.movie_app.repository

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.paging.PageKeyedDataSource
import com.example.movie_app.app.Injection
import com.example.movie_app.model.Movie
import com.example.movie_app.ui.MoviesFragment
import com.example.movie_app.util.Util
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.*


object Repository {

    private val api = Injection.provideMovieApi()



        suspend fun getMovies(): List<Movie>? {
            var data: List<Movie>? = null
            withContext(Dispatchers.IO) {
                try {
                    val getMovies = api.getMoviesAsync()
                    val listResult = getMovies.await()
                    data = listResult.movies
                } catch (t: Throwable) {
                    Log.e("Repository", t.message!!)

                }
            }
            return data

        }
    }



