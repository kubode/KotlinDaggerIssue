package com.teamlab.kotlin.dagger.issue.di;

import com.teamlab.kotlin.dagger.issue.MainActivity;
import com.teamlab.kotlin.dagger.issue.MainApplication;

import dagger.Component;

@Component(modules = ApplicationModule.class)
@ApplicationScope
public interface ApplicationComponent {
    void inject(MainApplication application);

    void inject(MainActivity activity);
}
