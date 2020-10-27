package com.example.aspire

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import kotlinx.android.synthetic.main.activity_main4.*

class MainActivity4 : AppCompatActivity() {

    private var showPassword = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        eye_icon.setOnClickListener {
            showPassword = !showPassword
            showAndHide(showPassword)
        }
        showAndHide(showPassword)

        button4.setOnClickListener{
            val intent = Intent(this, BottomNavigation::class.java)
            startActivity(intent)
        }
    }

    private fun showAndHide(isShow: Boolean) {
        if (isShow) {
            editTextTextPassword.transformationMethod = HideReturnsTransformationMethod()
            eye_icon.setImageResource(R.drawable.eye_icon2)
        } else {
            editTextTextPassword.transformationMethod = PasswordTransformationMethod.getInstance()
            eye_icon.setImageResource(R.drawable.eye_icon)
        }
        editTextTextPassword.setSelection(editTextTextPassword.text.toString().length)
    }

}