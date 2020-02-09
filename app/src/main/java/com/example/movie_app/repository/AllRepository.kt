package com.example.movie_app.repository

import androidx.lifecycle.LiveData
import com.example.movie_app.model.Movie

interface AllRepository {

    fun getMovies(): LiveData<List<Movie>>
}