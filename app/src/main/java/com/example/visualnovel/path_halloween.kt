package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class path_halloween : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_path_halloween)

        val btn_film = findViewById<Button>(R.id.btn_film)
        val btn_costume = findViewById<Button>(R.id.btn_costume)

        btn_film.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,path_film::class.java)
            startActivity(intent)
        })

        btn_costume.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,path_costume::class.java)
            startActivity(intent)
        })
    }
}