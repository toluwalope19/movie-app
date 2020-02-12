package com.example.movie_app.databinding;
import com.example.movie_app.R;
import com.example.movie_app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MovieDetailsFragmentBindingImpl extends MovieDetailsFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.like, 5);
        sViewsWithIds.put(R.id.divider, 6);
        sViewsWithIds.put(R.id.release_date, 7);
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

    public MovieDetailsFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private MovieDetailsFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[6]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[3]
            );
        this.detailImage.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.movieDetails.setTag(null);
        this.voteAverage.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.movie == variableId) {
            setMovie((com.example.movie_app.model.Movie) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMovie(@Nullable com.example.movie_app.model.Movie Movie) {
        this.mMovie = Movie;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
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
        java.lang.String movieThumbnail = null;
        com.example.movie_app.model.Movie movie = mMovie;
        java.lang.String movieOverview = null;
        double movieVoteAverage = 0.0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (movie != null) {
                    // read movie.title
                    movieTitle = movie.getTitle();
                    // read movie.thumbnail
                    movieThumbnail = movie.getThumbnail();
                    // read movie.overview
                    movieOverview = movie.getOverview();
                    // read movie.voteAverage
                    movieVoteAverage = movie.getVoteAverage();
                }


                // read Double.toString(movie.voteAverage)
                doubleToStringMovieVoteAverage = java.lang.Double.toString(movieVoteAverage);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageUri(this.detailImage, movieThumbnail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, movieTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.movieDetails, movieOverview);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.voteAverage, doubleToStringMovieVoteAverage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): movie
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}