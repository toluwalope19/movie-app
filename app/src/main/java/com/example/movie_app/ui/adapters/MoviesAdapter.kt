package com.example.movie_app.ui.adapters

import android.app.Application
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.movie_app.R
import com.example.movie_app.databinding.TopRatedBinding
import com.example.movie_app.model.FavouriteMovie
import com.example.movie_app.model.Movie
import com.example.movie_app.repository.FavouriteRepository
import com.example.movie_app.util.OnItemClickListener
import com.example.movie_app.util.Util
import com.example.movie_app.viewmodel.FavouritesViewModel
import com.example.movie_app.viewmodel.MoviesViewModel
import com.google.android.material.shape.RoundedCornerTreatment
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MoviesAdapter(
    private val onItemClickListener: OnItemClickListener,
    private val context: Context,
    val model: FavouritesViewModel,
    val application: Application
) : RecyclerView.Adapter<MoviesAdapter.MovieHolder>() {

    var movie: List<Movie> = listOf()
    val favMovies: List<FavouriteMovie> = listOf()
    lateinit var favouritesViewModel: FavouritesViewModel
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = TopRatedBinding.inflate(inflater)
        return MovieHolder(binding, application)

    }

    override fun getItemCount(): Int {
        return movie.size
    }

    override fun onBindViewHolder(holder: MovieHolder, position: Int) {

        val movie = movie.get(position)

        holder.bind(movie, onItemClickListener)
        val requestOptions = RequestOptions().diskCacheStrategy(DiskCacheStrategy.ALL)
        Glide.with(context)
            .load(Util.IMAGE_BASE_URL + "original" + movie.thumbnail)
            .apply(requestOptions)
            .transform(RoundedCorners(30))
            .into(holder.binding.moviePoster)

        if (!movie.isFavourite) {
            holder.binding.like.setImageResource(R.drawable.love)
        } else {
            holder.binding.like.setImageResource(R.drawable.love_fill)
        }
        holder.binding.like.setOnClickListener {
            if (!movie.isFavourite) {
                movie.isFavourite = true
                holder.binding.like.setImageResource(R.drawable.love_fill)
                model.addFavourites(movie)
                Snackbar.make(it, "Movie Added to Favourites", Snackbar.LENGTH_LONG).show()
            } else {
                movie.isFavourite = false
                holder.binding.like.setImageResource(R.drawable.love)
                model.removeFavourite(movie)
                Snackbar.make(it, "Movie Removed from Favourites", Snackbar.LENGTH_LONG).show()
            }


        }
        //  model.addFavourites(favMovie)


    }


    class MovieHolder(var binding: TopRatedBinding, var application: Application ) : RecyclerView.ViewHolder(binding.root) {

         fun bind(item: Movie, onItemClickListener: OnItemClickListener) {

            binding.movie = item
            val repo = FavouriteRepository(application)
            Log.i("Idris", repo.isFavorite(item.id).toString())

            if (repo.isFavorite(item.id)!!) {
                binding.unlike.visibility = View.VISIBLE
            } else {
                binding.like.visibility = View.VISIBLE
            }
            binding.root.setOnClickListener {
                onItemClickListener.onClickAction(item)
            }
            binding.executePendingBindings()


        }

    }

}