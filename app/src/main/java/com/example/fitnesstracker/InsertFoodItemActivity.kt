package com.example.fitnesstracker

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class InsertFoodItemActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.insert_item_activity)
        val submit = findViewById<Button>(R.id.button2)
        val name = findViewById<EditText>(R.id.editTextText)
        val cal = findViewById<EditText>(R.id.editTextNumber)


        submit.setOnClickListener{
            lifecycleScope.launch(IO) {
                (application as FitnessApplication).db.foodItemDao().addFoodItem(FoodItemEntity(name = name.text.toString(), calories = cal.text.toString().toDouble()))
                finish()
            }



        }


    }

}