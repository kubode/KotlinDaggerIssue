package com.teamlab.kotlin.dagger.issue

import android.app.Application
import android.util.Log

import com.teamlab.kotlin.dagger.issue.di.ApplicationComponent
import com.teamlab.kotlin.dagger.issue.di.ApplicationModule
import com.teamlab.kotlin.dagger.issue.di.DaggerApplicationComponent

import javax.inject.Inject

class MainApplication : Application() {

    @Inject
    lateinit var string: String

    lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule())
                .build()
        component.inject(this)
        Log.v("MainApplication", string)
    }
}
