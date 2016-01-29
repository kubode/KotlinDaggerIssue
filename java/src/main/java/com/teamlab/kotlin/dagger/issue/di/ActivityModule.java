package com.teamlab.kotlin.dagger.issue.di;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    @Provides
    @ActivityScope
    String provideString() {
        return "Activity";
    }
}
