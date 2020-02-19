package com.example.movie_app.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.movie_app.R
import com.example.movie_app.databinding.FavouritesFragmentBinding
import com.example.movie_app.model.Movie
import com.example.movie_app.ui.adapters.FavouriteAdapter
import com.example.movie_app.util.MarginItemDecoration
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


        },context!!,viewModel.apply {  })
        binding.favouritesRecycler.adapter = adapter
        binding.favouritesRecycler.layoutManager = GridLayoutManager(context,2)
        binding.favouritesRecycler.addItemDecoration(MarginItemDecoration(resources.getDimension(R.dimen.marginTop).toInt()))

        viewModel.getMovies().observe(this,Observer<List<Movie>>{ favMovies->

            if(favMovies.isEmpty()){
                binding.error.visibility = View.VISIBLE
                adapter.notifyDataSetChanged()
            }else {
                binding.error.visibility = View.GONE
                adapter.notifyDataSetChanged()
            }
            adapter.favMovies = favMovies

            adapter.notifyDataSetChanged()

        })
        return binding.root


    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // TODO: Use the ViewModel
    }

}
