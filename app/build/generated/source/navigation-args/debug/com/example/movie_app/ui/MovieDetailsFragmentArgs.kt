package com.example.movie_app.ui

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.example.movie_app.model.Movie
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class MovieDetailsFragmentArgs(
  val movie: Movie
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  fun toBundle(): Bundle {
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

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): MovieDetailsFragmentArgs {
      bundle.setClassLoader(MovieDetailsFragmentArgs::class.java.classLoader)
      val __movie : Movie?
      if (bundle.containsKey("movie")) {
        if (Parcelable::class.java.isAssignableFrom(Movie::class.java) ||
            Serializable::class.java.isAssignableFrom(Movie::class.java)) {
          __movie = bundle.get("movie") as Movie?
        } else {
          throw UnsupportedOperationException(Movie::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__movie == null) {
          throw IllegalArgumentException("Argument \"movie\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"movie\" is missing and does not have an android:defaultValue")
      }
      return MovieDetailsFragmentArgs(__movie)
    }
  }
}
