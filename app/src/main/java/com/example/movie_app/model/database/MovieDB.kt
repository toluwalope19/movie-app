package com.example.movie_app.model.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.movie_app.model.FavouriteMovie
import com.example.movie_app.model.Movie
import com.example.movie_app.util.ListIntTypeConverters

@Database(entities = [Movie::class], version = 1)
@TypeConverters(ListIntTypeConverters::class)
abstract class MovieDB :RoomDatabase(){

    abstract fun MovieDao(): MovieDao

    companion object{

        private var instance: MovieDB? = null
        fun getDatabase( context: Context): MovieDB {
            if(instance == null){
                instance = Room.databaseBuilder(context,
                    MovieDB::class.java,"Data").build()
                return instance!!

            }
            return instance!!
        }


    }

}