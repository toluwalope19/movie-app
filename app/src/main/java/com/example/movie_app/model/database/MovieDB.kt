package com.example.movie_app.model.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.movie_app.model.FavouriteMovie

@Database(entities = [FavouriteMovie::class], version = 1)
abstract class MovieDB :RoomDatabase(){

    abstract fun MovieDao(): MovieDao

    companion object{

        private var instance: MovieDB? = null
        fun getDatabase( context: Context): MovieDB {
            if(instance == null){
                instance = Room.databaseBuilder(context.applicationContext,
                    MovieDB::class.java,"Data").build()
                return instance!!

            }
            return instance!!
        }


    }

}