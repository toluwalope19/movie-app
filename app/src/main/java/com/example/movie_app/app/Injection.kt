package com.example.movie_app.app

import com.example.movie_app.repository.AllRepository
import com.example.movie_app.repository.Repository
import com.example.movie_app.repository.network.MovieApi
import com.example.movie_app.util.Util
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Injection {
    fun provideRepository(): AllRepository = Repository

    private fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Util.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .client(httpClient)
            .build()
    }

       private val httpClient = OkHttpClient()


    fun provideMovieApi(): MovieApi {
        return provideRetrofit().create(MovieApi::class.java)
    }
}