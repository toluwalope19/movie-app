package com.example.movie_app.model.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u000bH\'J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\'\u00a8\u0006\r"}, d2 = {"Lcom/example/movie_app/model/database/MovieDao;", "", "getFavourites", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/movie_app/model/Movie;", "insertFavourite", "", "movie", "isFavorite", "id", "", "removeFavourite", "app_debug"})
public abstract interface MovieDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertFavourite(@org.jetbrains.annotations.NotNull()
    com.example.movie_app.model.Movie movie);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from movieTable ORDER BY id ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.movie_app.model.Movie>> getFavourites();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from movieTable where id = :id")
    public abstract java.util.List<com.example.movie_app.model.Movie> isFavorite(long id);
    
    @androidx.room.Delete()
    public abstract void removeFavourite(@org.jetbrains.annotations.NotNull()
    com.example.movie_app.model.Movie movie);
}