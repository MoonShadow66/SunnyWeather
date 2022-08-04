package com.liang.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context

        // 彩云API令牌
        const val TOKEN = "VysqRhwcRhIcDvwF"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}