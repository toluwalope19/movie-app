package com.example.movie_app.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 12\u00020\u0001:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J&\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u0010)\u001a\u0004\u0018\u00010*H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u00062"}, d2 = {"Lcom/example/movie_app/ui/MoviesFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/example/movie_app/ui/adapters/MoviesAdapter;", "getAdapter", "()Lcom/example/movie_app/ui/adapters/MoviesAdapter;", "setAdapter", "(Lcom/example/movie_app/ui/adapters/MoviesAdapter;)V", "binding", "Lcom/example/movie_app/databinding/MoviesFragmentBinding;", "getBinding", "()Lcom/example/movie_app/databinding/MoviesFragmentBinding;", "setBinding", "(Lcom/example/movie_app/databinding/MoviesFragmentBinding;)V", "factory", "Lcom/example/movie_app/viewmodel/MovieViewModelFactory;", "getFactory", "()Lcom/example/movie_app/viewmodel/MovieViewModelFactory;", "setFactory", "(Lcom/example/movie_app/viewmodel/MovieViewModelFactory;)V", "favModel", "Lcom/example/movie_app/viewmodel/FavouritesViewModel;", "getFavModel", "()Lcom/example/movie_app/viewmodel/FavouritesViewModel;", "setFavModel", "(Lcom/example/movie_app/viewmodel/FavouritesViewModel;)V", "swipeRefreshLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "getSwipeRefreshLayout", "()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "setSwipeRefreshLayout", "(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V", "viewModel", "Lcom/example/movie_app/viewmodel/MoviesViewModel;", "getViewModel", "()Lcom/example/movie_app/viewmodel/MoviesViewModel;", "setViewModel", "(Lcom/example/movie_app/viewmodel/MoviesViewModel;)V", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Companion", "app_debug"})
public final class MoviesFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public com.example.movie_app.viewmodel.MoviesViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    public com.example.movie_app.viewmodel.MovieViewModelFactory factory;
    @org.jetbrains.annotations.NotNull()
    public com.example.movie_app.ui.adapters.MoviesAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    public com.example.movie_app.viewmodel.FavouritesViewModel favModel;
    @org.jetbrains.annotations.NotNull()
    public androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout;
    @org.jetbrains.annotations.NotNull()
    public com.example.movie_app.databinding.MoviesFragmentBinding binding;
    public static final com.example.movie_app.ui.MoviesFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.movie_app.viewmodel.MoviesViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.example.movie_app.viewmodel.MoviesViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.movie_app.viewmodel.MovieViewModelFactory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull()
    com.example.movie_app.viewmodel.MovieViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.movie_app.ui.adapters.MoviesAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.example.movie_app.ui.adapters.MoviesAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.movie_app.viewmodel.FavouritesViewModel getFavModel() {
        return null;
    }
    
    public final void setFavModel(@org.jetbrains.annotations.NotNull()
    com.example.movie_app.viewmodel.FavouritesViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.swiperefreshlayout.widget.SwipeRefreshLayout getSwipeRefreshLayout() {
        return null;
    }
    
    public final void setSwipeRefreshLayout(@org.jetbrains.annotations.NotNull()
    androidx.swiperefreshlayout.widget.SwipeRefreshLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.movie_app.databinding.MoviesFragmentBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.example.movie_app.databinding.MoviesFragmentBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public MoviesFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/movie_app/ui/MoviesFragment$Companion;", "", "()V", "newInstance", "Lcom/example/movie_app/ui/MoviesFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.movie_app.ui.MoviesFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}