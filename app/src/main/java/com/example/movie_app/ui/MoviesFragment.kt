package com.example.movie_app.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.movie_app.viewmodel.MoviesViewModel
import com.example.movie_app.R
import com.example.movie_app.databinding.MoviesFragmentBinding
import com.example.movie_app.model.Movie
import com.example.movie_app.repository.FavoriteRepositoryViewModelFactory
import com.example.movie_app.ui.adapters.MoviesAdapter
import com.example.movie_app.util.MarginItemDecoration
import com.example.movie_app.util.OnItemClickListener
import com.example.movie_app.viewmodel.FavouritesViewModel
import kotlinx.coroutines.runBlocking


class MoviesFragment : Fragment() {

    companion object {
        fun newInstance() = MoviesFragment()
    }

     lateinit var viewModel: MoviesViewModel
    lateinit var factory: FavoriteRepositoryViewModelFactory
    lateinit var adapter: MoviesAdapter
    lateinit var favModel: FavouritesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = MoviesFragmentBinding.inflate(inflater, container, false)
            factory = FavoriteRepositoryViewModelFactory(activity!!.application)
         viewModel = ViewModelProvider(this, factory).get(MoviesViewModel::class.java)


        favModel = ViewModelProvider(this).get(FavouritesViewModel::class.java)

        adapter = MoviesAdapter(object: OnItemClickListener {
            override fun onClickAction(movie: Movie) {

                val action = MoviesFragmentDirections.actionMoviesFragmentToMovieDetailsFragment(movie)
                findNavController(this@MoviesFragment).navigate(action)
            }

        },context!!,favModel.apply {  }, activity!!.application)
        binding.topRatedRecyclerView.adapter = adapter
        binding.topRatedRecyclerView.layoutManager = GridLayoutManager(context,2)


        viewModel.allMovies.observe(viewLifecycleOwner, Observer<List<Movie>> {movies ->

            runBlocking {
                adapter.movie = viewModel.mapFavorite(movies)

            }


            adapter.notifyDataSetChanged()
        })

        binding.topRatedRecyclerView.addItemDecoration(MarginItemDecoration(resources.getDimension(R.dimen.marginTop).toInt()))

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
