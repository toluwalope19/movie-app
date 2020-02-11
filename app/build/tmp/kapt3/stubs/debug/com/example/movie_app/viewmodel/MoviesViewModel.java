package com.example.movie_app.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0014R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/movie_app/viewmodel/MoviesViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_allMovies", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/movie_app/model/Movie;", "allMovies", "getAllMovies", "()Landroidx/lifecycle/MutableLiveData;", "isLike", "", "repository", "Lcom/example/movie_app/repository/Repository;", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "likeMovie", "", "onCleared", "app_debug"})
public final class MoviesViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.movie_app.repository.Repository repository = null;
    private final kotlinx.coroutines.CompletableJob viewModelJob = null;
    private final kotlinx.coroutines.CoroutineScope viewModelScope = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLike = null;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.movie_app.model.Movie>> _allMovies;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLike() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.movie_app.model.Movie>> getAllMovies() {
        return null;
    }
    
    private final void likeMovie() {
    }
    
    /**
     * Cancel all coroutines when the ViewModel is cleared
     */
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public MoviesViewModel() {
        super();
    }
}