package com.teamlab.kotlin.dagger.issue

import android.app.Fragment
import android.os.Bundle
import android.util.Log

import javax.inject.Inject

class MainFragment : Fragment() {

    @Inject
    lateinit var string: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (activity as MainActivity).component.inject(this)
        Log.v("MainFragment", string)
    }
}
