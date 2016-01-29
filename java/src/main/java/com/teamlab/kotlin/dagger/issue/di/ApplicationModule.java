package com.teamlab.kotlin.dagger.issue.di;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    @Provides
    @ApplicationScope
    String provideString() {
        return "Application";
    }
}
