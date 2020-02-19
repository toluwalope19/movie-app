package com.example.movie_app.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.amitshekhar.DebugDB
import com.example.movie_app.model.Movie
import com.example.movie_app.repository.FavouriteRepository
import com.example.movie_app.repository.Repository
import com.example.movie_app.util.NoInternetExceptions
import kotlinx.coroutines.*


class MoviesViewModel(val application: Application) : ViewModel() {
    private val repository = Repository

    private val favRepo by lazy {
        FavouriteRepository(application)
    }

    private val _isFavorite = MutableLiveData<List<Movie>>()
    val isFavorite: LiveData<List<Movie>>
        get() = _isFavorite

    private val viewModelJob = Job()

    private val viewModelScope = CoroutineScope(viewModelJob + Dispatchers.Main)



    val fireViewModelAllMovies = MutableLiveData<Boolean>(false)
    private var _allMovies = MutableLiveData<List<Movie>>()
    val allMovies
        get() = _allMovies




    /**
     * init{} is called immediately when this ViewModel is created.
     */
    init {
        viewModelScope.launch {
            try {
                fireViewModelAllMovies.value = true
                _allMovies.value = repository.getMovies()
//                Log.i("Hello", repository.getMovies().toString())
            } catch (e: NoInternetExceptions) {
            }
        }
    }

    suspend fun mapFavorite(movies: List<Movie>):List<Movie>{

          val newList =  movies.map { movie ->
                movie.isFavourite = favRepo.isFavorite(movie.id)
                movie
            }

        Log.i("Help", newList.toString())
        return newList

    }


    /**
     * Cancel all coroutines when the ViewModel is cleared
     */
    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }


}
