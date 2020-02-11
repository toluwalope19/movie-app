package com.example.movie_app.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001bH\u0016J\u0018\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/example/movie_app/ui/adapters/MoviesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/movie_app/ui/adapters/MoviesAdapter$MovieHolder;", "onItemClickListener", "Lcom/example/movie_app/util/OnItemClickListener;", "context", "Landroid/content/Context;", "model", "Lcom/example/movie_app/viewmodel/FavouritesViewModel;", "(Lcom/example/movie_app/util/OnItemClickListener;Landroid/content/Context;Lcom/example/movie_app/viewmodel/FavouritesViewModel;)V", "favMovies", "", "Lcom/example/movie_app/model/FavouriteMovie;", "getFavMovies", "()Ljava/util/List;", "favouritesViewModel", "getFavouritesViewModel", "()Lcom/example/movie_app/viewmodel/FavouritesViewModel;", "setFavouritesViewModel", "(Lcom/example/movie_app/viewmodel/FavouritesViewModel;)V", "getModel", "movie", "Lcom/example/movie_app/model/Movie;", "getMovie", "setMovie", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MovieHolder", "app_debug"})
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
    
    public MoviesAdapter(@org.jetbrains.annotations.NotNull()
    com.example.movie_app.util.OnItemClickListener onItemClickListener, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.movie_app.viewmodel.FavouritesViewModel model) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u000e"}, d2 = {"Lcom/example/movie_app/ui/adapters/MoviesAdapter$MovieHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/movie_app/databinding/TopRatedBinding;", "(Lcom/example/movie_app/databinding/TopRatedBinding;)V", "getBinding", "()Lcom/example/movie_app/databinding/TopRatedBinding;", "setBinding", "bind", "", "item", "Lcom/example/movie_app/model/Movie;", "onItemClickListener", "Lcom/example/movie_app/util/OnItemClickListener;", "app_debug"})
    public static final class MovieHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.example.movie_app.databinding.TopRatedBinding binding;
        
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
        
        public MovieHolder(@org.jetbrains.annotations.NotNull()
        com.example.movie_app.databinding.TopRatedBinding binding) {
            super(null);
        }
    }
}