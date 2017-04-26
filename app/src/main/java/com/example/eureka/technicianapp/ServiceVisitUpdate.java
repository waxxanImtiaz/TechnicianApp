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


public class ServiceVisitUpdate extends Fragment {

    private Spinner spItemCategory;
    private Spinner spStatus;
    private String[] itemCategoryList;
    private String[] statusList;
    public ServiceVisitUpdate() {
        // Required empty public constructor
        itemCategoryList = new String[]{"Refrigerator","AC","Deep Freezer","Micro wave","T.V","DVD","Camera","Mobile Phone"
        ,"Washing Machine","Water Dispenser"};
        statusList = new String[]{"Repaired","Not Repaired","Rejected Quotation","Visit Again to repair","Send to workshop"};
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_service_visit_update, container, false);
        init(v);
        // Inflate the layout for this fragment
        return v;
    }

    public void init(View v){
        ArrayAdapter<String> itemCatAdapter = new ArrayAdapter<String>(getContext(), R.layout.spinner_item,itemCategoryList);
        spItemCategory = (Spinner)v.findViewById(R.id.sp_item_category);
        spItemCategory.setAdapter(itemCatAdapter);
        spStatus = (Spinner)v.findViewById(R.id.sp_status);
        ArrayAdapter<String> statusAdapter = new ArrayAdapter<String>(getContext(), R.layout.spinner_item,statusList);
        spStatus.setAdapter(statusAdapter);

    }

}
