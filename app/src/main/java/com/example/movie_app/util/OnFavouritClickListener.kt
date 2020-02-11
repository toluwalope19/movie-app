package com.example.movie_app.util

import com.example.movie_app.model.FavouriteMovie
import com.example.movie_app.model.Movie

interface OnFavouritClickListener {

    fun onClickFavouriteMovie(movie: Movie)
}