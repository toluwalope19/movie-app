package com.example.movie_app.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/movie_app/app/Injection;", "", "()V", "httpClient", "Lokhttp3/OkHttpClient;", "isNetworkAvailable", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)Ljava/lang/Boolean;", "provideMovieApi", "Lcom/example/movie_app/repository/network/MovieApi;", "provideRetrofit", "Lretrofit2/Retrofit;", "app_debug"})
public final class Injection {
    private static final okhttp3.OkHttpClient httpClient = null;
    public static final com.example.movie_app.app.Injection INSTANCE = null;
    
    private final retrofit2.Retrofit provideRetrofit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.movie_app.repository.network.MovieApi provideMovieApi() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isNetworkAvailable(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private Injection() {
        super();
    }
}