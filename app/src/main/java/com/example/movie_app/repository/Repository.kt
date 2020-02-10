package com.example.movie_app.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.movie_app.app.Injection
import com.example.movie_app.model.GetMoviesResponse
import com.example.movie_app.model.Movie
import kotlinx.coroutines.*


object Repository {

    private val api = Injection.provideMovieApi()




        suspend fun getMovies():List<Movie>? {
            var data : List<Movie>? = null
            withContext(Dispatchers.IO) {
                try {
                    val getMovies = api.getMoviesAsync()
                    val listResult = getMovies.await()
                    data= listResult.movies
                } catch (t: Throwable) {
                    data = null
                    Log.e("Repository", t.message!!)
                }
            }
            return data
        }
    }

