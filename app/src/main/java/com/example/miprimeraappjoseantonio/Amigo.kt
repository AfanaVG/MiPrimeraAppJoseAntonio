package com.example.miprimeraappjoseantonio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.util.Patterns
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_amigo.*
import java.util.regex.Pattern

class Amigo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amigo)

        btnRegistrar_Amigo.setOnClickListener(){
            var nombre = edtxtNombre_Amigo.text.toString()
            var  correo = edtxtCorreo_Amigo.text.toString()
            var telefono = edtxtTelefono_Amigo.text.toString()
            registrarContacto(nombre,correo,telefono)
        }
    }

    fun registrarContacto(nombre: String, correo: String,telefono:String) {
        if (validarEmail(correo)) {
            val intent = Intent(Intent.ACTION_INSERT).apply {
                type = ContactsContract.Contacts.CONTENT_TYPE
                putExtra(ContactsContract.Intents.Insert.NAME, nombre)
                putExtra(ContactsContract.Intents.Insert.EMAIL, correo)
                putExtra(ContactsContract.Intents.Insert.PHONE, telefono)
            }
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }else{
            Toast.makeText(this,"El email no es valido",Toast.LENGTH_SHORT).show()
        }
    }

    private fun validarEmail(correo:String): Boolean {
        var pattern: Pattern = Patterns.EMAIL_ADDRESS
        return pattern.matcher(correo).matches();
    }



}