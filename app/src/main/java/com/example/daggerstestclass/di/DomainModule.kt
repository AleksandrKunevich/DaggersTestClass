package com.example.daggerstestclass.di

import android.content.Context
import com.example.daggerstestclass.domain.GetUserInteractor
import com.example.daggerstestclass.domain.GetUserInteractorImpl
import com.example.daggerstestclass.models.User
import com.example.daggerstestclass.news.NewsInteractor
import com.example.daggerstestclass.news.NewsInteractorImpl
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

    @Provides
    fun providesGetUserInteractor(
        user: User,
        context: Context
    ): GetUserInteractor =
        GetUserInteractorImpl(
            user = user,
            context = context
        )

    @Provides
    fun provideNewsInteractor(): NewsInteractor = NewsInteractorImpl()
}