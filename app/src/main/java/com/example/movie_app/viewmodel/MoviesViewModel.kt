package com.example.movie_app.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.movie_app.model.Movie
import com.example.movie_app.repository.Repository
import com.example.movie_app.util.NoInternetExceptions
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch


class MoviesViewModel : ViewModel() {
    private val repository = Repository

    private val viewModelJob = Job()

    private val viewModelScope = CoroutineScope(viewModelJob + Dispatchers.Main)

    val error = MutableLiveData<String>()

    private var _allMovies = MutableLiveData<List<Movie>>()
        val allMovies
            get() =_allMovies



    /**
     * init{} is called immediately when this ViewModel is created.
     */
        init {
         viewModelScope.launch {
             try {
                 _allMovies.value =  repository.getMovies()

                 Log.i("Hello", repository.getMovies().toString())
             }catch (e: NoInternetExceptions){

             }

            }
        }


    /**
     * Cancel all coroutines when the ViewModel is cleared
     */
    override fun onCleared() {
        super.onCleared()
        viewModelJob.cancel()
    }


//    class Factory(val app: Application) : ViewModelProvider.Factory {
//        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
//            if (modelClass.isAssignableFrom(MoviesViewModel::class.java)) {
//                @Suppress("UNCHECKED_CAST")
//                return MoviesViewModel(repository = Repository) as T
//            }
//            throw IllegalArgumentException("Unable to construct viewmodel")
//        }
//    }


}
