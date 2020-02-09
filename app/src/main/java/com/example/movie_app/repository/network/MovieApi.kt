package com.example.movie_app.repository.network

import android.telecom.Call
import com.example.movie_app.model.Movie
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {

    @GET("discover/movie")
    fun getRepos(@Query("sort_by") filter : String = "popularity.desc"): Deferred<List<Movie>>
}