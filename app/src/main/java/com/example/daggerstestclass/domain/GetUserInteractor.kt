package com.example.daggerstestclass.domain

import com.example.daggerstestclass.models.User

interface GetUserInteractor {
    fun getUser(): User
}