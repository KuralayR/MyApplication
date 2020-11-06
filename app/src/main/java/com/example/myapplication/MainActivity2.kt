package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val ex = findViewById<TextView>(R.id.tvOut)
        val but = findViewById<Button>(R.id.btnOk)
        val butc = findViewById<Button>(R.id.btnCancel)
        but.setOnClickListener{ex.setText("Button Ok is chosen")};
        butc.setOnClickListener {ex.setText("Button Cancel is chosen")};


    }
}