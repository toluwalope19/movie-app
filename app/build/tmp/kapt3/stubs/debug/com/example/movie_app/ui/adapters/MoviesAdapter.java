package com.example.movie_app.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002()B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u001fH\u0016J\u0018\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u001fH\u0016R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/example/movie_app/ui/adapters/MoviesAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/movie_app/model/Movie;", "Lcom/example/movie_app/ui/adapters/MoviesAdapter$MovieHolder;", "onItemClickListener", "Lcom/example/movie_app/util/OnItemClickListener;", "context", "Landroid/content/Context;", "model", "Lcom/example/movie_app/viewmodel/FavouritesViewModel;", "application", "Landroid/app/Application;", "(Lcom/example/movie_app/util/OnItemClickListener;Landroid/content/Context;Lcom/example/movie_app/viewmodel/FavouritesViewModel;Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "favMovies", "", "Lcom/example/movie_app/model/FavouriteMovie;", "getFavMovies", "()Ljava/util/List;", "favouritesViewModel", "getFavouritesViewModel", "()Lcom/example/movie_app/viewmodel/FavouritesViewModel;", "setFavouritesViewModel", "(Lcom/example/movie_app/viewmodel/FavouritesViewModel;)V", "getModel", "movie", "getMovie", "setMovie", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DiffCallback", "MovieHolder", "app_debug"})
public final class MoviesAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.movie_app.model.Movie, com.example.movie_app.ui.adapters.MoviesAdapter.MovieHolder> {
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
    public static final com.example.movie_app.ui.adapters.MoviesAdapter.DiffCallback DiffCallback = null;
    
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
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001b"}, d2 = {"Lcom/example/movie_app/ui/adapters/MoviesAdapter$MovieHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/movie_app/databinding/TopRatedBinding;", "application", "Landroid/app/Application;", "model", "Lcom/example/movie_app/viewmodel/FavouritesViewModel;", "(Lcom/example/movie_app/databinding/TopRatedBinding;Landroid/app/Application;Lcom/example/movie_app/viewmodel/FavouritesViewModel;)V", "getApplication", "()Landroid/app/Application;", "setApplication", "(Landroid/app/Application;)V", "getBinding", "()Lcom/example/movie_app/databinding/TopRatedBinding;", "setBinding", "(Lcom/example/movie_app/databinding/TopRatedBinding;)V", "getModel", "()Lcom/example/movie_app/viewmodel/FavouritesViewModel;", "setModel", "(Lcom/example/movie_app/viewmodel/FavouritesViewModel;)V", "bind", "", "item", "Lcom/example/movie_app/model/Movie;", "onItemClickListener", "Lcom/example/movie_app/util/OnItemClickListener;", "app_debug"})
    public static final class MovieHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.example.movie_app.databinding.TopRatedBinding binding;
        @org.jetbrains.annotations.NotNull()
        private android.app.Application application;
        @org.jetbrains.annotations.NotNull()
        private com.example.movie_app.viewmodel.FavouritesViewModel model;
        
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
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.movie_app.viewmodel.FavouritesViewModel getModel() {
            return null;
        }
        
        public final void setModel(@org.jetbrains.annotations.NotNull()
        com.example.movie_app.viewmodel.FavouritesViewModel p0) {
        }
        
        public MovieHolder(@org.jetbrains.annotations.NotNull()
        com.example.movie_app.databinding.TopRatedBinding binding, @org.jetbrains.annotations.NotNull()
        android.app.Application application, @org.jetbrains.annotations.NotNull()
        com.example.movie_app.viewmodel.FavouritesViewModel model) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/movie_app/ui/adapters/MoviesAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/movie_app/model/Movie;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.movie_app.model.Movie> {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.movie_app.model.Movie oldItem, @org.jetbrains.annotations.NotNull()
        com.example.movie_app.model.Movie newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.movie_app.model.Movie oldItem, @org.jetbrains.annotations.NotNull()
        com.example.movie_app.model.Movie newItem) {
            return false;
        }
        
        private DiffCallback() {
            super();
        }
    }
}