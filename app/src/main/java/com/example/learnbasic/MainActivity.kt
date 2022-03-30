package com.example.learnbasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            val iname = data.editableText.toString()
            val inext = Intent(this, MainActivity2::class.java)
            inext.putExtra("name",iname)
            //startActivity(Intent(this,MainActivity2::class.java))
            Toast.makeText(this,"Button was clicked",Toast.LENGTH_LONG).show()
            startActivity(inext)
        }
    }
}