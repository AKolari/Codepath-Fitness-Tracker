package com.example.fitnesstracker

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface FoodItemDAO {
    @Query("SELECT * FROM food_item_table")
    fun getAll(): LiveData<List<FoodItemEntity>>

    @Insert
    fun addFoodItem(foodItem: FoodItemEntity)

    @Query("DELETE FROM food_item_table")
    fun deleteAll()
}