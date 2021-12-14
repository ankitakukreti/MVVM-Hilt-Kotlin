package com.sample.explore.application

import android.app.Application
import com.sample.explore.sharedPreference.SharedPreferenceManager
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App:Application() {

    override fun onCreate() {
        super.onCreate()
    }
}