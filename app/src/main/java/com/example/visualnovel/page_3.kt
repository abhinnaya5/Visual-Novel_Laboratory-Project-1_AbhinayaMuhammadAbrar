package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class page_3 : AppCompatActivity() {
    private lateinit var display_username : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)

        display_username = findViewById(R.id.conversation2)
        val username = intent.getStringExtra("username")
        display_username.text = "Great," +username+"! What are we going to do?"

        val button_walking = findViewById<Button>(R.id.button_walking)
        val button_hiking = findViewById<Button>(R.id.button_hiking)
        val button_field = findViewById<Button>(R.id.button_field)

        button_walking.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,walking::class.java)
            startActivity(intent)
        })

        button_hiking.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,hiking::class.java)
            startActivity(intent)
        })

        button_field.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,field::class.java)
            startActivity(intent)
        })
    }
}