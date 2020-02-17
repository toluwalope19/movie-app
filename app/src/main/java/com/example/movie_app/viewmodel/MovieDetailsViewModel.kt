package com.example.movie_app.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.movie_app.model.Movie
import com.example.movie_app.repository.FavouriteRepository

class MovieDetailsViewModel(application: Application) : AndroidViewModel(application) {
    private var repository = FavouriteRepository(application)



    fun getMessages() = repository.getFavouriteMovies()

    fun addFavourites(movie: Movie) {repository.insertFavourite(movie)}

    fun removeFavourite(movie: Movie){
        repository.deleteFavourite(movie)
    }
}
