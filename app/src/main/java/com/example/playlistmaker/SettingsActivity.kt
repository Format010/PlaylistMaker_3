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
        val share = findViewById<View>(R.id.buttonShare)

        share.setOnClickListener{
            val shareApp = Intent()
            shareApp.action = Intent.ACTION_SEND
            shareApp.type = "text/plain"
            shareApp.putExtra(Intent.EXTRA_TEXT, "Воспользуйся курсом от https://practicum.yandex.ru/learn/android-developer")
            startActivity(Intent.createChooser(shareApp, getString(R.string.share)))
        }

        back.setOnClickListener{
            onBackPressed()
        }
    }
}