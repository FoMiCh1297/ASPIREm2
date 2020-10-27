package com.example.aspire

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_bottom_navigation.*

class BottomNavigation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)

        val homeFragment = HomeFragment()
        val searchFragment = SearchFragment()
        val accountFragment = AccountFragment()
        val favoriteFragment = FavoriteFragment()
        val basketFragment = BasketFragment()

        setCurrentFragment(homeFragment)

        bottom_navigation_view.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home -> setCurrentFragment(homeFragment)
                R.id.search -> setCurrentFragment(searchFragment)
                R.id.account -> setCurrentFragment(accountFragment)
                R.id.favorite -> setCurrentFragment(favoriteFragment)
                R.id.basket -> setCurrentFragment(basketFragment)
            }
            true
        }
    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragment)
            commit()
        }
}