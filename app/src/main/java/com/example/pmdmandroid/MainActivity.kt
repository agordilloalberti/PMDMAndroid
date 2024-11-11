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

        btnEnviar.setOnClickListener {
            when (background.setBackgroundColor()) {
                negro -> {
                    background.solidColor=blanco
                    background.setBackgroundColor(blanco)
                }
                blanco -> {
                    background.setBackgroundColor(negro)
                }
                else -> {
                    background.setBackgroundColor(background.solidColor)
                }
            }
        }
    }
}