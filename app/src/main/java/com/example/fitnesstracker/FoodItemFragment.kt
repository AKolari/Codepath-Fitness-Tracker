package com.example.fitnesstracker
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.widget.ContentLoadingProgressBar
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.flow.observeOn


class FoodItemFragment : Fragment() {
    private lateinit var mFoodItemViewModel: FoodItemViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //val myList = arguments?.getParcelableArrayList<DisplayFoodItem>("MyListKey");
        val view = inflater.inflate(R.layout.fragment_food_item_list, container, false)
        val recyclerView = view.findViewById<View>(R.id.list) as RecyclerView

        val context = view.context
        recyclerView.layoutManager=LinearLayoutManager(requireContext())
        //userModel:
        mFoodItemViewModel= ViewModelProvider(this)[FoodItemViewModel::class.java]
        mFoodItemViewModel.readAllData.observe(viewLifecycleOwner, Observer{ food->
            recyclerView.adapter=FoodItemAdapter(food);
        })




        val transitionButton = view.findViewById<Button>(R.id.button);

        transitionButton.setOnClickListener{
            val intent = Intent(view.context, InsertFoodItemActivity::class.java)

            it.context.startActivity(intent)
        }










        return view

    }

}
