package com.example.togglebutton

import android.R.attr
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.R.attr.data
import android.graphics.*
import android.widget.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var red: Button
        lateinit var blue: Button
        lateinit var green: Button
        lateinit var cat: ImageView

        red=findViewById<ToggleButton>(R.id.toggleButtonRed)
        blue=findViewById<ToggleButton>(R.id.toggleButtonBlue)
        green=findViewById<ToggleButton>(R.id.toggleButtonGreen)
        cat = findViewById<ImageView>(R.id.imageCat)

        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.cat)
        val bitmapRed = BitmapFactory.decodeResource(resources, R.drawable.red)
        val bitmapBlue = BitmapFactory.decodeResource(resources, R.drawable.blue)
        val bitmapGreen = BitmapFactory.decodeResource(resources, R.drawable.green)
        val filterBitmap = Bitmap.createBitmap(bitmap.width,bitmap.height,Bitmap.Config.ARGB_8888)

        red.setBackgroundColor(Color.GRAY)
        blue.setBackgroundColor(Color.GRAY)
        green.setBackgroundColor(Color.GRAY)



        red.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                //odznacza dwa poostale
                    blue.isChecked = false
                    green.isChecked = false


                //kolor
                red.setBackgroundColor(Color.RED)

                //magia
                val paint = Paint()
                paint.alpha = 100
                val canvas = Canvas(filterBitmap)
                canvas.drawARGB(0,0,0,0)
                canvas.drawBitmap(bitmapRed,null,RectF(0f,0f,bitmap.width.toFloat(),bitmap.height.toFloat()),paint)
                canvas.drawBitmap(bitmap,0f,0f,paint)
                cat.setImageBitmap(filterBitmap)




            } else {
                //kolor
                red.setBackgroundColor(Color.GRAY)
                cat.setImageBitmap(bitmap)
            }
        })
        blue.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                //odznacza dwa poostale
                red.isChecked = false
                green.isChecked = false


                //kolor
                blue.setBackgroundColor(Color.BLUE)

                //magia
                val paint = Paint()
                paint.alpha = 100
                val canvas = Canvas(filterBitmap)
                canvas.drawARGB(0,0,0,0)
                canvas.drawBitmap(bitmapBlue,null,RectF(0f,0f,bitmap.width.toFloat(),bitmap.height.toFloat()),paint)
                canvas.drawBitmap(bitmap,0f,0f,paint)
                cat.setImageBitmap(filterBitmap)
            } else {
                //kolor
                blue.setBackgroundColor(Color.GRAY)
                cat.setImageBitmap(bitmap)
            }
        })
        green.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                //odznacza dwa poostale
                blue.isChecked = false
                red.isChecked = false


                //kolor
                green.setBackgroundColor(Color.GREEN)


                //magia
                val paint = Paint()
                paint.alpha = 100
                val canvas = Canvas(filterBitmap)
                canvas.drawARGB(0,0,0,0)
                canvas.drawBitmap(bitmapGreen,null,RectF(0f,0f,bitmap.width.toFloat(),bitmap.height.toFloat()),paint)
                canvas.drawBitmap(bitmap,0f,0f,paint)
                cat.setImageBitmap(filterBitmap)
            } else {
                //kolor
                //kolor
                green.setBackgroundColor(Color.GRAY)
                cat.setImageBitmap(bitmap)

            }
        })
    }
}
