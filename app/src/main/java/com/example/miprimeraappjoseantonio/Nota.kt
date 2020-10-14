package com.example.miprimeraappjoseantonio

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.actions.NoteIntents
import kotlinx.android.synthetic.main.activity_nota.*


class Nota : AppCompatActivity() {

    //Variable que controlan la nota minima y maxima que acepta la aplicación
    private var NOTA_MAXIMA = 10
    private var NOTA_MINIMA = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nota)

        //Nuestro boton llamara al metodo introducirNota()
        btnNota_Nota.setOnClickListener(){
                newNote()
            }

    }

    //El metodo recibe las variables que controlan la nota minima y maxima
    private fun introducirNota(maxNota:Int,minNota: Int){
        //Si la nota no entra en el rango aceptado por la aplicación saltara un mensaje de error. En caso contrario confirmara la nota
        if (edtxtNota_Nota.text.toString().toInt()> maxNota || edtxtNota_Nota.text.toString().toInt()< minNota){
            Toast.makeText(this,"La nota debe estar entre "+minNota+" y "+maxNota, Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this,"Has introducido la nota "+edtxtNota_Nota.text.toString(), Toast.LENGTH_SHORT).show()
        }

    }

    private fun newNote() {
        val label = "Title"
        val main = "This is the body of the note"
        val intent = Intent()
        intent.setAction(NoteIntents.ACTION_CREATE_NOTE)
            .putExtra(NoteIntents.EXTRA_NAME, label)
            .putExtra(NoteIntents.EXTRA_TEXT, main)
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            Toast.makeText(this, "No App Available", Toast.LENGTH_SHORT).show()
        }
    }
}