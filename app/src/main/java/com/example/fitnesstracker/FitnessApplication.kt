package com.example.fitnesstracker

import android.app.Application

class FitnessApplication: Application() {
    val db by lazy { FitnessDatabase.getInstance(this) }
}