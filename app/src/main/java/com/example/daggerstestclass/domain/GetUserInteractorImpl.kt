package com.example.daggerstestclass.domain

import android.content.Context
import android.util.Log
import com.example.daggerstestclass.models.User
import javax.inject.Inject

class GetUserInteractorImpl @Inject constructor(
    private val user: User,
    private val context: Context

) : GetUserInteractor {
    override fun getUser(): User {
        Log.e("!!!!", context.packageName)
        return user
    }
}