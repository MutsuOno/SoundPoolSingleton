package com.mutsuono.soundpoolsingleton

import android.content.Context
import android.media.AudioAttributes
import android.media.SoundPool

class SoundPoolManager {

    private val soundPool: SoundPool
    private var soundId = 0

    init {
        val audioAttributes = AudioAttributes.Builder()
            .setUsage(AudioAttributes.USAGE_GAME)
            .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
            .build()

        soundPool = SoundPool.Builder()
            .setAudioAttributes(audioAttributes)
            .setMaxStreams(5)
            .build()
    }

    fun play() {

        if (soundId == 0) return

        soundPool.play(soundId, 1.0f, 1.0f, 0, 0, 1.0f)
    }

    fun load(context: Context, id: Int) {

        soundId = soundPool.load(context.applicationContext, id, 1)
    }

    companion object {
        private var manager: SoundPoolManager? = null

        val instance: SoundPoolManager
            get() {
                if (manager == null) {
                    manager = SoundPoolManager()
                }
                return manager!!
            }
    }
}
