package com.example.miprimeraappjoseantonio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.gms.actions.NoteIntents
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_nota.*
import com.google.android.material.snackbar.Snackbar.make as make1

class Nota : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nota)

        //Nuestro boton llamara al metodo introducirNota()
        btnNota_Nota.setOnClickListener(){
            nuevaNota()
            }

    }

    private fun nuevaNota() {

        val intent = Intent()
        intent.setAction(NoteIntents.ACTION_CREATE_NOTE)
            .putExtra(NoteIntents.EXTRA_NAME, edtxtTitulo_Nota.text.toString())
            .putExtra(NoteIntents.EXTRA_TEXT, edtxtNota_Nota.text.toString())
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            Toast.makeText(this, "No existe aplicación de tomar notas", Toast.LENGTH_SHORT).show()
        }
    }
}