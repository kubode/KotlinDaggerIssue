package com.teamlab.kotlin.dagger.issue.di

import dagger.Module
import dagger.Provides

@Module
class ApplicationModule {

    @Provides
    @ApplicationScope
    fun provideString(): String {
        return "Application"
    }
}
