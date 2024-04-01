package com.example.fitnesstracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class FoodItemAdapter(private var list: List<FoodItemEntity>) :RecyclerView.Adapter<FoodItemAdapter.FoodViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_food_item, parent, false)
        return FoodViewHolder(view)
    }

    inner class FoodViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        var mItem: FoodItemEntity? = null

        val mFoodName: TextView = mView.findViewById<View>(R.id.foodName) as TextView
        val mCal:TextView = mView.findViewById<TextView>(R.id.calories)




        override fun toString(): String {
            return mFoodName.toString()
        }
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val foodItem = list[position]

        holder.mItem = foodItem
        holder.mFoodName.text=foodItem.name
        holder.mCal.text=foodItem.calories?.toInt().toString()+" Calories"



        holder.mView.setOnClickListener {
            holder.mItem?.let { foodItem ->
                Toast.makeText( it.context, "test: " + foodItem.name, Toast.LENGTH_LONG).show()

            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setData(newFood:List<FoodItemEntity>){
        this.list=newFood
        notifyDataSetChanged()

    }



}