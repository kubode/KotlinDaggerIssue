package com.teamlab.kotlin.dagger.issue

import android.app.Activity
import android.os.Bundle
import android.util.Log
import com.teamlab.kotlin.dagger.issue.di.ActivityComponent
import com.teamlab.kotlin.dagger.issue.di.ActivityModule
import com.teamlab.kotlin.dagger.issue.di.DaggerActivityComponent
import javax.inject.Inject

class MainActivity : Activity() {

    @Inject
    lateinit var string: String

    lateinit var component: ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val parentComponent = (application as MainApplication).component
        parentComponent.inject(this)
        Log.d("MainActivity", string)

        component = DaggerActivityComponent.builder()
                .applicationComponent(parentComponent)
                .activityModule(ActivityModule())
                .build()

        if (savedInstanceState == null) {
            fragmentManager.beginTransaction()
                    .add(MainFragment(), null)
                    .commit()
        }
    }
}
