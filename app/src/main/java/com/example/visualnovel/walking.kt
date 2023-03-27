package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class walking : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_walking)

        val btn_film = findViewById<Button>(R.id.btn_film)
        val btn_halloween = findViewById<Button>(R.id.btn_halloween)

        btn_film.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,path_film::class.java)
            startActivity(intent)
        })

        btn_halloween.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,path_halloween::class.java)
            startActivity(intent)
        })
    }
}