package ru.mindlesson.mindlessonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a: Button = findViewById(R.id.buttonAction)

        a.setOnClickListener {
            Log.e("!@#","my message")
        }
    }
}