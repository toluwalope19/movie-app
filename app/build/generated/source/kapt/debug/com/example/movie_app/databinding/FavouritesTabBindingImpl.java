package com.example.movie_app.databinding;
import com.example.movie_app.R;
import com.example.movie_app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FavouritesTabBindingImpl extends FavouritesTabBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.Fav_like, 5);
        sViewsWithIds.put(R.id.divider, 6);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FavouritesTabBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FavouritesTabBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.moviePoster.setTag(null);
        this.rating.setTag(null);
        this.releaseDate.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.favMovie == variableId) {
            setFavMovie((com.example.movie_app.viewmodel.FavouritesViewModel) variable);
        }
        else if (BR.movie == variableId) {
            setMovie((com.example.movie_app.model.Movie) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFavMovie(@Nullable com.example.movie_app.viewmodel.FavouritesViewModel FavMovie) {
        this.mFavMovie = FavMovie;
    }
    public void setMovie(@Nullable com.example.movie_app.model.Movie Movie) {
        this.mMovie = Movie;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.movie);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String doubleToStringMovieVoteAverage = null;
        java.lang.String movieTitle = null;
        java.lang.String movieReleaseDate = null;
        java.lang.String movieThumbnail = null;
        com.example.movie_app.model.Movie movie = mMovie;
        double movieVoteAverage = 0.0;

        if ((dirtyFlags & 0x6L) != 0) {



                if (movie != null) {
                    // read movie.title
                    movieTitle = movie.getTitle();
                    // read movie.releaseDate
                    movieReleaseDate = movie.getReleaseDate();
                    // read movie.thumbnail
                    movieThumbnail = movie.getThumbnail();
                    // read movie.voteAverage
                    movieVoteAverage = movie.getVoteAverage();
                }


                // read Double.toString(movie.voteAverage)
                doubleToStringMovieVoteAverage = java.lang.Double.toString(movieVoteAverage);
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, movieTitle);
            androidx.databinding.adapters.ImageViewBindingAdapter.setImageUri(this.moviePoster, movieThumbnail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.rating, doubleToStringMovieVoteAverage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.releaseDate, movieReleaseDate);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): favMovie
        flag 1 (0x2L): movie
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}