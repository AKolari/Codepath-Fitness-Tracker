package com.example.fitnesstracker

import android.os.Parcel
import android.os.Parcelable


data class DisplayFoodItem(
    val name: String?,
    val calories: Double?
)

/* : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readValue(Double::class.java.classLoader) as? Double
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeValue(calories)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DisplayFoodItem> {
        override fun createFromParcel(parcel: Parcel): DisplayFoodItem {
            return DisplayFoodItem(parcel)
        }

        override fun newArray(size: Int): Array<DisplayFoodItem?> {
            return arrayOfNulls(size)
        }
    }
}
*/