package com.example.miprimeraappjoseantonio



import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_acerca_de.*

class AcercaDe : AppCompatActivity() {

    //Guardamos los enlaces en variables para pasarlos por funcion
    var twitter = "https://twitter.com/Afanatwit"
    var gitHub = "https://github.com/AfanaVG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acerca_de)

        btnTwitter_AcercaDe.setOnClickListener(){
            abrirLink(twitter)
        }

        btnGitHub_AcercaDe.setOnClickListener(){
            abrirLink(gitHub)
        }
    }

    fun abrirLink(link: String){

        val uri = Uri.parse(link)
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)

    }
}