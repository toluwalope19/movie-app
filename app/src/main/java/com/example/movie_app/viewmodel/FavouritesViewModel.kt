package com.example.movie_app.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.movie_app.model.Movie
import com.example.movie_app.repository.FavouriteRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job

class FavouritesViewModel(application: Application) : AndroidViewModel(application) {

    private var repository = FavouriteRepository(application)


    private val viewModelJob = Job()

    private val viewModelScope = CoroutineScope(viewModelJob + Dispatchers.Main)


      fun getMovies()   = repository.getFavouriteMovies()

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
