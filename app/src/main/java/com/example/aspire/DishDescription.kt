package com.example.aspire

import android.animation.ValueAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_dish_description.*

class DishDescription : AppCompatActivity() {
    fun plus(view:View){
        val countString= text_count.text.toString()
        var count: Int = Integer.parseInt(countString)
        count++
        text_count.text = count.toString()
        if (count==1){
            button_minus.isClickable = true
            val anim_r1_on1 =
                ValueAnimator.ofInt(layout_plus_minus.getMeasuredHeight(), 60)
            anim_r1_on1.addUpdateListener { valueAnimator ->

                val `val` = valueAnimator.animatedValue as Int
                val layoutParams: ViewGroup.LayoutParams =
                    layout_plus_minus.getLayoutParams()
                layoutParams.width = `val`
                layout_plus_minus.setLayoutParams(layoutParams)
            }
            anim_r1_on1.setDuration(100);
            anim_r1_on1.start()

        }

    }
    fun minus(view:View){
        val countString= text_count.text.toString()

        var count: Int = Integer.parseInt(countString)
        count--

        text_count.text = count.toString()
        if (count==0){
            button_minus.isClickable = false

            val anim_r1_on1 =
                ValueAnimator.ofInt(layout_plus_minus.getMeasuredHeight(),1)
            anim_r1_on1.addUpdateListener { valueAnimator ->

                val `val` = valueAnimator.animatedValue as Int
                val layoutParams: ViewGroup.LayoutParams =
                    layout_plus_minus.getLayoutParams()
                layoutParams.width = `val`
                layout_plus_minus.setLayoutParams(layoutParams)
            }
            anim_r1_on1.setDuration(400);
            anim_r1_on1.start()


        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dish_description)

        rectangle1.setOnClickListener{
            val intent = Intent(this, AddToBasket::class.java)
            startActivity(intent)
        }

        button_menu.isChecked = true

        button_menu.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {

                val anim_r1_on1 =
                    ValueAnimator.ofInt(button_menu.getMeasuredHeight(), 305)
                anim_r1_on1.addUpdateListener { valueAnimator ->

                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        button_menu.getLayoutParams()
                    layoutParams.width = `val`
                    button_menu.setLayoutParams(layoutParams)
                }
                anim_r1_on1.setDuration(500);
                anim_r1_on1.start()

                button_menu.isClickable = false
                button_cold.isClickable = true
                button_hot.isClickable = true
                button_menu.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.button_menu_white,
                    0,
                    0,
                    0
                );
                button_cold.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.button_cold,
                    0,
                    0,
                    0
                );
                button_hot.setCompoundDrawablesWithIntrinsicBounds(R.drawable.button_hot, 0, 0, 0);
                button_drink.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.button_drink,
                    0,
                    0,
                    0
                );

            } else if (button_cold.isChecked) {

                val anim_r1_on1 =
                    ValueAnimator.ofInt(button_menu.getMeasuredWidth(), 130)
                anim_r1_on1.addUpdateListener { valueAnimator ->
                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        button_menu.getLayoutParams()
                    layoutParams.width = `val`
                    button_menu.setLayoutParams(layoutParams)
                }
                anim_r1_on1.setDuration(400);
                anim_r1_on1.start()


            } else if (button_hot.isChecked) {

                val anim_r1_on1 =
                    ValueAnimator.ofInt(button_menu.getMeasuredWidth(), 130)
                anim_r1_on1.addUpdateListener { valueAnimator ->

                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        button_menu.getLayoutParams()
                    layoutParams.width = `val`
                    button_menu.setLayoutParams(layoutParams)
                }
                anim_r1_on1.setDuration(400);
                anim_r1_on1.start()


            } else if (button_drink.isChecked) {

                val anim_r1_on1 =
                    ValueAnimator.ofInt(button_menu.getMeasuredWidth(), 130)
                anim_r1_on1.addUpdateListener { valueAnimator ->

                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        button_menu.getLayoutParams()
                    layoutParams.width = `val`
                    button_menu.setLayoutParams(layoutParams)
                }
                anim_r1_on1.setDuration(400);
                anim_r1_on1.start()


            }
        }
        button_cold.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                val anim_r1_on1 =
                    ValueAnimator.ofInt(button_cold.getMeasuredHeight(), 240)
                anim_r1_on1.addUpdateListener { valueAnimator ->

                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        button_cold.getLayoutParams()
                    layoutParams.width = `val`
                    button_cold.setLayoutParams(layoutParams)
                }
                anim_r1_on1.setDuration(400);
                anim_r1_on1.start()
                button_menu.width = 70
                button_cold.width = 151
                button_hot.width = 70
                button_menu.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.button_menu,
                    0,
                    0,
                    0
                );
                button_cold.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.button_cold_white,
                    0,
                    0,
                    0
                );
                button_hot.setCompoundDrawablesWithIntrinsicBounds(R.drawable.button_hot, 0, 0, 0);
                button_drink.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.button_drink,
                    0,
                    0,
                    0
                );
                button_menu.isClickable = true
                button_cold.isClickable = false
                button_hot.isClickable = true
                val anim_r1_on =
                    ValueAnimator.ofInt(button_menu.getMeasuredWidth(), 130)
                anim_r1_on.addUpdateListener { valueAnimator ->
                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        button_menu.getLayoutParams()
                    layoutParams.width = `val`
                    button_menu.setLayoutParams(layoutParams)
                }
                anim_r1_on.setDuration(400);
                anim_r1_on.start()


            } else if (button_menu.isChecked) {
                val anim_r1_on1 =
                    ValueAnimator.ofInt(button_cold.getMeasuredWidth(), 130)
                anim_r1_on1.addUpdateListener { valueAnimator ->

                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        button_cold.getLayoutParams()
                    layoutParams.width = `val`
                    button_cold.setLayoutParams(layoutParams)
                }
                anim_r1_on1.setDuration(400);
                anim_r1_on1.start()

            } else if (button_hot.isChecked) {
                val anim_r1_on1 =
                    ValueAnimator.ofInt(button_cold.getMeasuredWidth(), 130)
                anim_r1_on1.addUpdateListener { valueAnimator ->

                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        button_cold.getLayoutParams()
                    layoutParams.width = `val`
                    button_cold.setLayoutParams(layoutParams)
                }
                anim_r1_on1.setDuration(400);
                anim_r1_on1.start()

            } else if (button_drink.isChecked) {
                val anim_r1_on1 =
                    ValueAnimator.ofInt(button_cold.getMeasuredWidth(), 130)
                anim_r1_on1.addUpdateListener { valueAnimator ->

                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        button_cold.getLayoutParams()
                    layoutParams.width = `val`
                    button_cold.setLayoutParams(layoutParams)
                }
                anim_r1_on1.setDuration(400);
                anim_r1_on1.start()

            }
        }
        button_hot.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                val anim_r1_on1 =
                    ValueAnimator.ofInt(button_hot.getMeasuredHeight(), 255)
                anim_r1_on1.addUpdateListener { valueAnimator ->

                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        button_hot.getLayoutParams()
                    layoutParams.width = `val`
                    button_hot.setLayoutParams(layoutParams)
                }
                anim_r1_on1.setDuration(400);
                anim_r1_on1.start()
                button_menu.width = 70
                button_cold.width = 70
                button_hot.width = 151
                button_menu.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.button_menu,
                    0,
                    0,
                    0
                );
                button_cold.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.button_cold,
                    0,
                    0,
                    0
                );
                button_hot.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.button_hot_white,
                    0,
                    0,
                    0
                );
                button_drink.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.button_drink,
                    0,
                    0,
                    0
                );
                button_menu.isClickable = true
                button_cold.isClickable = true
                button_hot.isClickable = false

                val anim_r1_on =
                    ValueAnimator.ofInt(button_menu.getMeasuredWidth(), 130)
                anim_r1_on.addUpdateListener { valueAnimator ->
                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        button_menu.getLayoutParams()
                    layoutParams.width = `val`
                    button_menu.setLayoutParams(layoutParams)
                }
                anim_r1_on.setDuration(400);
                anim_r1_on.start()
                button_menu.width = 70
                button_cold.width = 70
                button_hot.width = 151

            } else if (button_cold.isChecked) {
                val anim_r1_on1 =
                    ValueAnimator.ofInt(button_hot.getMeasuredWidth(), 130)
                anim_r1_on1.addUpdateListener { valueAnimator ->

                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        button_hot.getLayoutParams()
                    layoutParams.width = `val`
                    button_hot.setLayoutParams(layoutParams)
                }
                anim_r1_on1.setDuration(400);
                anim_r1_on1.start()

            } else if (button_menu.isChecked) {
                val anim_r1_on1 =
                    ValueAnimator.ofInt(button_hot.getMeasuredWidth(), 130)
                anim_r1_on1.addUpdateListener { valueAnimator ->

                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        button_hot.getLayoutParams()
                    layoutParams.width = `val`
                    button_hot.setLayoutParams(layoutParams)
                }
                anim_r1_on1.setDuration(400);
                anim_r1_on1.start()

            } else if (button_drink.isChecked) {
                val anim_r1_on1 =
                    ValueAnimator.ofInt(button_hot.getMeasuredWidth(), 130)
                anim_r1_on1.addUpdateListener { valueAnimator ->

                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        button_hot.getLayoutParams()
                    layoutParams.width = `val`
                    button_hot.setLayoutParams(layoutParams)
                }
                anim_r1_on1.setDuration(400);
                anim_r1_on1.start()

            }
        }
        button_drink.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                val anim_r1_on1 =
                    ValueAnimator.ofInt(button_drink.getMeasuredHeight(), 255)
                anim_r1_on1.addUpdateListener { valueAnimator ->

                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        button_drink.getLayoutParams()
                    layoutParams.width = `val`
                    button_drink.setLayoutParams(layoutParams)
                }
                anim_r1_on1.setDuration(400);
                anim_r1_on1.start()
                button_menu.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.button_menu,
                    0,
                    0,
                    0
                );
                button_cold.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.button_cold,
                    0,
                    0,
                    0
                );
                button_hot.setCompoundDrawablesWithIntrinsicBounds(R.drawable.button_hot, 0, 0, 0);
                button_drink.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.button_drink_white,
                    0,
                    0,
                    0
                );
                button_menu.isClickable = true
                button_cold.isClickable = true
                button_hot.isClickable = true
                button_drink.isClickable = false
                val anim_r1_on =
                    ValueAnimator.ofInt(button_menu.getMeasuredWidth(), 130)
                anim_r1_on.addUpdateListener { valueAnimator ->
                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        button_menu.getLayoutParams()
                    layoutParams.width = `val`
                    button_menu.setLayoutParams(layoutParams)
                }
                anim_r1_on.setDuration(400);
                anim_r1_on.start()
            } else if (button_cold.isChecked) {
                val anim_r1_on1 =
                    ValueAnimator.ofInt(button_drink.getMeasuredWidth(), 130)
                anim_r1_on1.addUpdateListener { valueAnimator ->

                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        button_drink.getLayoutParams()
                    layoutParams.width = `val`
                    button_drink.setLayoutParams(layoutParams)
                }
                anim_r1_on1.setDuration(400);
                anim_r1_on1.start()

            } else if (button_menu.isChecked) {
                val anim_r1_on1 =
                    ValueAnimator.ofInt(button_drink.getMeasuredWidth(), 130)
                anim_r1_on1.addUpdateListener { valueAnimator ->

                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        button_drink.getLayoutParams()
                    layoutParams.width = `val`
                    button_drink.setLayoutParams(layoutParams)
                }
                anim_r1_on1.setDuration(400);
                anim_r1_on1.start()

            } else if (button_hot.isChecked) {
                val anim_r1_on1 =
                    ValueAnimator.ofInt(button_drink.getMeasuredWidth(), 130)
                anim_r1_on1.addUpdateListener { valueAnimator ->

                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        button_drink.getLayoutParams()
                    layoutParams.width = `val`
                    button_drink.setLayoutParams(layoutParams)
                }
                anim_r1_on1.setDuration(400);
                anim_r1_on1.start()

            }
        }
        details2.isClickable = false
        details2.visibility = View.INVISIBLE
        details.setOnClickListener {

            val anim_r1_on1 =
                ValueAnimator.ofInt(content_details.measuredHeightAndState, 500)
            anim_r1_on1.addUpdateListener { valueAnimator ->

                val `val` = valueAnimator.animatedValue as Int
                val layoutParams: ViewGroup.LayoutParams =
                    content_details.getLayoutParams()
                layoutParams.height = `val`
                content_details.setLayoutParams(layoutParams)
            }
            anim_r1_on1.setDuration(400);
            anim_r1_on1.start()
            details.isClickable = false
            details2.isClickable = true
            details2.visibility = View.VISIBLE
            details.visibility = View.INVISIBLE
        }
        details2.setOnClickListener {

            val anim_r1_on1 =
                ValueAnimator.ofInt(content_details.measuredHeightAndState, 0)
            anim_r1_on1.addUpdateListener { valueAnimator ->

                val `val` = valueAnimator.animatedValue as Int
                val layoutParams: ViewGroup.LayoutParams =
                    content_details.getLayoutParams()
                layoutParams.height = `val`
                content_details.setLayoutParams(layoutParams)
            }
            anim_r1_on1.setDuration(400);
            anim_r1_on1.start()
            details.isClickable = true
            details2.isClickable = false
            details2.visibility = View.INVISIBLE
            details.visibility = View.VISIBLE
        }
    }
}