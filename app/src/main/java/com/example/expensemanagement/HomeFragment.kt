package com.example.expensemanagement

import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.example.expensemanagement.databinding.FragmentHomeBinding
import com.google.android.material.navigation.NavigationView

class HomeFragment : Fragment() {
    private  lateinit var drawerLayout: DrawerLayout
    private  lateinit var toggle: ActionBarDrawerToggle

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       var binding=FragmentHomeBinding.inflate(layoutInflater)

        toggle=ActionBarDrawerToggle(context,)


        binding.menu.set{
            binding.navigation.setNavigationItemSelectedListener(object :
                NavigationView.OnNavigationItemSelectedListener {
                override fun onNavigationItemSelected(item: MenuItem): Boolean {


                    when (item.itemId) {
                        R.id.navhome -> {
                            Toast.makeText(context,"Profile",Toast.LENGTH_LONG).show()
                        }

                        R.id.Profile -> {
                         Toast.makeText(context,"Profile",Toast.LENGTH_LONG).show()
                        }

                        R.id.about -> {
                            Toast.makeText(context,"Profile",Toast.LENGTH_LONG).show()

                        }
                    }
                    binding.drawer.closeDrawer(Gravity.LEFT)
                    return true


                }


            })
        }
        return binding.root
    }


}