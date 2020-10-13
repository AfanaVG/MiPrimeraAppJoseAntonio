package com.example.miprimeraappjoseantonio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import  kotlinx.android.synthetic.main.activity_main.*;

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Boton que nos llevara a nuestra activity Nota
        btnNota.setOnClickListener(){
            val intent = Intent(this, Nota::class.java)
            startActivity(intent)
        }
    }


}