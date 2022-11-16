package com.example.name

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var result: TextView = findViewById(R.id.email)
        var result2: TextView = findViewById(R.id.parol)
        var button: Button = findViewById(R.id.z)
        var button2: Button = findViewById(R.id.x)

        button2.setOnClickListener {
            val intent = Intent(this@MainActivity, Activity::class.java)
            startActivity(intent)
        }
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

}