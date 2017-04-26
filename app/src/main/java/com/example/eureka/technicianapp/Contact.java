package com.example.eureka.technicianapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class Contact extends Fragment {

    private String[] statusList;
    private Spinner spStatus;
    public Contact() {
        // Required empty public constructor
        statusList = new String[]{"Visit Time Set","Update Later","Not Responding","Not Agree to Pay","Issue Resolved"};

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_contact, container, false);
        init(v);
        // Inflate the layout for this fragment
        return v;
    }

    private void init(View view){

        spStatus = (Spinner)view.findViewById(R.id.sp_status);
        ArrayAdapter<String> statusAdapter = new ArrayAdapter<String>(getContext(), R.layout.spinner_item,statusList);
        spStatus.setAdapter(statusAdapter);
    }



}
