package com.example.test;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(LOG_TAG, "onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //-----------
        //11


    }

    @Override
    protected void onStart() {
        Log.i(LOG_TAG, "onStart: ");
        super.onStart();
        //-----------
        //111

    }

    @Override
    protected void onResume() {
        Log.i(LOG_TAG, "onResume: ");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i(LOG_TAG, "onPause: isFinishing = " + isFinishing() + " isDestroyed = " + isDestroyed());
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i(LOG_TAG, "onStop: ");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i(LOG_TAG, "onDestroy: ");
        super.onDestroy();
    }


}