package com.example.movie_app.ui

import android.app.Application
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.amitshekhar.DebugDB
import com.example.movie_app.viewmodel.MoviesViewModel
import com.example.movie_app.R
import com.example.movie_app.databinding.MoviesFragmentBinding
import com.example.movie_app.model.Movie
import com.example.movie_app.repository.FavoriteRepositoryViewModelFactory
import com.example.movie_app.ui.adapters.MoviesAdapter
import com.example.movie_app.util.MarginItemDecoration
import com.example.movie_app.util.OnItemClickListener
import com.example.movie_app.viewmodel.FavouritesViewModel
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.runBlocking


class MoviesFragment : Fragment() {

    companion object {
        fun newInstance() = MoviesFragment()
    }

    lateinit var viewModel: MoviesViewModel
    lateinit var factory: FavoriteRepositoryViewModelFactory
    lateinit var adapter: MoviesAdapter
    lateinit var favModel: FavouritesViewModel
    lateinit var swipeRefreshLayout: SwipeRefreshLayout
    lateinit var binding: MoviesFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = MoviesFragmentBinding.inflate(inflater, container, false)

        factory = FavoriteRepositoryViewModelFactory(activity!!.application)

        viewModel = ViewModelProvider(this, factory).get(MoviesViewModel::class.java)


        favModel = ViewModelProvider(this).get(FavouritesViewModel::class.java)

        val  r =  DebugDB.getAddressLog()
        Log.d("aYO", r.toString())

        adapter = MoviesAdapter(object : OnItemClickListener {
            override fun onClickAction(movie: Movie) {

                val action =
                    MoviesFragmentDirections.actionMoviesFragmentToMovieDetailsFragment(movie)
                findNavController(this@MoviesFragment).navigate(action)
            }

        }, context!!, favModel.apply { }, activity!!.application)

        binding.topRatedRecyclerView.adapter = adapter

        binding.topRatedRecyclerView.layoutManager = GridLayoutManager(context, 2)


        viewModel.allMovies.observe(viewLifecycleOwner, Observer<List<Movie>> { movies ->

            runBlocking {
                adapter.movie = movies
                adapter.movie = viewModel.mapFavorite(movies)
                Log.d("Ayor", movies.toString())
            }
            if (movies.isEmpty()) {
                binding.progressBar.visibility = View.GONE
                binding.errorMessage.visibility = View.VISIBLE
                binding.Refresh.visibility = View.VISIBLE
                Snackbar.make(view!!, "Something went wrong", Snackbar.LENGTH_LONG).show()

                binding.Refresh.setOnClickListener {
                    viewModel.allMovies
                }
            }


            adapter.notifyDataSetChanged()
        })

        binding.topRatedRecyclerView.addItemDecoration(MarginItemDecoration(resources.getDimension(R.dimen.smallMargin).toInt()))

        binding.fab.setOnClickListener {
            val action = MoviesFragmentDirections.actionMoviesFragmentToFavouritesFragment()
            findNavController().navigate(action)
        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


    }

}
