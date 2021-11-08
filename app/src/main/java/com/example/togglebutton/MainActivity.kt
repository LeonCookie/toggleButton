package com.example.togglebutton

import android.R.attr
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

import android.R.attr.data
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

            red.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(this,"Turned On",Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this,"Turned Off",Toast.LENGTH_LONG).show()
            }
        })
    }
}
