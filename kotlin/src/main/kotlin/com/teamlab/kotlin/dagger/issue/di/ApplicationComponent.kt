package com.teamlab.kotlin.dagger.issue.di

import com.teamlab.kotlin.dagger.issue.MainActivity
import com.teamlab.kotlin.dagger.issue.MainApplication

import dagger.Component

@Component(modules = arrayOf(ApplicationModule::class))
@ApplicationScope
interface ApplicationComponent {
    fun inject(application: MainApplication)

    fun inject(activity: MainActivity)
}
