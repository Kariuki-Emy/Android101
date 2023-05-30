package com.example.intro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    lateinit var ButtonWelc:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        ButtonWelc=findViewById(R.id.button3)
        ButtonWelc.setOnClickListener {
            val welc=Intent(this, Welcome::class.java)
            startActivity(welc)
        }
    }
}