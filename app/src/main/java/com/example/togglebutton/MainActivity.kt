package com.example.togglebutton

import android.R.attr
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

import android.R.attr.data
import android.graphics.*
import android.widget.CompoundButton
import android.widget.ToggleButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var red: Button
        lateinit var blue: Button
        lateinit var green: Button

        red=findViewById<ToggleButton>(R.id.toggleButtonRed)
        blue=findViewById<ToggleButton>(R.id.toggleButtonBlue)
        green=findViewById<ToggleButton>(R.id.toggleButtonGreen)

        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.cat)
        val bitmapRed = BitmapFactory.decodeResource(resources, R.drawable.red)
        val bitmapBlue = BitmapFactory.decodeResource(resources, R.drawable.blue)
        val bitmapGreen = BitmapFactory.decodeResource(resources, R.drawable.green)
        val filterBitmap = Bitmap.createBitmap(bitmap.width,bitmap.height,Bitmap.Config.ARGB_8888)





        red.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                //odznacza dwa poostale
                    blue.isChecked = false
                    green.isChecked = false



                //magia
                val paint = Paint()
                paint.alpha = 100
                val canvas = Canvas(filterBitmap)
                canvas.drawARGB(0,0,0,0)
                canvas.drawBitmap(bitmapRed,null,RectF(0f,0f,bitmap.width.toFloat(),bitmap.height.toFloat()),paint)
                canvas.drawBitmap(bitmap,0f,0f,paint)



            } else {

            }
        })
        blue.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                //odznacza dwa poostale
                red.isChecked = false
                green.isChecked = false

            } else {

            }
        })
        green.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                //odznacza dwa poostale
                blue.isChecked = false
                red.isChecked = false

            } else {

            }
        })
    }
}
