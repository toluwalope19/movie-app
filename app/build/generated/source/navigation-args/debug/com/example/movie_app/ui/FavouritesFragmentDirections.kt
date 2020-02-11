package com.example.movie_app.ui

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.movie_app.R
import com.example.movie_app.model.Movie
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

class FavouritesFragmentDirections private constructor() {
  private data class ActionFavouritesFragmentToMovieDetailsFragment(
    val movie: Movie
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_favouritesFragment_to_movieDetailsFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(Movie::class.java)) {
        result.putParcelable("movie", this.movie as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(Movie::class.java)) {
        result.putSerializable("movie", this.movie as Serializable)
      } else {
        throw UnsupportedOperationException(Movie::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  private data class ActionFavouritesFragmentToFavouriteDetailFragment(
    val movie: Movie
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_favouritesFragment_to_favouriteDetailFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(Movie::class.java)) {
        result.putParcelable("movie", this.movie as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(Movie::class.java)) {
        result.putSerializable("movie", this.movie as Serializable)
      } else {
        throw UnsupportedOperationException(Movie::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  companion object {
    fun actionFavouritesFragmentToMoviesFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_favouritesFragment_to_moviesFragment)

    fun actionFavouritesFragmentToMovieDetailsFragment(movie: Movie): NavDirections =
        ActionFavouritesFragmentToMovieDetailsFragment(movie)

    fun actionFavouritesFragmentToFavouriteDetailFragment(movie: Movie): NavDirections =
        ActionFavouritesFragmentToFavouriteDetailFragment(movie)
  }
}
