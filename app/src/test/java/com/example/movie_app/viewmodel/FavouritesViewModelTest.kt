package com.example.movie_app.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.movie_app.model.Movie
import com.example.movie_app.repository.FavouriteRepository
import com.example.movie_app.util.getOrAwaitValue
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config

@RunWith(AndroidJUnit4::class)
@Config(sdk = [Config.OLDEST_SDK], manifest = Config.NONE)
class FavouritesViewModelTest {

    @get:Rule
    var instantExecutor = InstantTaskExecutorRule()
    private lateinit var viewModel : FavouritesViewModel
    private lateinit var repository: FavouriteRepository

    @Before
    fun setUp() {
        viewModel = FavouritesViewModel(ApplicationProvider.getApplicationContext())
        repository = FavouriteRepository(ApplicationProvider.getApplicationContext())
        val movie = Movie(419704,"Ad Astra","/xBHvZcjRiWyobQ9kxBhO6B2dtRI.jpg","2019-09-17",6.0,"The near future","/5BwqwxMEjeFtdknRV792Svo0K1v.jpg",false)
        viewModel.addFavourites(movie)
    }

    @Test
    fun getMovies() {
    }

    @Test
    fun addFavourites() {

        val result = viewModel.getMovies().getOrAwaitValue()
        assertThat(result, CoreMatchers.not(Matchers.nullValue()))
    }

}