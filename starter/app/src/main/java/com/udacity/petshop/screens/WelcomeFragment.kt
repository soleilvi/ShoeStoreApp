package com.udacity.petshop.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import petshop.R
import petshop.databinding.WelcomeFragmentBinding

class WelcomeFragment : Fragment(){

    private lateinit var binding: WelcomeFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.welcome_fragment,
            container,
            false
        )

        binding.instructionsButton.setOnClickListener { navigateToInstructionsScreen() }

        return binding.root

    }

    private fun navigateToInstructionsScreen(){
        findNavController().navigate(
            WelcomeFragmentDirections.actionWelcomeFragmentToInstructionsFragment()
        )
    }
}