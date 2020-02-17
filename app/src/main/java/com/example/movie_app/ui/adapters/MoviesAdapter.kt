
package com.example.movie_app.ui.adapters

import android.app.Application
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.AsyncTask
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
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
import com.example.movie_app.ui.MoviesFragment
import com.example.movie_app.util.OnItemClickListener
import com.example.movie_app.util.Util
import com.example.movie_app.viewmodel.FavouritesViewModel
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.FileOutputStream
import java.io.InputStream
import java.net.URL


class MoviesAdapter(
    private val onItemClickListener: OnItemClickListener,
    private val context: Context,
    val model: FavouritesViewModel,
    val application: Application
) : ListAdapter<Movie,MoviesAdapter.MovieHolder>(DiffCallback) {

    var movie: List<Movie> = arrayListOf()


    companion object DiffCallback: DiffUtil.ItemCallback<Movie>(){
        override fun areItemsTheSame(oldItem: Movie, newItem: Movie): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Movie, newItem: Movie): Boolean {
            return oldItem.id == newItem.id
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = TopRatedBinding.inflate(inflater)
        return MovieHolder(binding, application,model)

    }

    override fun getItemCount(): Int {

            return movie!!.size
    }

    override fun onBindViewHolder(holder: MovieHolder, position: Int) {

        val movie = movie!!.get(position)

        holder.bind(movie, onItemClickListener)
        val imageString =Util.IMAGE_BASE_URL + "original" + movie.thumbnail
        val requestOptions = RequestOptions().diskCacheStrategy(DiskCacheStrategy.ALL)

        Glide.with(context)
            .asBitmap()
            .load(Uri.parse(imageString))
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
                Snackbar.make(it, "Movie Added to Favourites", Snackbar.LENGTH_SHORT).show()
            } else {
                movie.isFavourite = false
                holder.binding.like.setImageResource(R.drawable.love)
                model.removeFavourite(movie)
                Snackbar.make(it, "Movie Removed from Favourites", Snackbar.LENGTH_SHORT).show()
            }


        }
        //  model.addFavourites(favMovie)


    }


    class MovieHolder(var binding: TopRatedBinding, var application: Application, var model: FavouritesViewModel) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Movie, onItemClickListener: OnItemClickListener) {

            binding.movie = item
            val repo = FavouriteRepository(application)
            Log.i("Tolu", item.isFavourite.toString())

            if (item.isFavourite) {
                binding.unlike.visibility = View.VISIBLE
                binding.like.visibility = View.GONE
            } else {
                binding.like.visibility = View.VISIBLE
                binding.unlike.visibility = View.GONE
            }
            binding.like.setOnClickListener {
                if (!item.isFavourite) {
                    item.isFavourite = true
                    binding.like.setImageResource(R.drawable.love_fill)
                    model.addFavourites(item)
                    Snackbar.make(it, "Movie Added to Favourites", Snackbar.LENGTH_LONG).show()
                } else {
                    item.isFavourite = false
                    binding.like.setImageResource(R.drawable.love)
                    model.removeFavourite(item)
                    Snackbar.make(it, "Movie Removed from Favourites", Snackbar.LENGTH_LONG).show()
                }
            }
            binding.unlike.setOnClickListener {
                if(item.isFavourite) {
                    item.isFavourite = false
                    model.removeFavourite(item)
                    binding.unlike.setImageResource(R.drawable.love)
                    Snackbar.make(it, "Movie Removed from Favourites", Snackbar.LENGTH_LONG).show()
                }else{
                    item.isFavourite = true
                    model.addFavourites(item)
                    binding.like.setImageResource(R.drawable.love_fill)
                    Snackbar.make(it, "Movie Removed from Favourites", Snackbar.LENGTH_LONG).show()
                }
            }
            binding.root.setOnClickListener {
                onItemClickListener.onClickAction(item)
            }
            binding.executePendingBindings()


        }

    }










}
