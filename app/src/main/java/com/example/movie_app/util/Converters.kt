package com.example.movie_app.util

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.util.*


class ListIntTypeConverters {


        @TypeConverter
        fun fromListLisr(list: List<Int>): String {
            val gson = Gson()
            return gson.toJson(list)
        }

}