package com.udacity.petshop.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import petshop.R
import petshop.databinding.LoginFragmentBinding

class LoginFragment : Fragment(){

    private lateinit var binding: LoginFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.login_fragment,
            container,
            false
        )

        binding.logInButton.setOnClickListener { navigateToWelcomeScreen() }
        binding.signUpButton.setOnClickListener { navigateToWelcomeScreen() }

        return binding.root

    }

    private fun navigateToWelcomeScreen(){
        findNavController().navigate(
            LoginFragmentDirections.actionLoginFragmentToWelcomeFragment()
        )
    }
}