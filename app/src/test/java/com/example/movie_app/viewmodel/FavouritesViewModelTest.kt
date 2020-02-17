package com.example.movie_app.viewmodel

import android.app.Application
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.movie_app.model.Movie
import org.junit.After
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import org.junit.rules.TestRule
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations

class FavouritesViewModelTest {

    private lateinit var favouritesViewModel: FavouritesViewModel

    @get:Rule
    var rule : TestRule = InstantTaskExecutorRule()

    @Mock
    lateinit var mockGenerator : Movie

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
//        favouritesViewModel = FavouritesViewModel(ApplicationProvider.)
    }

    @After
    fun tearDown() {
    }

    @Test
    fun getMessages() {

    }

    @Test
    fun addFavourites() {
        val movies = Movie(419709,
            "Ad Astra",
            "/xBHvZcjRiWyobQ9kxBhO6B2dtRI.jpg",
            "2019-09-17",6.0,
            "The near future, a time when both hope and hardships drive humanity to look to the stars and beyond. " +
                    "While a mysterious phenomenon menaces to destroy life on planet Earth, " +
                    "astronaut Roy McBride undertakes a mission across the immensity of space " +
                    "and its many perils to uncover the truth about " +
                    "a lost expedition that decades before boldly faced emptiness and silence in search of the unknown.",
            "/5BwqwxMEjeFtdknRV792Svo0K1v.jpg",false)

        `when`(mockGenerator.copy()).thenReturn(movies)

           favouritesViewModel.addFavourites(movies)

        assertEquals(movies,favouritesViewModel.addFavourites(movies))
    }

    @Test
    fun removeFavourite() {
    }
}