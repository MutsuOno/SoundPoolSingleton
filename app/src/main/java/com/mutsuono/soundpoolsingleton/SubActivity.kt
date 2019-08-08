package com.mutsuono.soundpoolsingleton

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val playBtn = findViewById<Button>(R.id.play)
        playBtn.setOnClickListener {

            SoundPoolManager.instance.play()
        }
    }
}
