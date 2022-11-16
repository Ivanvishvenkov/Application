package com.example.name

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        var result1: TextView = findViewById(R.id.email2)
        var result21: TextView = findViewById(R.id.parol2)
        var button21: Button = findViewById(R.id.x2)
        button21.setOnClickListener {
            val intent = Intent(this@RegisterActivity, Activity::class.java)
            startActivity(intent)
        }
    }
}