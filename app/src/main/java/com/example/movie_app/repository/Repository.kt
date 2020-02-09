package com.example.movie_app.repository

import androidx.lifecycle.LiveData
import com.example.movie_app.model.Movie

object Repository : AllRepository {
    override fun getMovies(): LiveData<List<Movie>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}