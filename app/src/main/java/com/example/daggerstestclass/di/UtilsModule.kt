package com.example.daggerstestclass.di

import android.content.Context
import com.example.daggerstestclass.preference.SharedPreferencesManager
import com.example.daggerstestclass.preference.SharedPrefsImpl
import dagger.Module
import dagger.Provides

@Module
class UtilsModule {

    @Provides
    fun providesSharedPrefsManager(context: Context) : SharedPreferencesManager =
        SharedPrefsImpl(context)
}