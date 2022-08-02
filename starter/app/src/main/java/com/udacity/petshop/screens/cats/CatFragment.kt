package com.udacity.petshop.screens.cats

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.*
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import petshop.R
import petshop.databinding.CatFragmentBinding
import timber.log.Timber

// TODO: Get value of edit text fields https://stackoverflow.com/questions/4531396/get-value-of-a-edit-text-field
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

        // Three dots at the top
        // setHasOptionsMenu(true)

        return binding.root

    }

//    fun onClickBreed() {
//        // TODO: make the lambda function work :')
//        // Timber.i(viewModel.cats.value?.get(listIndex)?.breed ?: "failed")
//        Timber.i(" pee")
//    }

//    // just creates the menu
//    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
//        super.onCreateOptionsMenu(menu, inflater)
//        inflater.inflate(R.menu, , menu)
//    }
//
//    // allows user to go to the intended fragment after an option is selected
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController())
//                || super.onOptionsItemSelected(item)
//    }
}
