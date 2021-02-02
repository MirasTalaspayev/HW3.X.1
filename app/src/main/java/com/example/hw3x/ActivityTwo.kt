package com.example.hw3x

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class ActivityTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        val s = intent.extras?.get(ARG).toString()

        findViewById<Button>(R.id.show_message).setOnClickListener() {
            Toast.makeText(this@ActivityTwo, s, Toast.LENGTH_SHORT).show()
        }

    }
}