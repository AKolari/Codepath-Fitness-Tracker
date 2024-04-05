package com.example.fitnesstracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {





        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mFragment = FoodItemFragment()


        // Move fragment replacement here
        val supportFragmentManager = supportFragmentManager
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.content, mFragment, null).commit()


        val navView =findViewById<BottomNavigationView>(R.id.nav)

        navView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_summary->
                    // do something here
                    true
                R.id.action_entries ->
                    // do something here
                    true

                else -> true
            }
        }




    }
}