package com.example.movie_app.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001fH\u0016J\u0018\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001fH\u0016R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/example/movie_app/ui/adapters/MoviesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/movie_app/ui/adapters/MoviesAdapter$MovieHolder;", "onItemClickListener", "Lcom/example/movie_app/util/OnItemClickListener;", "context", "Landroid/content/Context;", "model", "Lcom/example/movie_app/viewmodel/FavouritesViewModel;", "application", "Landroid/app/Application;", "(Lcom/example/movie_app/util/OnItemClickListener;Landroid/content/Context;Lcom/example/movie_app/viewmodel/FavouritesViewModel;Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "favMovies", "", "Lcom/example/movie_app/model/FavouriteMovie;", "getFavMovies", "()Ljava/util/List;", "favouritesViewModel", "getFavouritesViewModel", "()Lcom/example/movie_app/viewmodel/FavouritesViewModel;", "setFavouritesViewModel", "(Lcom/example/movie_app/viewmodel/FavouritesViewModel;)V", "getModel", "movie", "Lcom/example/movie_app/model/Movie;", "getMovie", "setMovie", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MovieHolder", "app_debug"})
public final class MoviesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.movie_app.ui.adapters.MoviesAdapter.MovieHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.movie_app.model.Movie> movie;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.movie_app.model.FavouriteMovie> favMovies = null;
    @org.jetbrains.annotations.NotNull()
    public com.example.movie_app.viewmodel.FavouritesViewModel favouritesViewModel;
    private final com.example.movie_app.util.OnItemClickListener onItemClickListener = null;
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.movie_app.viewmodel.FavouritesViewModel model = null;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application application = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.movie_app.model.Movie> getMovie() {
        return null;
    }
    
    public final void setMovie(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.movie_app.model.Movie> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.movie_app.model.FavouriteMovie> getFavMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.movie_app.viewmodel.FavouritesViewModel getFavouritesViewModel() {
        return null;
    }
    
    public final void setFavouritesViewModel(@org.jetbrains.annotations.NotNull()
    com.example.movie_app.viewmodel.FavouritesViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.movie_app.ui.adapters.MoviesAdapter.MovieHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.movie_app.ui.adapters.MoviesAdapter.MovieHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.movie_app.viewmodel.FavouritesViewModel getModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApplication() {
        return null;
    }
    
    public MoviesAdapter(@org.jetbrains.annotations.NotNull()
    com.example.movie_app.util.OnItemClickListener onItemClickListener, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.movie_app.viewmodel.FavouritesViewModel model, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lcom/example/movie_app/ui/adapters/MoviesAdapter$MovieHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/movie_app/databinding/TopRatedBinding;", "application", "Landroid/app/Application;", "(Lcom/example/movie_app/databinding/TopRatedBinding;Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "setApplication", "(Landroid/app/Application;)V", "getBinding", "()Lcom/example/movie_app/databinding/TopRatedBinding;", "setBinding", "(Lcom/example/movie_app/databinding/TopRatedBinding;)V", "bind", "", "item", "Lcom/example/movie_app/model/Movie;", "onItemClickListener", "Lcom/example/movie_app/util/OnItemClickListener;", "app_debug"})
    public static final class MovieHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.example.movie_app.databinding.TopRatedBinding binding;
        @org.jetbrains.annotations.NotNull()
        private android.app.Application application;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.movie_app.model.Movie item, @org.jetbrains.annotations.NotNull()
        com.example.movie_app.util.OnItemClickListener onItemClickListener) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.movie_app.databinding.TopRatedBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.example.movie_app.databinding.TopRatedBinding p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.app.Application getApplication() {
            return null;
        }
        
        public final void setApplication(@org.jetbrains.annotations.NotNull()
        android.app.Application p0) {
        }
        
        public MovieHolder(@org.jetbrains.annotations.NotNull()
        com.example.movie_app.databinding.TopRatedBinding binding, @org.jetbrains.annotations.NotNull()
        android.app.Application application) {
            super(null);
        }
    }
}