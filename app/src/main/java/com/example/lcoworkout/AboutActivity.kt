package com.example.lcoworkout

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat


class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.title = ""
        supportActionBar?.displayOptions = androidx.appcompat.app.ActionBar.DISPLAY_HOME_AS_UP
        addListeners();
        parseJson();
    }

    override fun onBackPressed() {
        ActivityCompat.finishAfterTransition(this)
    }

    fun addListeners() {
        findViewById<View>(R.id.github_icon).setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("http://www.github.com/ni3mumbaikar")
                )
            )
        }
        findViewById<View>(R.id.imageView2).setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("http://www.instagram.com/ni3mumbaikar")
                )
            )
        }
        findViewById<View>(
            R.id.imageView3
        ).setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.youtube.com/watch?v=VFrKjhcTAzE")
                )
            )
        }
    }

}