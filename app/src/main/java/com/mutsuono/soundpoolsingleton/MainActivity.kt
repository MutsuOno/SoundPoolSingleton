package com.mutsuono.soundpoolsingleton

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SoundPoolManager.instance.load(this, R.raw.sample)

        val playBtn = findViewById<Button>(R.id.play)
        playBtn.setOnClickListener {

            SoundPoolManager.instance.play()
        }

        val changeViewBtn = findViewById<Button>(R.id.changeView)
        changeViewBtn.setOnClickListener {

            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        }
    }
}
