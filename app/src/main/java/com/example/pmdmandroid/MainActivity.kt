package com.example.pmdmandroid

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.events)

        val btnEnviar = findViewById<Button>(R.id.boton)
        val background = findViewById<View>(R.id.background)
        val negro = getResources().getColor(R.color.black)
        val blanco = getResources().getColor(R.color.white)
        var nb = negro

        btnEnviar.setOnClickListener {
            if (nb==negro){
                background.setBackgroundColor(blanco)
                nb=blanco
            }else{
                background.setBackgroundColor(negro)
                nb=negro
            }
        }
    }
}