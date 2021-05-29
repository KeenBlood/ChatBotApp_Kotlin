package com.example.chatbotapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Text = findViewById<EditText>(R.id.user_message)
        var Button = findViewById<Button>(R.id.button_send)
        var DisplayText = findViewById<TextView>(R.id.displaytext)

        Button.setOnClickListener {
            DisplayText.text = ("Submitted text:" + Text.text)
        }
    }
}
