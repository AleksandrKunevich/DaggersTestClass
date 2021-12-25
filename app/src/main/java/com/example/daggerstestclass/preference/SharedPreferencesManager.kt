package com.example.daggerstestclass.preference

interface SharedPreferencesManager {
    fun saveString(key: String, value: String)

    fun getString(key: String): String
}