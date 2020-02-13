package com.example.movie_app

import android.content.Context
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController
    lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navController = Navigation.findNavController(this,
            R.id.Fragment
        )

        appBarConfiguration = AppBarConfiguration(navController.graph)
        setSupportActionBar(toolbar)

        setupActionBarWithNavController(navController)

       isNetworkAvailable(applicationContext)

    }

    fun isNetworkAvailable(context: Context){

        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork = cm.activeNetworkInfo
        if (activeNetwork != null) {
            if (activeNetwork.type == ConnectivityManager.TYPE_WIFI) {
                Toast.makeText(context,"Please check network", Toast.LENGTH_LONG).show()
            } else if (activeNetwork.type == ConnectivityManager.TYPE_MOBILE) {
                Toast.makeText(context,"Please check network", Toast.LENGTH_LONG).show()
            }
        } else {
            Toast.makeText(context,"Please check network", Toast.LENGTH_LONG).show()
        }
//            Snackbar.make(this, "Please check netwrok connectivity", Snackbar.LENGTH_SHORT).show()

        Toast.makeText(context,"Please check network", Toast.LENGTH_LONG).show()
    }



    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }






}
