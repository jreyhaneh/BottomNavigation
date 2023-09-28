package com.example.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNav)
        val navConroller =
            (supportFragmentManager.findFragmentById(R.id.fragment) as NavHostFragment).findNavController()
//        val appBarConfiguration =
//            AppBarConfiguration(setOf(R.id.firstFragment, R.id.secondFragment, R.id.thirdFeragment))     //**Action Bar**//

//        setupActionBarWithNavController(navConroller, appBarConfiguration)                             //**Action Bar**//
        bottomNavigationView.setupWithNavController(navConroller)
    }
}