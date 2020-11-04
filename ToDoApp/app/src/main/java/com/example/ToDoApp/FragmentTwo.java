package com.example.ToDoApp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.AsyncListUtil;

import com.example.todopac.R;

public class FragmentTwo extends Fragment {
    private static final String KEY_FRAGMENT_TWO_INPUT ="KEY_FRAGMENT_TWO_INPUT";

    public static FragmentTwo newInstance(String input){
        FragmentTwo fragment = new FragmentTwo();
        Bundle bundle = new Bundle();
        bundle.putString(KEY_FRAGMENT_TWO_INPUT,
                input);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_two,
                container,
                false);
        TextView displayData = view.findViewById(R.id.tv_fragment_two);
        String temp = getArguments().getString(KEY_FRAGMENT_TWO_INPUT);
        displayData.setText(temp);
        return view;
    }
}
