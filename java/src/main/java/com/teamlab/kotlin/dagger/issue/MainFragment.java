package com.teamlab.kotlin.dagger.issue;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainFragment extends Fragment {

    @Inject
    String string;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((MainActivity) getActivity()).getComponent().inject(this);
        Log.v("MainFragment", string);
    }
}
