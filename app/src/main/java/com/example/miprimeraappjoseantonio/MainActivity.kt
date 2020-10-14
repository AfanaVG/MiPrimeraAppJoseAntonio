package com.example.miprimeraappjoseantonio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(1000)
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNota.setOnClickListener(){

            val intent = Intent(this,Nota::class.java)
            startActivity(intent)
        }

        btnAcercaDe.setOnClickListener(){

            val intent = Intent(this,AcercaDe::class.java)
            startActivity(intent)
        }

        //Boton que nos llevara a nuestra activity Amigo
        btnAmigo.setOnClickListener(){
            val intent = Intent(this, Amigo::class.java)
            startActivity(intent)
        }

        btnCita.setOnClickListener(){
            val intent = Intent(this, Cita::class.java)
            startActivity(intent)
        }

        btnCorreo.setOnClickListener(){
            val intent = Intent(this, Correo::class.java)
            startActivity(intent)
        }

    }
}