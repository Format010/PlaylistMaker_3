package com.example.playlistmaker

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        val back = findViewById<View>(R.id.back)
        val share = findViewById<View>(R.id.buttonShare)
        val support = findViewById<View>(R.id.buttonMailToSupport)

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
        support.setOnClickListener{
            val subject = "Сообщение разработчикам и разработчицам приложения Playlist Maker"
            val message = "Спасибо разработчикам и разработчицам за крутое приложение!"

            val supportIntent = Intent(Intent.ACTION_SENDTO)
            supportIntent.data = Uri.parse("mailto:")
            supportIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("foreneng@yandex.ru"))
            supportIntent.putExtra(Intent.EXTRA_SUBJECT, subject)
            supportIntent.putExtra(Intent.EXTRA_TEXT, message)
            startActivity(supportIntent)
        }
    }
}