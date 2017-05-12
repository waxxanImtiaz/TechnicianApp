package com.example.eureka.technicianapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


public class Profile extends Fragment {

    private ImageView ivUserProfile;
    private Button btnUploadImage;
    private TextView tvName;
    private TextView tvEmail;
    private TextView tvAddresss;
    private TextView tvNic;
    private TextView tvCity;
    private TextView tvArea;
    private TextView tvCategory;
    private TextView tvAttendedComplains;
    private TextView earnedRev;
    public Profile() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        init(view);
        return view;
    }
    public void init(View view){
        ivUserProfile = (ImageView)view.findViewById(R.id.ivUserProfile);
        btnUploadImage = (Button)view.findViewById(R.id.btnUploadImage);
        tvName = (TextView)view.findViewById(R.id.tvName);
        tvEmail = (TextView)view.findViewById(R.id.tvEmail);
        tvAddresss = (TextView)view.findViewById(R.id.tvAddresss);
        tvNic = (TextView)view.findViewById(R.id.tvNic);
        tvCity = (TextView)view.findViewById(R.id.tvCity);
        tvArea = (TextView)view.findViewById(R.id.tvArea);
        tvCategory = (TextView)view.findViewById(R.id.tvCategory);
        tvAttendedComplains = (TextView)view.findViewById(R.id.tvAttendedComplains);
        earnedRev = (TextView)view.findViewById(R.id.earnedRev);
    }
}
