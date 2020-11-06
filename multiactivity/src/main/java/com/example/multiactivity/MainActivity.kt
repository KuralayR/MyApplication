package com.example.multiactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val two = findViewById<Button>(R.id.btnActTwo)
        two.setOnClickListener {
            val intent = Intent(this, ActivityTwo::class.java)
            startActivity(intent)
        }}

    override fun onRestart(){
        super.onRestart()
        println("onRestart")
    }
    override fun onStart(){
        super.onStart()
        println("onStart")
        // вызывается перед тем, как Activity будет видно пользователю
    }
    override fun onResume(){
        super.onResume()
        println("onResume")
        // вызывается перед тем как будет доступно для активности пользователя (взаимодействие)
    }
    override fun onPause(){
        super.onPause()
        println("onPause")
        // вызывается перед тем, как будет показано другое Activity
    }
    override fun onStop(){
        super.onStop()
        println("onStop")
        // вызывается когда Activity становится не видно пользователю
    }
    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy")
        // вызывается перед тем, как Activity будет уничтожено
    }
}


