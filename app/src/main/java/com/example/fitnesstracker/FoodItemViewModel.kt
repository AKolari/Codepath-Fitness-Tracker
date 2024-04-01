package com.example.fitnesstracker

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class FoodItemViewModel(application: Application): AndroidViewModel(application) {
    val  readAllData: LiveData<List<FoodItemEntity>>
    private val repository: FoodItemRepository

    init {
        val foodDao = FitnessDatabase.getInstance(application).foodItemDao()
        repository=FoodItemRepository(foodDao)
        readAllData=repository.readAllData
    }

    fun addFoodItem(foodItemEntity: FoodItemEntity){
        viewModelScope.launch(Dispatchers.IO){
            repository.addItem(foodItemEntity)

        }


    }




}