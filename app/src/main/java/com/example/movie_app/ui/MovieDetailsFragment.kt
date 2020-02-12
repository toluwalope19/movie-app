package com.example.movie_app.ui

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.movie_app.R
import com.example.movie_app.databinding.MovieDetailsFragmentBinding
import com.example.movie_app.model.Movie
import com.example.movie_app.util.Util
import com.example.movie_app.viewmodel.MovieDetailsViewModel


class MovieDetailsFragment() : Fragment() {

    companion object {
        fun newInstance() = MovieDetailsFragment()
    }

    private lateinit var viewModel: MovieDetailsViewModel


//    val args: PostDetailFragmentArgs by navArgs()
    private val args: MovieDetailsFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding =  MovieDetailsFragmentBinding.inflate(inflater, container, false)
         var movies: List<Movie> = listOf()

        binding.movie = args.movie
        val image =  args.movie.thumbnail
        val status = args.movie.isFavourite
        val requestOptions = RequestOptions().diskCacheStrategy(DiskCacheStrategy.ALL)
        if(status){
            binding.like.setImageResource(R.drawable.love_fill)
        }else{
            binding.like.setImageResource(R.drawable.love)
        }
        Glide.with(context!!).load(Util.IMAGE_BASE_URL+"original"+ image)
            .apply(requestOptions)
            .into(binding.detailImage)


        return binding.root
    }



}
