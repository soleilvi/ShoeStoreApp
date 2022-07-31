package com.udacity.petshop.screens.cats

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import petshop.R
import petshop.databinding.CatFragmentBinding

class CatFragment : Fragment(){

    private lateinit var viewModel: CatViewModel

    private lateinit var binding: CatFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate view and obtain an instance of the binding class
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.cat_fragment,
            container,
            false
        )

        // Set up view model
        viewModel = ViewModelProvider(this).get(CatViewModel::class.java)
        binding.catViewModel = viewModel

        return binding.root

    }
}
