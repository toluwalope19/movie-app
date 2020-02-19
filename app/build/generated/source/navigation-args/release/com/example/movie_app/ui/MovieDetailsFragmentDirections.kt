package com.example.movie_app.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.movie_app.R

class MovieDetailsFragmentDirections private constructor() {
  companion object {
    fun actionMovieDetailsFragmentToMoviesFragment2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_movieDetailsFragment_to_moviesFragment2)

    fun actionMovieDetailsFragmentToMoviesFragment3(): NavDirections =
        ActionOnlyNavDirections(R.id.action_movieDetailsFragment_to_moviesFragment3)
  }
}
