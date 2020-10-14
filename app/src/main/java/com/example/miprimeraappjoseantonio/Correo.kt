package com.example.miprimeraappjoseantonio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_correo.*
import java.util.regex.Pattern

class Correo : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_correo)

        btnEnviar_Correo.setOnClickListener(){
            var correo = arrayOf(edtxtPara_Correo.text.toString())
            var asunto = edtxtAsunto_Correo.text.toString()
            var contenido = edtxtContenido_Correo.text.toString()
            enviarCorreo(correo,asunto,contenido)
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        edtxtPara_Correo.setText(java.lang.String.valueOf(savedInstanceState.get("CORREO")))
        edtxtAsunto_Correo.setText(java.lang.String.valueOf(savedInstanceState.get("ASUNTO")))
        edtxtContenido_Correo.setText(java.lang.String.valueOf(savedInstanceState.get("CONTENIDO")))
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("CORREO", edtxtPara_Correo.text.toString())
        outState.putString("ASUNTO", edtxtAsunto_Correo.text.toString() )
        outState.putString("CONTENIDO", edtxtContenido_Correo.text.toString())
    }

    private fun enviarCorreo(correo: Array<String>,asunto:String,contenido:String){
        if (validarEmail(correo[0])) {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:") // only email apps should handle this
                putExtra(Intent.EXTRA_EMAIL, correo)
                putExtra(Intent.EXTRA_SUBJECT, asunto)
                putExtra(Intent.EXTRA_TEXT, contenido)
            }
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }else{
            Toast.makeText(this,"El email no es valido",Toast.LENGTH_SHORT).show()
        }


    }


    private fun validarEmail(correo:String): Boolean {
        var pattern:Pattern = Patterns.EMAIL_ADDRESS
        return pattern.matcher(correo).matches();
    }
}