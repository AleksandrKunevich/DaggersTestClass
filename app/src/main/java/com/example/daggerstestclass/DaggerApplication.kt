package com.example.daggerstestclass

import android.app.Application
import android.content.Context
import com.example.daggerstestclass.di.ApplicationComponent
import com.example.daggerstestclass.di.DaggerApplicationComponent

class DaggerApplication : Application() {

    companion object {
        var appComponent: ApplicationComponent? = null

        var context: Context? = null

        // Плохой вариант кода!!!
        fun getApplicationContext(): Context? {
            return context
        }
    }

    override fun onCreate() {
        super.onCreate()
        appComponent = initDagger()
        context = this
    }

    private fun initDagger(): ApplicationComponent {
        return DaggerApplicationComponent
            .builder()
            .bindContext(this@DaggerApplication)
            .build()
    }
}