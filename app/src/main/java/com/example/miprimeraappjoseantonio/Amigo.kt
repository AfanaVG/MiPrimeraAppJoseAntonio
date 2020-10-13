package com.example.miprimeraappjoseantonio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import kotlinx.android.synthetic.main.activity_amigo.*

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
        val intent = Intent(Intent.ACTION_INSERT).apply {
            type = ContactsContract.Contacts.CONTENT_TYPE
            putExtra(ContactsContract.Intents.Insert.NAME, nombre)
            putExtra(ContactsContract.Intents.Insert.EMAIL, correo)
            putExtra(ContactsContract.Intents.Insert.PHONE, telefono)
        }
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }



}