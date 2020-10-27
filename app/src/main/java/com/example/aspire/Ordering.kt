package com.example.aspire

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ordering.*

class Ordering : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ordering)

        button_confirm_order.setOnClickListener {
         val intent = Intent(this, OrderingDescription::class.java)
            startActivity(intent)
        }
    }
}