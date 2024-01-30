package com.example.playlistmaker

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        val back = findViewById<View>(R.id.back)
        val backText = findViewById<View>(R.id.SettingText)


        back.setOnClickListener{
            val displayIntentSearch = Intent(this, MainActivity::class.java)
            startActivity(displayIntentSearch)
        }
        backText.setOnClickListener{
            val displayIntentSearch = Intent(this, MainActivity::class.java)
            startActivity(displayIntentSearch)
        }
    }
}