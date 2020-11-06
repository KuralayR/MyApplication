package com.example.intentfilter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.intentfilter.R

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btntime = findViewById<Button>(R.id.btnTime)
        val btndate = findViewById<Button>(R.id.btnDate)
        btntime.setOnClickListener(this)
        btndate.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnDate -> {
                val intent = Intent("ru.startandroid.intent.action.showdate")
                startActivity(intent)
            }
        }
        when (v?.id) {
            R.id.btnTime -> {
                val intent = Intent("ru.startandroid.intent.action.showtime")
                startActivity(intent)
            }
        }
    }

}


