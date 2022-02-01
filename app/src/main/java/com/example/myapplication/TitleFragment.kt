package com.example.myapplication

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.myapplication.databinding.TitleFragmentBinding

/**
 * Created by PrernaSurbhi on 29/01/22.
 */
class TitleFragment: Fragment() {
    //this fragmnet is for title fragment
    lateinit var binding: TitleFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.title_fragment,container,false)
        binding.playButton.setOnClickListener {
            it.findNavController().navigate(R.id.titletoGameNavigation)
        }
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.
        onNavDestinationSelected(item,requireView().findNavController()) || super.onOptionsItemSelected(item)

    }
}