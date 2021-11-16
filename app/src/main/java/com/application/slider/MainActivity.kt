package com.application.slider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatImageView
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var key = mutableListOf(false,false,false,false,false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  images = listOf(
            R.drawable.facebook,
            R.drawable.coach_placeholder,
            R.drawable.mobc,
            R.drawable.facebook,
            R.drawable.coach_placeholder,
            R.drawable.mobc
        )
        val adapter = ViewPagerAdapter(images)
        viewPager.adapter =adapter
        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        //Calling Custom Rating Bar Listener
        setRatingBarListener()
    }
    private fun setRatingBarListener(){
        // Custom Rating Bar
        ivStar1.setOnClickListener {
            if(key[0])
            {
                if(key[0+1])
                {
                    setImage(1,ivStar2,false,R.drawable.ic_unselect_star)
                    setImage(2,ivStar3,false,R.drawable.ic_unselect_star)
                    setImage(3,ivStar4,false,R.drawable.ic_unselect_star)
                    setImage(4,ivStar5,false,R.drawable.ic_unselect_star)
                }
                else
                {
                    setImage(0,ivStar1,false,R.drawable.ic_unselect_star)
                }
            }
            else
            {
                setImage(0,ivStar1,true,R.drawable.ic_select_star)
            }
        }
        ivStar2.setOnClickListener {
            if(key[1])
            {
                if(key[1+1])
                {
                    setImage(2,ivStar3,false,R.drawable.ic_unselect_star)
                    setImage(3,ivStar4,false,R.drawable.ic_unselect_star)
                    setImage(4,ivStar5,false,R.drawable.ic_unselect_star)
                }
                else
                {
                    setImage(0,ivStar1,false,R.drawable.ic_unselect_star)
                    setImage(1,ivStar2,false,R.drawable.ic_unselect_star)
                }
            }
            else
            {
                setImage(0,ivStar1,true,R.drawable.ic_select_star)
                setImage(1,ivStar2,true,R.drawable.ic_select_star)
            }
        }
        ivStar3.setOnClickListener {
            if(key[2])
            {
                if(key[2+1])
                {
                    setImage(3,ivStar4,false,R.drawable.ic_unselect_star)
                    setImage(4,ivStar5,false,R.drawable.ic_unselect_star)
                }
                else
                {
                    setImage(0,ivStar1,false,R.drawable.ic_unselect_star)
                    setImage(1,ivStar2,false,R.drawable.ic_unselect_star)
                    setImage(2,ivStar3,false,R.drawable.ic_unselect_star)
                }
            }
            else
            {
                setImage(0,ivStar1,true,R.drawable.ic_select_star)
                setImage(1,ivStar2,true,R.drawable.ic_select_star)
                setImage(2,ivStar3,true,R.drawable.ic_select_star)
            }
        }
        ivStar4.setOnClickListener {
            if(key[3])
            {
                if(key[3+1])
                {
                    setImage(4,ivStar5,false,R.drawable.ic_unselect_star)
                }
                else
                {
                    setImage(0,ivStar1,false,R.drawable.ic_unselect_star)
                    setImage(1,ivStar2,false,R.drawable.ic_unselect_star)
                    setImage(2,ivStar3,false,R.drawable.ic_unselect_star)
                    setImage(3,ivStar4,false,R.drawable.ic_unselect_star)
                }
            }
            else
            {
                setImage(0,ivStar1,true,R.drawable.ic_select_star)
                setImage(1,ivStar2,true,R.drawable.ic_select_star)
                setImage(2,ivStar3,true,R.drawable.ic_select_star)
                setImage(3,ivStar4,true,R.drawable.ic_select_star)
            }
        }
        ivStar5.setOnClickListener {
            if(key[4])
            {
                setImage(0,ivStar1,false,R.drawable.ic_unselect_star)
                setImage(1,ivStar2,false,R.drawable.ic_unselect_star)
                setImage(2,ivStar3,false,R.drawable.ic_unselect_star)
                setImage(3,ivStar4,false,R.drawable.ic_unselect_star)
                setImage(4,ivStar5,false,R.drawable.ic_unselect_star)

            }
            else
            {
                setImage(0,ivStar1,true,R.drawable.ic_select_star)
                setImage(1,ivStar2,true,R.drawable.ic_select_star)
                setImage(2,ivStar3,true,R.drawable.ic_select_star)
                setImage(3,ivStar4,true,R.drawable.ic_select_star)
                setImage(4,ivStar5,true,R.drawable.ic_select_star)
            }
        }
    }
    private fun setImage(index:Int,idImage:AppCompatImageView,b:Boolean,iv:Int)
    {
        key[index]=b
        idImage.setImageResource(iv)
    }
}