package com.example.aspire

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.favorite_fragment.*

class FavoriteFragment : Fragment (R.layout.favorite_fragment) {

    /*override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.favorite_fragment, container, false)

        button_restaurants.setOnClickListener {
            val restaurantFragment = FragmentFavoriteRestaurants()
            val manager = childFragmentManager
            val transaction = manager.beginTransaction()
            transaction.replace(R.id.fragment, restaurantFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        button_dishes.setOnClickListener {
            val dishesFragment = FragmentFavoriteDishes()
            val manager = childFragmentManager
            val transaction = manager.beginTransaction()
            transaction.replace(R.id.fragment, dishesFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
        return view
        }*/

    }