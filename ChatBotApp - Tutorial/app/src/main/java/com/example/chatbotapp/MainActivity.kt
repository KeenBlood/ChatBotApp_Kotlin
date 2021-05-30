package com.example.chatbotapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.EditText
import android.widget.Button
import android.widget.TextView
import com.example.ChatBotApp.DecisionTree

//função resposta do bot
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var Text = findViewById<EditText>(R.id.user_message) //texto inserido pelo utilizador
        var Button = findViewById<Button>(R.id.button_send) //butao
        var DisplayText = findViewById<TextView>(R.id.displaytext) // display ao texto inserido

        Button.setOnClickListener {
            DisplayText.text = ("Bot: \n" + DecisionTree.response(Text.text.toString()))
            Text.text.clear()
        }

    }
}
