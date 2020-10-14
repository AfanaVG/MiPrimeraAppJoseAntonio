package com.example.miprimeraappjoseantonio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import kotlinx.android.synthetic.main.activity_cita.*

class Cita : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cita)

        btnProgramar_Cita.setOnClickListener(){
            var titulo = edtxtTitulo_Cita.text.toString()
            var lugar = edtxtLugar_Cita.text.toString()
            var inicio = edtxtInicio_Cita.text.toString()
            var final  = edtxtFinal_Cita.text.toString()
            registrarCita(titulo,lugar,inicio,final )
        }
    }

    fun registrarCita(titulo: String, lugar: String, inicio: String, final: String) {
        val intent = Intent(Intent.ACTION_INSERT).apply {
            data = CalendarContract.Events.CONTENT_URI
            putExtra(CalendarContract.Events.TITLE, titulo)
            putExtra(CalendarContract.Events.EVENT_LOCATION, lugar)
            putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, inicio)
            putExtra(CalendarContract.EXTRA_EVENT_END_TIME, final)
        }
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }
}