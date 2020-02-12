package com.example.movie_app.ui.adapters

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.movie_app.databinding.FavouritesTabBinding
import com.example.movie_app.model.Movie
import com.example.movie_app.util.OnFavouritClickListener
import com.example.movie_app.util.Util
import com.example.movie_app.viewmodel.FavouritesViewModel
import com.google.android.material.snackbar.Snackbar

class FavouriteAdapter(
    private val onFavouritClickListener: OnFavouritClickListener,
    private val context: Context,
    val model: FavouritesViewModel
) : RecyclerView.Adapter<FavouriteAdapter.FavouriteHolder>() {


    var favMovies: List<Movie> = listOf()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FavouriteHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = FavouritesTabBinding.inflate(inflater)
        return FavouriteHolder(binding)
    }

    override fun getItemCount(): Int {
        return favMovies.size
    }

    override fun onBindViewHolder(holder: FavouriteHolder, position: Int) {
        val movie = favMovies.get(position)
        val image = movie.thumbnail
        val requestOptions = RequestOptions().diskCacheStrategy(DiskCacheStrategy.ALL)
        Glide.with(context)
            .load(Uri.parse(Util.IMAGE_BASE_URL + "original" + movie.thumbnail))
            .apply(requestOptions)
            .transform(RoundedCorners(30)).into(holder.binding.moviePoster)
        holder.bind(movie, onFavouritClickListener)
        holder.binding.unlike.setOnClickListener {
            model.removeFavourite(movie)
            Snackbar.make(it, "Movie Removed From Favourites", Snackbar.LENGTH_LONG).show()
            notifyItemChanged(movie.id.toInt())
        }
    }

    class FavouriteHolder(var binding: FavouritesTabBinding) :
        RecyclerView.ViewHolder(binding.root) {


        fun bind(item: Movie, onFavouritClickListener: OnFavouritClickListener) {

            binding.movie = item
            binding.root.setOnClickListener {
                onFavouritClickListener.onClickFavouriteMovie(item)
            }
            binding.executePendingBindings()


        }

    }
}
