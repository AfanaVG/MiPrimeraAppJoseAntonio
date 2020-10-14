package com.example.miprimeraappjoseantonio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        //Este sleep no es necesario, es solo para comprobar que nuestra splashScreen funciona
        Thread.sleep(1000)
        //Inicia la vista de nuestro Main cuando termine de iniciarse la aplicacion
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Botones que iniciaran nuestras distintas activities
         */
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