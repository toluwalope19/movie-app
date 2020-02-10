package com.example.movie_app.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.movie_app.databinding.TopRatedBinding
import com.example.movie_app.model.Movie
import com.example.movie_app.util.OnItemClickListener
import com.example.movie_app.util.Util
import com.example.movie_app.viewmodel.MoviesViewModel

class MoviesAdapter(private val onItemClickListener: OnItemClickListener,private val context: Context): RecyclerView.Adapter<MoviesAdapter.MovieHolder>(){

    var movie: List<Movie> = listOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = TopRatedBinding.inflate(inflater)
        return MovieHolder(binding)

    }

    override fun getItemCount(): Int {
       return movie.size
    }

    override fun onBindViewHolder(holder: MovieHolder, position: Int) {

        val movie = movie.get(position)
        holder.bind(movie,onItemClickListener)
        Glide.with(context).load(Util.IMAGE_BASE_URL+"w154" + movie.thumbnail).into(holder.binding.moviePoster)
    }

    class MovieHolder(var binding: TopRatedBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Movie, onItemClickListener: OnItemClickListener) {

            binding.movie = item
            binding.root.setOnClickListener {
                onItemClickListener.onClickAction(item)
            }
            binding.executePendingBindings()


        }

    }

}