package com.example.movie_app.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.movie_app.util.getOrAwaitValue
import org.hamcrest.CoreMatchers
import org.hamcrest.Matcher
import org.hamcrest.Matchers
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import org.junit.runner.RunWith
import org.robolectric.annotation.Config


@RunWith(AndroidJUnit4::class)
@Config(sdk = [Config.OLDEST_SDK], manifest = Config.NONE)
class MoviesViewModelTest {

    @get:Rule
    var instantExecutor = InstantTaskExecutorRule()
    private lateinit var viewModel: MoviesViewModel
    @Before
    fun setUp() {
        viewModel = MoviesViewModel(ApplicationProvider.getApplicationContext())
    }

    @Test
    fun getAllMovies() {
        val value = viewModel.allMovies
        value.observeForever {
            assertThat(it, CoreMatchers.not(Matchers.nullValue()))
        }


    }

    @Test
    fun checkIfViewModelFired(){
        val result = viewModel.fireViewModelAllMovies
        assertThat(result.getOrAwaitValue(), Matchers.`is`(true))
    }

    @Test
    fun mapFavorite() {

    }
}