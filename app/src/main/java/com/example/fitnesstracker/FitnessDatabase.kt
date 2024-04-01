package com.example.fitnesstracker

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [FoodItemEntity::class], version = 1)
abstract class FitnessDatabase: RoomDatabase() {

    abstract fun foodItemDao(): FoodItemDAO

    companion object {

        @Volatile
        private var INSTANCE: FitnessDatabase? = null

        fun getInstance(context: Context): FitnessDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: buildDatabase(context).also { INSTANCE = it }
            }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                FitnessDatabase::class.java, "Fitness-db"
            ).build()
    }
}