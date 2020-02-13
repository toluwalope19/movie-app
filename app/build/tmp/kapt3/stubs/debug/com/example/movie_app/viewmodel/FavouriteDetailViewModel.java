package com.example.movie_app.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/movie_app/viewmodel/FavouriteDetailViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "repository", "Lcom/example/movie_app/repository/FavouriteRepository;", "addFavourites", "", "movie", "Lcom/example/movie_app/model/Movie;", "removeFavourite", "app_debug"})
public final class FavouriteDetailViewModel extends androidx.lifecycle.AndroidViewModel {
    private com.example.movie_app.repository.FavouriteRepository repository;
    
    public final void addFavourites(@org.jetbrains.annotations.NotNull()
    com.example.movie_app.model.Movie movie) {
    }
    
    public final void removeFavourite(@org.jetbrains.annotations.NotNull()
    com.example.movie_app.model.Movie movie) {
    }
    
    public FavouriteDetailViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}