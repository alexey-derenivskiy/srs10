package com.dap.srs10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigationMenu : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationMenu = findViewById(R.id.bottom_navigation)

        bottomNavigationMenu.setOnItemSelectedListener {item ->
            var fragment: Fragment? = null
            when (item.itemId){
                R.id.home_page ->
                    fragment = HomeFragment()
                R.id.catalog_page ->
                    fragment = CatalogFragment()
                R.id.cart_page ->
                    fragment = CartFragment()
                R.id.profile_page ->
                    fragment = ProfileFragment()
            }
            replaceFragment(fragment!!)
            true
        }

        bottomNavigationMenu.selectedItemId = R.id.home_page
    }

    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container,fragment)
            //.addToBackStack(fragment.tag)
            .commit()
    }
}