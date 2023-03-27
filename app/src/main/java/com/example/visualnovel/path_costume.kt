package com.example.visualnovel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class path_costume : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_path_costume)

        val btn_yes = findViewById<Button>(R.id.btn_yes)
        val btn_no = findViewById<Button>(R.id.btn_no)

        btn_yes.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,path_costume_yes::class.java)
            startActivity(intent)
        })

        btn_no.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,path_costume_no::class.java)
            startActivity(intent)
        })
    }
}