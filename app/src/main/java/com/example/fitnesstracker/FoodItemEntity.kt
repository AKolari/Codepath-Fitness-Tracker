package com.example.fitnesstracker

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "food_item_table")
data class FoodItemEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "foodName") val name: String?,
    @ColumnInfo(name = "calories") val calories : Double?
)