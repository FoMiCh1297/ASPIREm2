package com.example.aspire

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_add_to_basket.*

class AddToBasket : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_to_basket)

        button_add_to_basket.setOnClickListener {
            val intent = Intent(this, Ordering::class.java)
            startActivity(intent)
        }

    }
}