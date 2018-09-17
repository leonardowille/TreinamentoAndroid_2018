package br.com.wille.cwiflix

import android.app.Application
import android.content.Context

class CWIFlixApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        val sharedPreferences = this.getSharedPreferences("CWIFlixApplication", Context.MODE_PRIVATE)
        SharedPreferencesService.sharedPreferences = sharedPreferences
    }

}