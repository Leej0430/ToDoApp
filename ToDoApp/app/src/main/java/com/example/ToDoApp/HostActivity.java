package com.example.ToDoApp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.todopac.R;

public class HostActivity extends AppCompatActivity
        implements IPassData{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host);
    }

    @Override
    public void passData(String input) {
        FragmentManager manager =
            getSupportFragmentManager();
        FragmentTransaction transaction =
                manager.beginTransaction();
        transaction.add(R.id.fragment_container_two,
                FragmentTwo.newInstance(input));
        transaction.commit();
    }
}