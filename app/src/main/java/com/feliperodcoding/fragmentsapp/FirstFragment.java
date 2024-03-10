package com.feliperodcoding.fragmentsapp;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class FirstFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first,container,false);
        Button firstBtn = view.findViewById(R.id.btn_frag1);
        TextView txt = view.findViewById(R.id.text_frag1);
        firstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Hello", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getActivity(),"onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getActivity(),"onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Toast.makeText(context,"onAttach", Toast.LENGTH_SHORT).show();
    }
}