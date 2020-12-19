package com.example.appclima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var tvCiudad:TextView?=null
    var tvGrados:TextView?=null
    var tvEstatus:TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvCiudad=findViewById(R.id.txtCiudad)
        tvGrados=findViewById(R.id.txtGrados)
        tvEstatus =findViewById(R.id.txtStatus)

        //variable  q recibira valor del intent
        val ciudad = intent.getStringExtra("com.vidammr.appclima.ciudades.CIUDAD")
        Toast.makeText(this,ciudad,Toast.LENGTH_SHORT).show()

        //clase Ciudad
        val ciudadCusco = Ciudad(nombre = "Ciudad de Cusco",grados = 8,estatus = "nublado")
        val ciudadLima = Ciudad(nombre = "Ciudad de Lima",grados = 26,estatus = "soleado")

        if ( ciudad=="ciudad-cusco"){
            //mostrar informacion
            tvCiudad?.text=ciudadCusco.nombre
            tvGrados?.text=ciudadCusco.grados.toString()+"°"
            tvEstatus?.text=ciudadCusco.estatus
        }
        else if (ciudad=="ciudad-lima"){
            //mostrar informacion
            tvCiudad?.text=ciudadLima.nombre
            tvGrados?.text=ciudadLima.grados.toString()+"°"
            tvEstatus?.text=ciudadLima.estatus
        }
        else{

            Toast.makeText(this,"no se encuentra informacion",Toast.LENGTH_SHORT).show()
        }

    }
}