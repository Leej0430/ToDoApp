package com.example.activitylifecycle;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private static final String TAG ="mainActivity2";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String temp =
            getIntent().getStringExtra("Name");

        Log.d(TAG,"onCreate: "+temp);
    }

    @Override
    protected void onStart() {

        super.onStart();
        Log.d(TAG,"onStart: ");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG,"onPause: ");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG,"onStop: ");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"onDestroy: ");
    }
}
