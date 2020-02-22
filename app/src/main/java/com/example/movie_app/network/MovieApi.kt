package com.example.movie_app.network

import android.telecom.Call
import com.example.movie_app.model.GetMoviesResponse
import com.example.movie_app.model.Movie
import com.example.movie_app.util.Util
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {

    @GET("discover/movie")
    fun getMoviesAsync(@Query("sort_by") filter : String = "popularity.desc",
                       @Query("api_key") api: String = Util.API_KEY ): Deferred<GetMoviesResponse>
}