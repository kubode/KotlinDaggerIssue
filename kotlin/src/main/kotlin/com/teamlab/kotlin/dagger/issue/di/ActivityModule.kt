package com.teamlab.kotlin.dagger.issue.di

import dagger.Module
import dagger.Provides

@Module
class ActivityModule {

    @Provides
    @ActivityScope
    fun provideString(): String {
        return "Activity"
    }
}
