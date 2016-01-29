package com.teamlab.kotlin.dagger.issue;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.teamlab.kotlin.dagger.issue.di.ActivityComponent;
import com.teamlab.kotlin.dagger.issue.di.ActivityModule;
import com.teamlab.kotlin.dagger.issue.di.ApplicationComponent;
import com.teamlab.kotlin.dagger.issue.di.DaggerActivityComponent;

import javax.inject.Inject;

public class MainActivity extends Activity {

    @Inject
    String string;

    private ActivityComponent component;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ApplicationComponent parentComponent = ((MainApplication) getApplication()).getComponent();
        parentComponent.inject(this);
        Log.d("MainActivity", string);

        component = DaggerActivityComponent.builder()
                .applicationComponent(parentComponent)
                .activityModule(new ActivityModule())
                .build();

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(new MainFragment(), null)
                    .commit();
        }
    }

    public ActivityComponent getComponent() {
        return component;
    }
}
