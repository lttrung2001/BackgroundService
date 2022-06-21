package com.ltbth.service

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class PlaySongService : Service() {
    private lateinit var mediaPlayer: MediaPlayer
    override fun onBind(intent: Intent): IBinder? {
        return null
    }

    // Run before onStartCommand
    override fun onCreate() {
        super.onCreate()
        mediaPlayer = MediaPlayer.create(applicationContext,R.raw.my_song)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // Play song
        mediaPlayer.start()
        return START_REDELIVER_INTENT
    }

    override fun onDestroy() {
        mediaPlayer.release()
        super.onDestroy()
    }
}