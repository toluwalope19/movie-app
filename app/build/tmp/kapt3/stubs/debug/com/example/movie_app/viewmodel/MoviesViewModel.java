package com.example.movie_app.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\b\u0010(\u001a\u00020)H\u0014R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000fR\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u0015R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006*"}, d2 = {"Lcom/example/movie_app/viewmodel/MoviesViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_allMovies", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/movie_app/model/Movie;", "_dataLoading", "", "_forceUpdate", "_isFavorite", "allMovies", "getAllMovies", "()Landroidx/lifecycle/MutableLiveData;", "getApplication", "()Landroid/app/Application;", "dataLoading", "Landroidx/lifecycle/LiveData;", "getDataLoading", "()Landroidx/lifecycle/LiveData;", "favRepo", "Lcom/example/movie_app/repository/FavouriteRepository;", "getFavRepo", "()Lcom/example/movie_app/repository/FavouriteRepository;", "favRepo$delegate", "Lkotlin/Lazy;", "fireViewModelAllMovies", "getFireViewModelAllMovies", "isFavorite", "repository", "Lcom/example/movie_app/repository/Repository;", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "mapFavorite", "movies", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCleared", "", "app_debug"})
public final class MoviesViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.movie_app.repository.Repository repository = null;
    private final kotlin.Lazy favRepo$delegate = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _forceUpdate = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _dataLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> dataLoading = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.movie_app.model.Movie>> _isFavorite = null;
    private final kotlinx.coroutines.CompletableJob viewModelJob = null;
    private final kotlinx.coroutines.CoroutineScope viewModelScope = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> fireViewModelAllMovies = null;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.movie_app.model.Movie>> _allMovies;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application application = null;
    
    private final com.example.movie_app.repository.FavouriteRepository getFavRepo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getDataLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.movie_app.model.Movie>> isFavorite() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getFireViewModelAllMovies() {
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