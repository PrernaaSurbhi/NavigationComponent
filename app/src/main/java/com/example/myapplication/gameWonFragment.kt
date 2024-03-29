package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.FragmentGameWonBinding
import com.example.myapplication.databinding.GameOverFramentBinding

class gameWonFragment : Fragment() {
   lateinit var binding:FragmentGameWonBinding

   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding = DataBindingUtil.inflate(inflater,R.layout.fragment_game_won,container,false)
       val args = gameWonFragmentArgs.fromBundle(requireArguments())
       Toast.makeText(context,"NumCorrect: ${args.numCorrect},NumQuestion: ${args.numQuestions}",Toast.LENGTH_SHORT).show()
        return binding.root
    }

}