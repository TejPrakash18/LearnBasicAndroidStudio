package com.example.learnbasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        },2000)
    }
}