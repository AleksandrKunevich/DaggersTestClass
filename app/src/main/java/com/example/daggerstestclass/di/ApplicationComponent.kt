package com.example.daggerstestclass.di

import android.content.Context
import com.example.daggerstestclass.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [
        UserModule::class,
        DomainModule::class,
        UtilsModule::class

    ]
)

interface ApplicationComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun bindContext(context: Context): Builder

        fun build(): ApplicationComponent
    }

    fun inject(target: MainActivity)
}