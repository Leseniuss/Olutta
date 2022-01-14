package com.example.olutta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation


class fragment2 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_fragment2, container, false)

        val button=view.findViewById<Button>(R.id.fragiin21)
        button.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragment2_to_fragment1)
        }
       // val view2=inflater.inflate(R.layout.fragment_fragment2, container, false)

        val button2=view.findViewById<Button>(R.id.fragiin23)
        button2.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_fragment2_to_fragment3)
        }

        return view
    }


}