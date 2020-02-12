package com.example.movie_app.app

import android.content.Context
import android.net.ConnectivityManager
import com.example.movie_app.repository.Repository
import com.example.movie_app.repository.network.MovieApi
import com.example.movie_app.repository.network.NetworkConnectionInterceptor
import com.example.movie_app.util.Util
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Injection {


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


    fun isNetworkAvailable(context: Context): Boolean? {

        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork = cm.activeNetworkInfo
        if (activeNetwork != null) {
            if (activeNetwork.type == ConnectivityManager.TYPE_WIFI) {
                return true
            } else if (activeNetwork.type == ConnectivityManager.TYPE_MOBILE) {
                return true
            }
        } else {
            return false
        }
        return false
    }
}