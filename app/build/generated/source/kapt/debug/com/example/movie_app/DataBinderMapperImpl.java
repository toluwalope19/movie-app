package com.example.movie_app;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.movie_app.databinding.FavouriteDetailFragmentBindingImpl;
import com.example.movie_app.databinding.FavouritesFragmentBindingImpl;
import com.example.movie_app.databinding.FavouritesTabBindingImpl;
import com.example.movie_app.databinding.MovieDetailsFragmentBindingImpl;
import com.example.movie_app.databinding.MoviesFragmentBindingImpl;
import com.example.movie_app.databinding.TopRatedBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FAVOURITEDETAILFRAGMENT = 1;

  private static final int LAYOUT_FAVOURITESFRAGMENT = 2;

  private static final int LAYOUT_FAVOURITESTAB = 3;

  private static final int LAYOUT_MOVIEDETAILSFRAGMENT = 4;

  private static final int LAYOUT_MOVIESFRAGMENT = 5;

  private static final int LAYOUT_TOPRATED = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.movie_app.R.layout.favourite_detail_fragment, LAYOUT_FAVOURITEDETAILFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.movie_app.R.layout.favourites_fragment, LAYOUT_FAVOURITESFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.movie_app.R.layout.favourites_tab, LAYOUT_FAVOURITESTAB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.movie_app.R.layout.movie_details_fragment, LAYOUT_MOVIEDETAILSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.movie_app.R.layout.movies_fragment, LAYOUT_MOVIESFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.movie_app.R.layout.top_rated, LAYOUT_TOPRATED);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FAVOURITEDETAILFRAGMENT: {
          if ("layout/favourite_detail_fragment_0".equals(tag)) {
            return new FavouriteDetailFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for favourite_detail_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_FAVOURITESFRAGMENT: {
          if ("layout/favourites_fragment_0".equals(tag)) {
            return new FavouritesFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for favourites_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_FAVOURITESTAB: {
          if ("layout/favourites_tab_0".equals(tag)) {
            return new FavouritesTabBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for favourites_tab is invalid. Received: " + tag);
        }
        case  LAYOUT_MOVIEDETAILSFRAGMENT: {
          if ("layout/movie_details_fragment_0".equals(tag)) {
            return new MovieDetailsFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for movie_details_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_MOVIESFRAGMENT: {
          if ("layout/movies_fragment_0".equals(tag)) {
            return new MoviesFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for movies_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_TOPRATED: {
          if ("layout/top_rated_0".equals(tag)) {
            return new TopRatedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for top_rated is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "movies");
      sKeys.put(2, "movie");
      sKeys.put(3, "favMovie");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/favourite_detail_fragment_0", com.example.movie_app.R.layout.favourite_detail_fragment);
      sKeys.put("layout/favourites_fragment_0", com.example.movie_app.R.layout.favourites_fragment);
      sKeys.put("layout/favourites_tab_0", com.example.movie_app.R.layout.favourites_tab);
      sKeys.put("layout/movie_details_fragment_0", com.example.movie_app.R.layout.movie_details_fragment);
      sKeys.put("layout/movies_fragment_0", com.example.movie_app.R.layout.movies_fragment);
      sKeys.put("layout/top_rated_0", com.example.movie_app.R.layout.top_rated);
    }
  }
}
