package com.example.movie_app.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.movie_app.model.FavouriteMovie
import com.example.movie_app.model.Movie
import com.example.movie_app.repository.FavouriteRepository
import com.example.movie_app.repository.Repository

class FavouritesViewModel(application: Application) : AndroidViewModel(application) {

    private var repository = FavouriteRepository(application)

      fun getMessages() = repository.getFavouriteMessages()

       fun addFavourites(movie: Movie) {repository.insertFavourite(movie)}

        fun removeFavourite(movie: Movie){
            repository.deleteFavourite(movie)
        }


//        class Factory(val app: Application) : ViewModelProvider.Factory {
//        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
//            if (modelClass.isAssignableFrom(FavouritesViewModel::class.java)) {
//                @Suppress("UNCHECKED_CAST")
//                return FavouritesViewModel(app) as T
//            }
//            throw IllegalArgumentException("Unable to construct viewmodel")
//        }
//    }


}
