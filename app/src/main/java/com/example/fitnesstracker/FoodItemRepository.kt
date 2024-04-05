package com.example.fitnesstracker

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import kotlinx.coroutines.flow.Flow

class FoodItemRepository(private val foodItemDAO: FoodItemDAO) {

    val readAllData : LiveData<List<FoodItemEntity>> = foodItemDAO.getAll()

    suspend fun addItem(foodItemEntity: FoodItemEntity){
        foodItemDAO.addFoodItem(foodItemEntity)

    }



}