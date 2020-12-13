package com.example.appclima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //variable  q recibira valor del intent
        val ciudad = intent.getStringExtra("com.vidammr.appclima.ciudades.CIUDAD")
        Toast.makeText(this,ciudad,Toast.LENGTH_SHORT).show()
    }
}