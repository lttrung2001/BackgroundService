package com.ltbth.service

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnPlay = findViewById<Button>(R.id.btn_play)
        val btnStop = findViewById<Button>(R.id.btn_stop)
        btnPlay.setOnClickListener { playSong() }
        btnStop.setOnClickListener { stopSong() }

    }

    private fun playSong() {
        val intent = Intent(this,PlaySongService::class.java)
        startService(intent)
    }

    private fun stopSong() {
        val intent = Intent(this,PlaySongService::class.java)
        stopService(intent)
    }
}