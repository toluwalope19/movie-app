package com.example.movie_app.ui

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.movie_app.R
import com.example.movie_app.databinding.FavouritesFragmentBinding
import com.example.movie_app.databinding.FavouritesTabBinding
import com.example.movie_app.model.FavouriteMovie
import com.example.movie_app.model.Movie
import com.example.movie_app.ui.adapters.FavouriteAdapter
import com.example.movie_app.util.OnFavouritClickListener
import com.example.movie_app.viewmodel.FavouritesViewModel


class FavouritesFragment : Fragment() {

    companion object {
        fun newInstance() = FavouritesFragment()
    }

    private lateinit var viewModel: FavouritesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(FavouritesViewModel::class.java)
        val binding =  FavouritesFragmentBinding.inflate(inflater, container, false)

        val adapter = FavouriteAdapter(object : OnFavouritClickListener{
            override fun onClickFavouriteMovie(movie: Movie) {

                val action = FavouritesFragmentDirections.actionFavouritesFragmentToFavouriteDetailFragment(movie)
                findNavController().navigate(action)
            }


        },context!!)
        binding.favouritesRecycler.adapter = adapter
        binding.favouritesRecycler.layoutManager = GridLayoutManager(context,2)

        viewModel.getMessages().observe(this,Observer<List<Movie>>{favMovies->

            adapter.favMovies = favMovies
            Toast.makeText(context, favMovies.last().thumbnail, Toast.LENGTH_LONG).show()

            adapter.notifyDataSetChanged()

        })
        return binding.root


    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // TODO: Use the ViewModel
    }

}
