package com.example.pmdmandroid

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.events_result)
        val background = findViewById<View>(R.id.background)
        val color = intent?.extras?.getString("Color").orEmpty()
        background.setBackgroundColor(color.toInt())
    }
}