package com.example.movie_app.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00110\u0010J\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/movie_app/viewmodel/FavouritesViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "repository", "Lcom/example/movie_app/repository/FavouriteRepository;", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "addFavourites", "", "movie", "Lcom/example/movie_app/model/Movie;", "getMovies", "Landroidx/lifecycle/LiveData;", "", "removeFavourite", "app_debug"})
public final class FavouritesViewModel extends androidx.lifecycle.AndroidViewModel {
    private com.example.movie_app.repository.FavouriteRepository repository;
    private final kotlinx.coroutines.CompletableJob viewModelJob = null;
    private final kotlinx.coroutines.CoroutineScope viewModelScope = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.movie_app.model.Movie>> getMovies() {
        return null;
    }
    
    public final void addFavourites(@org.jetbrains.annotations.NotNull()
    com.example.movie_app.model.Movie movie) {
    }
    
    public final void removeFavourite(@org.jetbrains.annotations.NotNull()
    com.example.movie_app.model.Movie movie) {
    }
    
    public FavouritesViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}