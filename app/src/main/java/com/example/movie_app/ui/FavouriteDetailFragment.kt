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

import com.example.movie_app.viewmodel.FavouriteDetailViewModel
import com.example.movie_app.databinding.FavouriteDetailFragmentBinding
import com.example.movie_app.util.Util


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

        binding.movie = args.movie
        val requestOptions = RequestOptions().diskCacheStrategy(DiskCacheStrategy.ALL)
        val image =  args.movie.backdrop
        Glide.with(context!!)
            .load(Util.IMAGE_BASE_URL+"original"+ image)
            .apply(requestOptions)
            .into(binding.detailImage)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FavouriteDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
