package com.example.intro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var ButtonMerc:Button
    lateinit var ButtonReg:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButtonMerc=findViewById(R.id.button)
        ButtonReg=findViewById(R.id.button2)
        ButtonMerc.setOnClickListener {
            val intent=Intent(this,MercedesActivity::class.java)
            startActivity(intent)
        }
        ButtonReg.setOnClickListener {
            val reg=Intent(this, RegisterActivity::class.java)
            startActivity(reg)
        }
    }
}
