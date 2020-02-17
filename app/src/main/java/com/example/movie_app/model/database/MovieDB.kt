package com.example.movie_app.model.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.movie_app.model.FavouriteMovie
import com.example.movie_app.model.Movie
import com.example.movie_app.util.DbTypeConverters

@Database(entities = [Movie::class], version = 1)
@TypeConverters(DbTypeConverters::class)
abstract class MovieDB :RoomDatabase(){

    abstract fun movieDao(): MovieDao

    companion object{

        private var instance: MovieDB? = null
        fun getDatabase( context: Context): MovieDB {
            if(instance == null){
                instance = Room.databaseBuilder(context,
                    MovieDB::class.java,"Data")
                    .allowMainThreadQueries()
                    .build()
                return instance!!

            }
            return instance!!
        }


    }

}