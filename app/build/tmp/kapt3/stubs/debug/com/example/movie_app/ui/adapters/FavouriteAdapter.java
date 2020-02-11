package com.example.movie_app.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/movie_app/ui/adapters/FavouriteAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/movie_app/ui/adapters/FavouriteAdapter$FavouriteHolder;", "onFavouritClickListener", "Lcom/example/movie_app/util/OnFavouritClickListener;", "context", "Landroid/content/Context;", "(Lcom/example/movie_app/util/OnFavouritClickListener;Landroid/content/Context;)V", "favMovies", "", "Lcom/example/movie_app/model/Movie;", "getFavMovies", "()Ljava/util/List;", "setFavMovies", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "FavouriteHolder", "app_debug"})
public final class FavouriteAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.movie_app.ui.adapters.FavouriteAdapter.FavouriteHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.movie_app.model.Movie> favMovies;
    private final com.example.movie_app.util.OnFavouritClickListener onFavouritClickListener = null;
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.movie_app.model.Movie> getFavMovies() {
        return null;
    }
    
    public final void setFavMovies(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.movie_app.model.Movie> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.movie_app.ui.adapters.FavouriteAdapter.FavouriteHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.movie_app.ui.adapters.FavouriteAdapter.FavouriteHolder holder, int position) {
    }
    
    public FavouriteAdapter(@org.jetbrains.annotations.NotNull()
    com.example.movie_app.util.OnFavouritClickListener onFavouritClickListener, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u000e"}, d2 = {"Lcom/example/movie_app/ui/adapters/FavouriteAdapter$FavouriteHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/movie_app/databinding/FavouritesTabBinding;", "(Lcom/example/movie_app/databinding/FavouritesTabBinding;)V", "getBinding", "()Lcom/example/movie_app/databinding/FavouritesTabBinding;", "setBinding", "bind", "", "item", "Lcom/example/movie_app/model/Movie;", "onFavouritClickListener", "Lcom/example/movie_app/util/OnFavouritClickListener;", "app_debug"})
    public static final class FavouriteHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.example.movie_app.databinding.FavouritesTabBinding binding;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.movie_app.model.Movie item, @org.jetbrains.annotations.NotNull()
        com.example.movie_app.util.OnFavouritClickListener onFavouritClickListener) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.movie_app.databinding.FavouritesTabBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.example.movie_app.databinding.FavouritesTabBinding p0) {
        }
        
        public FavouriteHolder(@org.jetbrains.annotations.NotNull()
        com.example.movie_app.databinding.FavouritesTabBinding binding) {
            super(null);
        }
    }
}