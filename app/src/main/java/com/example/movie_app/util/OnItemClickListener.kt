package com.example.movie_app.util

import com.example.movie_app.model.Movie

interface OnItemClickListener {

    fun onClickAction(movie: Movie)
}