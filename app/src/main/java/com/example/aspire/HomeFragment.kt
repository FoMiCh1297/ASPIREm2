package com.example.aspire

import android.animation.ValueAnimator
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main_page.*

class HomeFragment : Fragment (R.layout.activity_main_page)

{
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {

        val root = inflater.inflate(R.layout.activity_main_page, container, false)
        val buttonCalculate = root.findViewById(R.id.like) as RadioButton
        val buttonCalculate2 = root.findViewById(R.id.newest) as RadioButton
        val buttonCalculate3 = root.findViewById(R.id.sale) as RadioButton

        val group1 = root.findViewById(R.id.group1) as ImageView

        group1.setOnClickListener{
            activity?.let {
                val intent = Intent(it, DishDescription::class.java)
                it.startActivity(intent)
            }
        }

        buttonCalculate.isChecked=true
        buttonCalculate.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {

                val anim_r1_on1 =
                    ValueAnimator.ofInt(buttonCalculate.getMeasuredHeight(), 305)
                anim_r1_on1.addUpdateListener { valueAnimator ->

                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        buttonCalculate.getLayoutParams()
                    layoutParams.width = `val`
                    buttonCalculate.setLayoutParams(layoutParams)
                }
                anim_r1_on1.setDuration(500);
                anim_r1_on1.start()

                buttonCalculate.isClickable = false
                buttonCalculate2.isClickable = true
                buttonCalculate3.isClickable = true
                buttonCalculate.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.white_hand_like,
                    0,
                    0,
                    0
                );
                buttonCalculate2.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.newest,
                    0,
                    0,
                    0
                );
                buttonCalculate3.setCompoundDrawablesWithIntrinsicBounds(R.drawable.sale, 0, 0, 0);


            } else if (buttonCalculate2.isChecked) {

                val anim_r1_on1 =
                    ValueAnimator.ofInt(buttonCalculate.getMeasuredWidth(), 130)
                anim_r1_on1.addUpdateListener { valueAnimator ->
                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        buttonCalculate.getLayoutParams()
                    layoutParams.width = `val`
                    buttonCalculate.setLayoutParams(layoutParams)
                }
                anim_r1_on1.setDuration(400);
                anim_r1_on1.start()


            } else if (buttonCalculate3.isChecked) {

                val anim_r1_on1 =
                    ValueAnimator.ofInt(buttonCalculate.getMeasuredWidth(), 130)
                anim_r1_on1.addUpdateListener { valueAnimator ->

                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        buttonCalculate.getLayoutParams()
                    layoutParams.width = `val`
                    buttonCalculate.setLayoutParams(layoutParams)
                }
                anim_r1_on1.setDuration(400);
                anim_r1_on1.start()


            }
        }
        buttonCalculate2.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                val anim_r1_on1 =
                    ValueAnimator.ofInt(buttonCalculate2.getMeasuredHeight(), 240)
                anim_r1_on1.addUpdateListener { valueAnimator ->

                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        buttonCalculate2.getLayoutParams()
                    layoutParams.width = `val`
                    buttonCalculate2.setLayoutParams(layoutParams)
                }
                anim_r1_on1.setDuration(400);
                anim_r1_on1.start()
                buttonCalculate.width=70
                buttonCalculate2.width=151
                buttonCalculate3.width=70
                buttonCalculate.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.black_hand_like,
                    0,
                    0,
                    0
                );
                buttonCalculate2.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.white_newest,
                    0,
                    0,
                    0
                );
                buttonCalculate3.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.sale,
                    0,
                    0,
                    0
                );
                buttonCalculate.isClickable = true
                buttonCalculate2.isClickable = false
                buttonCalculate3.isClickable = true
                val anim_r1_on =
                    ValueAnimator.ofInt(buttonCalculate.getMeasuredWidth(), 130)
                anim_r1_on.addUpdateListener { valueAnimator ->
                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        buttonCalculate.getLayoutParams()
                    layoutParams.width = `val`
                    buttonCalculate.setLayoutParams(layoutParams)
                }
                anim_r1_on.setDuration(400);
                anim_r1_on.start()



            } else if (buttonCalculate.isChecked) {
                val anim_r1_on1 =
                    ValueAnimator.ofInt(buttonCalculate2.getMeasuredWidth(), 130)
                anim_r1_on1.addUpdateListener { valueAnimator ->

                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        buttonCalculate2.getLayoutParams()
                    layoutParams.width = `val`
                    buttonCalculate2.setLayoutParams(layoutParams)
                }
                anim_r1_on1.setDuration(400);
                anim_r1_on1.start()

            } else if (buttonCalculate3.isChecked) {
                val anim_r1_on1 =
                    ValueAnimator.ofInt(buttonCalculate2.getMeasuredWidth(), 130)
                anim_r1_on1.addUpdateListener { valueAnimator ->

                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        buttonCalculate2.getLayoutParams()
                    layoutParams.width = `val`
                    buttonCalculate2.setLayoutParams(layoutParams)
                }
                anim_r1_on1.setDuration(400);
                anim_r1_on1.start()

            }
        }
        buttonCalculate3.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                val anim_r1_on1 =
                    ValueAnimator.ofInt(buttonCalculate3.getMeasuredHeight(), 255)
                anim_r1_on1.addUpdateListener { valueAnimator ->

                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        buttonCalculate3.getLayoutParams()
                    layoutParams.width = `val`
                    buttonCalculate3.setLayoutParams(layoutParams)
                }
                anim_r1_on1.setDuration(400);
                anim_r1_on1.start()
                buttonCalculate.width=70
                buttonCalculate2.width=70
                buttonCalculate3.width=151
                buttonCalculate.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.black_hand_like,
                    0,
                    0,
                    0
                );
                buttonCalculate2.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.newest,
                    0,
                    0,
                    0
                );
                buttonCalculate3.setCompoundDrawablesWithIntrinsicBounds(
                    R.drawable.white_sale,
                    0,
                    0,
                    0
                );
                buttonCalculate.isClickable = true
                buttonCalculate2.isClickable = true
                buttonCalculate3.isClickable = false

                val anim_r1_on =
                    ValueAnimator.ofInt(buttonCalculate.getMeasuredWidth(), 130)
                anim_r1_on.addUpdateListener { valueAnimator ->
                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        buttonCalculate.getLayoutParams()
                    layoutParams.width = `val`
                    buttonCalculate.setLayoutParams(layoutParams)
                }
                anim_r1_on.setDuration(400);
                anim_r1_on.start()
                buttonCalculate.width=70
                buttonCalculate2.width=70
                buttonCalculate3.width=151

            } else if (buttonCalculate2.isChecked) {
                val anim_r1_on1 =
                    ValueAnimator.ofInt(buttonCalculate3.getMeasuredWidth(), 130)
                anim_r1_on1.addUpdateListener { valueAnimator ->

                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        buttonCalculate3.getLayoutParams()
                    layoutParams.width = `val`
                    buttonCalculate3.setLayoutParams(layoutParams)
                }
                anim_r1_on1.setDuration(400);
                anim_r1_on1.start()

            } else if (buttonCalculate.isChecked) {
                val anim_r1_on1 =
                    ValueAnimator.ofInt(buttonCalculate3.getMeasuredWidth(), 130)
                anim_r1_on1.addUpdateListener { valueAnimator ->

                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        buttonCalculate3.getLayoutParams()
                    layoutParams.width = `val`
                    buttonCalculate3.setLayoutParams(layoutParams)
                }
                anim_r1_on1.setDuration(400);
                anim_r1_on1.start()

            }
        }
        return root


    }

}


