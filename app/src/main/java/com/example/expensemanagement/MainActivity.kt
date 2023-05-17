package com.example.expensemanagement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.fragment.app.Fragment
import com.example.expensemanagement.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationBarView
import com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




      binding.bottomnavigation.setOnItemSelectedListener( object  : OnNavigationItemSelectedListener,
          NavigationBarView.OnItemSelectedListener {
          override fun onNavigationItemSelected(item: MenuItem): Boolean {

              when (item.itemId) {

                  R.id.home -> {
                      loadfragment(HomeFragment())

                  }
                  R.id.menu->{
                      loadfragment(MenuFragment())
                  }

                  R.id.categories->{
                      loadfragment(CategoriesFragment())
                  }
                  R.id.setting->{
                      loadfragment(SettingFragment())
                  }
              }
              return true
          }


          })


    }
    private fun loadfragment(fragment: Fragment) {
supportFragmentManager.beginTransaction().replace(R.id.fram,fragment).commit()

    }

    fun click(view: View) {
        loadfragment(AddFragment())
    }

}



