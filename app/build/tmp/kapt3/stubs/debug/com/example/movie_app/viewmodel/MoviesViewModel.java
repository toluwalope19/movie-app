package com.example.movie_app.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\"H\u0014R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00168F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006#"}, d2 = {"Lcom/example/movie_app/viewmodel/MoviesViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_allMovies", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/movie_app/model/Movie;", "_isFavorite", "allMovies", "getAllMovies", "()Landroidx/lifecycle/MutableLiveData;", "getApplication", "()Landroid/app/Application;", "favRepo", "Lcom/example/movie_app/repository/FavouriteRepository;", "getFavRepo", "()Lcom/example/movie_app/repository/FavouriteRepository;", "favRepo$delegate", "Lkotlin/Lazy;", "isFavorite", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "repository", "Lcom/example/movie_app/repository/Repository;", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "mapFavorite", "movies", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCleared", "", "app_debug"})
public final class MoviesViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.movie_app.repository.Repository repository = null;
    private final kotlin.Lazy favRepo$delegate = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.movie_app.model.Movie>> _isFavorite = null;
    private final kotlinx.coroutines.CompletableJob viewModelJob = null;
    private final kotlinx.coroutines.CoroutineScope viewModelScope = null;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.movie_app.model.Movie>> _allMovies;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application application = null;
    
    private final com.example.movie_app.repository.FavouriteRepository getFavRepo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.movie_app.model.Movie>> isFavorite() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.movie_app.model.Movie>> getAllMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object mapFavorite(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.movie_app.model.Movie> movies, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.movie_app.model.Movie>> p1) {
        return null;
    }
    
    /**
     * Cancel all coroutines when the ViewModel is cleared
     */
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApplication() {
        return null;
    }
    
    public MoviesViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
}