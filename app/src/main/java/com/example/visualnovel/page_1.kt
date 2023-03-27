package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class page_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)

        val buttonstart = findViewById<Button>(R.id.buttonstart)
        buttonstart.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,page_2::class.java)
            startActivity(intent)
        })
    }
}