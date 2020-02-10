package com.example.movie_app.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.movie_app.app.Injection
import com.example.movie_app.model.Movie
import kotlinx.coroutines.*


object Repository : AllRepository {

    private val api = Injection.provideMovieApi()
    override fun getMovies(): LiveData<List<Movie>> {

        val liveData = MutableLiveData<List<Movie>>()
        val status = MutableLiveData<String>()

        suspend fun getMovies() {
            withContext(Dispatchers.IO) {

                val getMovies = api.getMovies()
                try {
                    val listResult = getMovies.await()
                    liveData.value = listResult
                } catch (t: Throwable) {
                    status.value = "Failure: ${t.message}"
                }
            }

        }
        return liveData
    }
}
