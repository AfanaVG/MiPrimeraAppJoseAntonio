package com.example.miprimeraappjoseantonio

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.actions.NoteIntents
import kotlinx.android.synthetic.main.activity_nota.*


class Nota : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nota)

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