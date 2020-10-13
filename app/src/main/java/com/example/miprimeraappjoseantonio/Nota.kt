package com.example.miprimeraappjoseantonio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_nota.*
import com.google.android.material.snackbar.Snackbar.make as make1

class Nota : AppCompatActivity() {

    //Variable que controlan la nota minima y maxima que acepta la aplicación
    private var NOTA_MAXIMA = 10
    private var NOTA_MINIMA = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nota)

        //Nuestro boton llamara al metodo introducirNota()
        btnNota_Nota.setOnClickListener(){
                introducirNota(NOTA_MAXIMA,NOTA_MINIMA)
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
}