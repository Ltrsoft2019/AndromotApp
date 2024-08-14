package com.ltrsoft.andromotapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;


import com.ltrsoft.andromotapp.modelclasses.User_Crop_Sensor_Pojo;
import com.ltrsoft.andromotapp.R;
import com.ltrsoft.andromotapp.adapter.DeviceStatusAdapter;

import java.util.List;

public class DeviceStatus extends Fragment {

    RecyclerView statusrecycler;
    List<User_Crop_Sensor_Pojo>sensorList;
    DeviceStatusAdapter statusAdapter ;
    public static String url="https://andromot.ltr-soft.com";

    public DeviceStatus() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.device_status, container, false);



        return view;
    }
}