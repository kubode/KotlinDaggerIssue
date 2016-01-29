package com.teamlab.kotlin.dagger.issue.di

import com.teamlab.kotlin.dagger.issue.MainFragment

import dagger.Component

@Component(modules = arrayOf(ActivityModule::class), dependencies = arrayOf(ApplicationComponent::class))
@ActivityScope
interface ActivityComponent {
    fun inject(fragment: MainFragment)
}
