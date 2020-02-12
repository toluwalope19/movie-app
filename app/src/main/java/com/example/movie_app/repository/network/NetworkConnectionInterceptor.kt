package com.example.movie_app.repository.network

import android.annotation.TargetApi
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import com.example.movie_app.util.NoInternetExceptions
import okhttp3.Interceptor
import okhttp3.Response


@TargetApi(23)
class NetworkConnectionInterceptor(context: Context) : Interceptor {

    private val applicationContext = context.applicationContext

    override fun intercept(chain: Interceptor.Chain): Response {

        if(!isInternetAvailable())
            throw NoInternetExceptions("Make sure you're connected to the internet")
        return chain.proceed(chain.request())
    }

    private fun isInternetAvailable(): Boolean{
        var result = false
        val connectivityManager = applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?
        connectivityManager?.let {
            it.getNetworkCapabilities(connectivityManager.activeNetwork)?.apply {
                result = when{
                    hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
                    hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true

                    else -> false
                }
            }
        }
        return result
    }
}