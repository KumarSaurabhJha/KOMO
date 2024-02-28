package com.example.komo.application

import android.app.Application
import com.example.komo.di.domainModule
import com.example.komo.di.repositoryModule
import com.example.komo.di.restApiModule
import com.example.komo.di.retrofitModule
import com.example.komo.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MainApplication)
            modules(
                retrofitModule,
                restApiModule,
                repositoryModule,
                domainModule,
                viewModelModule
            )
        }
    }
}
