package com.example.appclima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import java.io.BufferedReader

class Ciudades : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)

        //acceder a los botones de las ciudades
        val btnCusco = findViewById<Button>(R.id.btnCusco)
        val btnLima = findViewById<Button>(R.id.btnLima)
        val botonAboutMe = findViewById<Button>(R.id.btnAboutMe)

        btnCusco.setOnClickListener(View.OnClickListener {
//            Toast.makeText(this, "Clima de cusco seleccionado", Toast.LENGTH_SHORT).show()

            //intent  para ir a la pagina MainActivity con el boton
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        })
        btnLima.setOnClickListener(View.OnClickListener {
//            Toast.makeText(this, "Clima de lima seleccionado", Toast.LENGTH_SHORT).show()

            //intent  para ir a la pagina MainActivity con el boton
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        })


    }
}