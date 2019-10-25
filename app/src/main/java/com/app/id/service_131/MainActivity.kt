package com.app.id.service_131

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.media.MediaPlayer
import android.net.Uri
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgGoogle.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.google.com/")
            startActivity(openURL)
        }

        imgFacebook.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.facebook.com/")
            startActivity(openURL)
        }


        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.indonesia_raya)


        btnPlay.setOnClickListener {
            MediaPlayer?.start()
        }

        btnPause.setOnClickListener {
            MediaPlayer?.pause()
        }

        btnStop.setOnClickListener {
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }
    }

}
