// Generated by data binding compiler. Do not edit!
package com.example.movie_app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.movie_app.R;
import com.example.movie_app.model.Movie;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class MoviesFragmentBinding extends ViewDataBinding {
  @NonNull
  public final FloatingActionButton fab;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RecyclerView topRatedRecyclerView;

  @Bindable
  protected Movie mMovies;

  protected MoviesFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FloatingActionButton fab, ProgressBar progressBar, RecyclerView topRatedRecyclerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fab = fab;
    this.progressBar = progressBar;
    this.topRatedRecyclerView = topRatedRecyclerView;
  }

  public abstract void setMovies(@Nullable Movie movies);

  @Nullable
  public Movie getMovies() {
    return mMovies;
  }

  @NonNull
  public static MoviesFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.movies_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static MoviesFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<MoviesFragmentBinding>inflateInternal(inflater, R.layout.movies_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static MoviesFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.movies_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static MoviesFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<MoviesFragmentBinding>inflateInternal(inflater, R.layout.movies_fragment, null, false, component);
  }

  public static MoviesFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static MoviesFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (MoviesFragmentBinding)bind(component, view, R.layout.movies_fragment);
  }
}
