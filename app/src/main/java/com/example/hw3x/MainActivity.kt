package com.example.hw3x

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.os.bundleOf

const val ARG = "Text"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edText = findViewById<EditText>(R.id.NameField)
        findViewById<Button>(R.id.btn_navigate).setOnClickListener() {
            if (edText.text.isNullOrEmpty()) {
                Toast.makeText(this@MainActivity, "Text is empty", Toast.LENGTH_SHORT).show()
                Log.d("main", "works from main")
                return@setOnClickListener
            }
            val intent = Intent(this@MainActivity, ActivityTwo::class.java)
            intent.apply {
                putExtras(bundleOf(Pair(ARG, edText.text)))
            }
            startActivity(intent)
        }
    }
}