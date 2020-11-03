package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String TAG ="MainActivity";
    EditText etInputData;
    Button sendData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate: ");
        etInputData = findViewById(R.id.et_data);
        sendData=findViewById(R.id.btn_send_data);


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

    public void passData(View view) {
        Intent navigateActivity2 = new Intent();
        navigateActivity2.setClass(MainActivity.this, MainActivity2.class);
        if(etInputData.getText().toString().isEmpty())
            navigateActivity2.putExtra("Name","NVA");
        else
            navigateActivity2.putExtra("Name",etInputData.getText().toString());
            startActivity(navigateActivity2);
    }
}