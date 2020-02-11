package com.example.movie_app.ui

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.movie_app.viewmodel.MoviesViewModel
import com.example.movie_app.R
import com.example.movie_app.databinding.MoviesFragmentBinding
import com.example.movie_app.model.Movie
import com.example.movie_app.ui.adapters.MoviesAdapter
import com.example.movie_app.util.OnItemClickListener


class MoviesFragment : Fragment() {

    companion object {
        fun newInstance() = MoviesFragment()
    }

     lateinit var viewModel: MoviesViewModel
    lateinit var adapter: MoviesAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = MoviesFragmentBinding.inflate(inflater, container, false)

         viewModel = ViewModelProvider(this).get(MoviesViewModel::class.java)

        adapter = MoviesAdapter(object: OnItemClickListener {
            override fun onClickAction(movie: Movie) {

                val action = MoviesFragmentDirections.actionMoviesFragmentToMovieDetailsFragment(movie)
                findNavController(this@MoviesFragment).navigate(action)
            }

        },context!!)
        binding.topRatedRecyclerView.adapter = adapter
        binding.topRatedRecyclerView.layoutManager = GridLayoutManager(context,2)


        viewModel.allMovies.observe(this, Observer<List<Movie>> {movies ->
            adapter.movie = movies
            adapter.notifyDataSetChanged()
        })

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


    }

}
