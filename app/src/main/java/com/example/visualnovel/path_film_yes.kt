package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class path_film_yes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_path_film_yes)

        val end = findViewById<Button>(R.id.btn_yes)
        end.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,page_ending::class.java)
            startActivity(intent)
        })
    }
}