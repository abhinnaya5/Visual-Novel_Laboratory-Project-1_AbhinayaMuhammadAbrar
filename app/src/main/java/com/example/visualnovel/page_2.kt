package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class page_2 : AppCompatActivity() {
    private lateinit var button_accept : Button
    private lateinit var input_username : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        button_accept = findViewById(R.id.button_accept)
        input_username = findViewById(R.id.inputusername)

        button_accept.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,page_3::class.java)
                .putExtra("username",input_username.text.toString())
            startActivity(intent)
        })
    }
}