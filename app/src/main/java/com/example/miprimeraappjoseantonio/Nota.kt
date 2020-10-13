package com.example.miprimeraappjoseantonio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_nota.*
import com.google.android.material.snackbar.Snackbar.make as make1

class Nota : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nota)

    btnNota_Nota.setOnClickListener(){
        Toast.makeText(this,"Has introducido la nota "+edtxtNota_Nota.text.toString(), Toast.LENGTH_SHORT).show()
    }
    }
}