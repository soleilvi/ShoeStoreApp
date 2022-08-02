package com.udacity.petshop.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Cat(var breed: String,
               var coat: String,
               var size: String,
               var shedding: Int,
               var vocality: Int,
               var intelligence: Int,
               var description: String,
               val images: List<String> = mutableListOf()
               ) : Parcelable