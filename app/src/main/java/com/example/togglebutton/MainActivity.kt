package com.example.togglebutton

import android.R.attr
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

import android.R.attr.data
import android.graphics.BitmapFactory
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





        red.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                //odznacza dwa poostale
                    blue.isChe
                Toast.makeText(this,"red On",Toast.LENGTH_LONG).show()
            } else {

            }
        })
        blue.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(this,"blue On",Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this,"blue Off",Toast.LENGTH_LONG).show()
            }
        })
        green.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(this,"green On",Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this,"Tgreen Off",Toast.LENGTH_LONG).show()
            }
        })
    }
}
