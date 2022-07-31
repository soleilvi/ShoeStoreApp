package com.udacity.petshop.screens.cats

import androidx.lifecycle.ViewModel
import com.udacity.petshop.models.Cat

class CatViewModel : ViewModel() {

    private lateinit var catList: MutableList<Cat>
}