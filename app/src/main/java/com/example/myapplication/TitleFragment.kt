package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
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
        return binding.root
    }
}