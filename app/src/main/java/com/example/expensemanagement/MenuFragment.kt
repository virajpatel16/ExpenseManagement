package com.example.expensemanagement

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.expensemanagement.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       var binding=FragmentMenuBinding.inflate(layoutInflater)




        return binding.root
    }


}