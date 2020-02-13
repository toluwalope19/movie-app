package com.example.movie_app.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.example.movie_app.model.Movie
import com.example.movie_app.repository.FavouriteRepository

class MovieDetailsViewModel(application: Application) : AndroidViewModel(application) {
    private var repository = FavouriteRepository(application)



    fun getMessages() = repository.getFavouriteMessages()

    fun addFavourites(movie: Movie) {repository.insertFavourite(movie)}

    fun removeFavourite(movie: Movie){
        repository.deleteFavourite(movie)
    }
}
