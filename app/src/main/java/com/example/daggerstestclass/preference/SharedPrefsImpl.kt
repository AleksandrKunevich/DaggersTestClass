package com.example.daggerstestclass.preference

import android.content.Context

class SharedPrefsImpl(private val context: Context) : SharedPreferencesManager {

    companion object {
        private const val SHARED_PREFS_NAME = "com.example.daggerstestclass.NAME"
        private const val STRING_KEY = "STRING_KEY"
        private const val DEFAULT_STRING_VALUE = "Empty string!"
    }

    private val prefs by lazy {
        context.getSharedPreferences(
            SHARED_PREFS_NAME,
            Context.MODE_PRIVATE
        )
    }

    override fun saveString(key: String, value: String) {
        prefs.edit()
            .putString(key, value)
            .apply()
    }

    override fun getString(key: String): String {
        return prefs
            .getString(key, DEFAULT_STRING_VALUE) ?: DEFAULT_STRING_VALUE
    }
}