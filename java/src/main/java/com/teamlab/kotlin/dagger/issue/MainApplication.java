package com.teamlab.kotlin.dagger.issue;

import android.app.Application;
import android.util.Log;

import com.teamlab.kotlin.dagger.issue.di.ApplicationComponent;
import com.teamlab.kotlin.dagger.issue.di.ApplicationModule;
import com.teamlab.kotlin.dagger.issue.di.DaggerApplicationComponent;

import javax.inject.Inject;

public class MainApplication extends Application {

    @Inject
    String string;

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule())
                .build();
        component.inject(this);
        Log.v("MainApplication", string);
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
