package com.teamlab.kotlin.dagger.issue.di;

import com.teamlab.kotlin.dagger.issue.MainFragment;

import dagger.Component;

@Component(modules = ActivityModule.class, dependencies = ApplicationComponent.class)
@ActivityScope
public interface ActivityComponent {
    void inject(MainFragment fragment);
}
