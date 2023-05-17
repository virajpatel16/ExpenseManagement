package com.example.expensemanagement

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.expensemanagement.databinding.FragmentSettingBinding


class SettingFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding=FragmentSettingBinding.inflate(layoutInflater)




        return  binding.root
    }


}