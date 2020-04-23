package com.example.lcoworkout

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var aboutLayout: View
    private lateinit var randomLayout: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        aboutLayout = findViewById<View>(R.id.about_layout)
        randomLayout = findViewById(R.id.rand_mode)
        //TODO: Make Transition for name
        aboutLayout.setOnClickListener {
            val options = ActivityOptions
                .makeSceneTransitionAnimation(
                    this, findViewById(R.id.dev_image), "dev_" +
                            "image"
                )
            startActivity(Intent(this, AboutActivity::class.java), options.toBundle())
        }
        randomLayout.setOnClickListener {
            Toast.makeText(applicationContext, "Test", Toast.LENGTH_SHORT).show()
        }
    }
}














