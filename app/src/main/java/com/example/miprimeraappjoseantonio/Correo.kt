package com.example.miprimeraappjoseantonio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import kotlinx.android.synthetic.main.activity_correo.*
import java.util.regex.Pattern

class Correo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_correo)

        btnEnviar_Correo.setOnClickListener(){

        }
    }


    private fun validarEmail(correo:String): Boolean {
        var pattern:Pattern = Patterns.EMAIL_ADDRESS
        return pattern.matcher(correo).matches();
    }
}