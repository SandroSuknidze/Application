package com.example.application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.application.R.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        val secondActivityButton = findViewById<Button>(id.register_button)
        secondActivityButton.setOnClickListener {
            val Intent = Intent(this,SecondActivity::class.java)
            startActivity(Intent)
        }

    }
}