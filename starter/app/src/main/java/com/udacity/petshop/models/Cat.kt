package com.udacity.petshop.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Cat(var name: String, var size: Double, var company: String, var description: String,
               val images: List<String> = mutableListOf()) : Parcelable