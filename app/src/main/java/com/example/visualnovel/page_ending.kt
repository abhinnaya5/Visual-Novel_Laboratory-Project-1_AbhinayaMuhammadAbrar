package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class page_ending : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_ending)

        val repeat = findViewById<Button>(R.id.buttonend)
        repeat.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,page_1::class.java)
            startActivity(intent)
        })
    }
}