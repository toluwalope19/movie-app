package com.example.movie_app

import com.example.movie_app.model.Movie

object TestUtil {

    fun getFakeMovie(): Movie{
        val movie = Movie(419709,
            "Ad Astra",
            "/xBHvZcjRiWyobQ9kxBhO6B2dtRI.jpg",
            "2019-09-17",6.0,
            "The near future, a time when both hope and hardships drive humanity to look to the stars and beyond. " +
                    "While a mysterious phenomenon menaces to destroy life on planet Earth, " +
                    "astronaut Roy McBride undertakes a mission across the immensity of space " +
                    "and its many perils to uncover the truth about " +
                    "a lost expedition that decades before boldly faced emptiness and silence in search of the unknown.",
            "/5BwqwxMEjeFtdknRV792Svo0K1v.jpg",false)

        return movie
    }
}