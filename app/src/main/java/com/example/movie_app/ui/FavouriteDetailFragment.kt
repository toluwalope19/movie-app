package com.example.movie_app.ui

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.movie_app.R

import com.example.movie_app.viewmodel.FavouriteDetailViewModel
import com.example.movie_app.databinding.FavouriteDetailFragmentBinding
import com.example.movie_app.util.Util
import com.example.movie_app.viewmodel.FavouritesViewModel
import com.google.android.material.snackbar.Snackbar


class FavouriteDetailFragment : Fragment() {

    companion object {
        fun newInstance() = FavouriteDetailFragment()
    }

    private lateinit var viewModel: FavouriteDetailViewModel

    private val args: FavouriteDetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding =  FavouriteDetailFragmentBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(FavouriteDetailViewModel::class.java)

        binding.movie = args.movie
        val requestOptions = RequestOptions().diskCacheStrategy(DiskCacheStrategy.ALL)
        val image =  args.movie.backdrop
        val g = args.movie
        var status = args.movie.isFavourite

        if(status){
            binding.like.setImageResource(R.drawable.love_fill)
        }else{
            binding.like.setImageResource(R.drawable.love)
        }

        binding.like.setOnClickListener {
            if(status){
                status = false
                binding.like.setImageResource(R.drawable.love)
                viewModel.removeFavourite(g)
                Snackbar.make(it, "Movie Removed From Favourites", Snackbar.LENGTH_LONG).show()
            }else{
                status = true
                binding.like.setImageResource(R.drawable.love_fill)
                viewModel.addFavourites(g)
                Snackbar.make(it, "Movie added to Favourites", Snackbar.LENGTH_LONG).show()
            }
        }
        Glide.with(context!!)
            .load(Util.IMAGE_BASE_URL+"original"+ image)
            .apply(requestOptions)
            .into(binding.detailImage)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProviders.of(this).get(FavouriteDetailViewModel::class.java)
//        // TODO: Use the ViewModel
    }

}
