package com.kako351.locabotto

import android.app.Application
import com.kako351.locabotto.di.appModule
import com.kako351.locabotto.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class MyApplication : Application() {
    override fun onCreate(){
        super.onCreate()
        // start Koin!
        startKoin {
            // declare used Android context
            androidContext(this@MyApplication)
            // declare modules
            modules(appModule)
            modules(viewModelModule)
        }
        if(BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
    }
}
