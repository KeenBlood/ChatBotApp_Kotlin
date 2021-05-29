package com.example.chatbotapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.EditText
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Text = findViewById<EditText>(R.id.user_message) //submited text
        var Button = findViewById<Button>(R.id.button_send) //button
        var DisplayText = findViewById<TextView>(R.id.displaytext)
        var Submitted = findViewById<TextView>(R.id.submitedtext)


        Button.setOnClickListener {
            Submitted.text = (Text.text)
            DisplayText.text = ("Bot: \n" + DecisionTree.response(Text.text.toString()))
			Text.text.clear()
        }
    }
}

