package com.example.movie_app.repository

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.movie_app.TestUtil
import com.example.movie_app.model.database.MovieDB
import com.example.movie_app.model.database.MovieDao
import com.example.movie_app.util.getOrAwaitValue
import kotlinx.coroutines.runBlocking
import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.*
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers
import org.junit.Before
import org.junit.Test
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import java.util.regex.Matcher

//@RunWith(RobolectricTestRunner::class)
@RunWith(AndroidJUnit4::class)
//@Config(manifest = Config.NONE)
@Config(sdk = [Config.OLDEST_SDK], manifest = Config.NONE)
class FavouriteRepositoryTest {

    @Mock
    private lateinit var context: Context
    private lateinit var favouriteRepository: FavouriteRepository
    private lateinit var db: MovieDB
    private lateinit var movieDao: MovieDao
    private lateinit var application: Application


    @get:Rule
    var instantExecutorRule = InstantTaskExecutorRule()

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        context = ApplicationProvider.getApplicationContext()
        db = MovieDB.getDatabase(context)
        //Room.inMemoryDatabaseBuilder(context, MovieDB::class.java).build()
        movieDao = db.movieDao()
        application = Application()
        favouriteRepository = FavouriteRepository(application)
    }

    @Test
    fun insertFavourite() {

   runBlocking {
       favouriteRepository.insertFavourite(TestUtil.getFakeMovie())
   }
        val favMovies = favouriteRepository.getFavouriteMovies()
        assertThat(favMovies.getOrAwaitValue().isNotEmpty(), notNullValue())

    }

    @Test
    fun deleteFavourite() {
        runBlocking {
            favouriteRepository.deleteFavourite(TestUtil.getFakeMovie())
        }
        val delMovies =  favouriteRepository.getFavouriteMovies()
        assertThat(delMovies.getOrAwaitValue().isEmpty(), Matchers.`is`(true))
    }

}