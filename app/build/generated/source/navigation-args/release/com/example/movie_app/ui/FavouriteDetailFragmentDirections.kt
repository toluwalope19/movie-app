package com.example.movie_app.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.movie_app.R

class FavouriteDetailFragmentDirections private constructor() {
  companion object {
    fun actionFavouriteDetailFragmentToFavouritesFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_favouriteDetailFragment_to_favouritesFragment)
  }
}
