package com.example.ToDoApp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.todopac.R;
import com.google.android.material.textfield.TextInputLayout;

public class CreateTaskActivity extends AppCompatActivity {
    TextInputLayout createTask;
    Button saveTask;
    public static final String KEY_DATA_BACK = "KEY_DATA_BACK";
    @Override
    protected void onCreate(@Nullable  Bundle saveInstanceState ){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.create_activity);
        saveTask = findViewById(R.id.btn_add_task);
       createTask=findViewById(R.id.til_create_task);
        saveTask.setOnClickListener(view -> {
            if(checkForEmpties())
                Toast.makeText(this,"No empty values", Toast.LENGTH_SHORT).show();
            else{
                Intent sendDataBack = new Intent();
                sendDataBack.putExtra(KEY_DATA_BACK,
                        createTask.getEditText().getText().toString());
                setResult(RESULT_OK,  sendDataBack);
                finish();
            }
        });
    }

    private boolean checkForEmpties(){
        return createTask.getEditText().getText().toString().isEmpty();
    }
}
