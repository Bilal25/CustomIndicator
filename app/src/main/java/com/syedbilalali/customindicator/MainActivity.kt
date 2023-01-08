package com.syedbilalali.customindicator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.syedbilalali.customindicatorv2.IndicatorSeekBar
import com.syedbilalali.customindicatorv2.OnSeekChangeListener
import com.syedbilalali.customindicatorv2.SeekParams

class MainActivity : AppCompatActivity() {
    var deliverTimeSeekbar: IndicatorSeekBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // deliverTimeSeekbar = findViewById(R.id.seekbarUI)

//        deliverTimeSeekbar?.setIndicatorTextFormat(
//             " (Delivery Charge "
//            , Color.parseColor("#000000"))

                val percent_indicator: IndicatorSeekBar =
            findViewById<IndicatorSeekBar>(R.id.seekbarUI)
        percent_indicator.setIndicatorTextFormat("\${PROGRESS} %",Color.parseColor("#000000"))
        percent_indicator.setOnSeekChangeListener(object : OnSeekChangeListener {
            override fun onSeeking(seekParams: SeekParams) {

//                        deliverTimeSeekbar?.setIndicatorTextFormat(
//             " (Delivery Charge "
//            , Color.parseColor("#000000"))

                percent_indicator.setmIndicatorColor(Color.parseColor("#000000"))
            }

            override fun onStartTrackingTouch(seekBar: IndicatorSeekBar) {

            }

            override fun onStopTrackingTouch(seekBar: IndicatorSeekBar) {

            }
        })


    }
}