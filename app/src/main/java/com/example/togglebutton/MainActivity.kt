package com.example.togglebutton

import android.R.attr
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

import android.R.attr.data




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var red: Button
        lateinit var blue: Button
        lateinit var green: Button

        red=findViewById<Button>(R.id.toggleButtonRed)
        blue=findViewById<Button>(R.id.toggleButtonBlue)
        green=findViewById<Button>(R.id.toggleButtonGreen)

        red.setOnClickListener {
            if(red.text.toString() == "ON"){
                Toast.makeText(this@MainActivity, "Red ON", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this@MainActivity, "Red OFF", Toast.LENGTH_SHORT).show()
            }
        }
    }
}