package com.example.lcoworkout

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var aboutLayout: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        aboutLayout = findViewById<View>(R.id.about_layout)
        aboutLayout.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }
    }
}