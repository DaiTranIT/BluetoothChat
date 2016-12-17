package com.example.now.common.activities;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentActivity;

import com.example.now.common.logger.Log;
import com.example.now.common.logger.LogWrapper;

/**
 * Created by Admin on 12/13/2016.
 */

public class SampleActivityBase extends FragmentActivity {

    public static final String TAG = "SampleActivityBase";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        initializeLogging();
    }

    // set up targets to receive log data
    public void initializeLogging(){
        //Using log,front-end to the logging chain, emulates android.util.log method signatures
        // Wraps Android's native log framework
        LogWrapper logWrapper = new LogWrapper();
        Log.setLogNode(logWrapper);

        Log.i(TAG, "Ready");
    }
}
