package com.example.extras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ViewActivity : AppCompatActivity() {
    lateinit var tvView: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)
        tvView = findViewById<TextView>(R.id.tvView)
        val intent = intent;
        val fName = intent.getStringExtra("fname");
        val lName = intent.getStringExtra("lname");

        tvView.setText("Your name is: " + fName+" "+lName);


    }}
