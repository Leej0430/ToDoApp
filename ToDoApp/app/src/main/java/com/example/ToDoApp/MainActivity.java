package com.example.ToDoApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.todopac.R;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener{

    EditText inputTask;
    Button saveTask;
    ListView displayTask;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputTask=findViewById(R.id.et_todo_input);
        saveTask =findViewById(R.id.btn_save_task);
        displayTask=findViewById(R.id.lv_display_task);
        saveTask.setOnClickListener(this);
        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1);

        displayTask.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent,
                                           View view,
                                           int position,
                                           long id) {

                adapter.remove(adapter.getItem(position));

                return true;
            }
        });

    }

    @Override
    public void onClick(View v) {
        String tempinput= inputTask.getText().toString();

        if(tempinput.isEmpty())
            Toast.makeText(this,
                    "No Empty List",
                    Toast.LENGTH_SHORT).show();
        else{
            addAdapter(tempinput);
            clearInputText();

        }
    }

    private void addAdapter(String tempinput) {
        adapter.add(tempinput);

        displayTask.setAdapter(adapter);
    }

    private void clearInputText(){
        inputTask.setText("");
        inputTask.getText().clear();
    }

}