package com.example.daggerstestclass.di

import com.example.daggerstestclass.models.User
import dagger.Module
import dagger.Provides

@Module
class UserModule {

    @Provides
    fun providesUser(): User =
        User(
            name = "Name",
            age = 18
        )
}