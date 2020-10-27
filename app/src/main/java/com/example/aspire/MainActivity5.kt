package com.example.aspire

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import kotlinx.android.synthetic.main.activity_main5.*

class MainActivity5 : AppCompatActivity() {

    private var showPassword2 = false
    private var showPassword3 = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        eye_icon3.setOnClickListener{
            showPassword3 = !showPassword3
            showAndHide3(showPassword3)
        }
        showAndHide3(showPassword3)

        eye_icon2.setOnClickListener{
            showPassword2 = !showPassword2
            showAndHide2(showPassword2)
        }
        showAndHide2(showPassword2)
    }

    private fun showAndHide2(isShow: Boolean) {
        if (isShow) {
            editTextTextPassword2.transformationMethod = HideReturnsTransformationMethod()
            eye_icon2.setImageResource(R.drawable.eye_icon2)
        } else {
            editTextTextPassword2.transformationMethod = PasswordTransformationMethod.getInstance()
            eye_icon2.setImageResource(R.drawable.eye_icon)
        }
        editTextTextPassword2.setSelection(editTextTextPassword2.text.toString().length)
    }

    private fun showAndHide3(isShow2: Boolean) {
        if (isShow2) {
            editTextTextPassword3.transformationMethod = HideReturnsTransformationMethod()
            eye_icon3.setImageResource(R.drawable.eye_icon2)
        } else {
            editTextTextPassword3.transformationMethod = PasswordTransformationMethod.getInstance()
            eye_icon3.setImageResource(R.drawable.eye_icon)
        }
        editTextTextPassword3.setSelection(editTextTextPassword3.text.toString().length)
    }
}