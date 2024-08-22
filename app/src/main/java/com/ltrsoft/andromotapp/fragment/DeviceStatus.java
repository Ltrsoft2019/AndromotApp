package com.ltrsoft.andromotapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;



import com.ltrsoft.andromotapp.R;
import com.ltrsoft.andromotapp.adapter.DeviceModelStatusAdapter;
import com.ltrsoft.andromotapp.pojoclasses.User_Crop_Sensor_Pojo;

import java.util.ArrayList;
import java.util.List;

public class DeviceStatus extends Fragment {

    private ImageView btnBackImage;
    private RecyclerView deviceModelRecylerView;
    private ArrayList<User_Crop_Sensor_Pojo> deviceModelStatusArrayList = new ArrayList<User_Crop_Sensor_Pojo>();

    public DeviceStatus() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.device_status, container, false);

        btnBackImage = view.findViewById(R.id.btnBackImg);
        deviceModelRecylerView = view.findViewById(R.id.deviceModelRecylerView);

        deviceModelRecylerView.setLayoutManager(new LinearLayoutManager(getContext() , LinearLayoutManager.VERTICAL , false));

        deviceModelStatusArrayList.add(new User_Crop_Sensor_Pojo("Sensor 1" , "Soya" , "ON"));
        deviceModelStatusArrayList.add(new User_Crop_Sensor_Pojo("Sensor 1" , "Soya" , "ON"));
        deviceModelStatusArrayList.add(new User_Crop_Sensor_Pojo("Sensor 1" , "Soya" , "ON"));
        deviceModelStatusArrayList.add(new User_Crop_Sensor_Pojo("Sensor 1" , "Soya" , "ON"));
        deviceModelStatusArrayList.add(new User_Crop_Sensor_Pojo("Sensor 1" , "Soya" , "ON"));
        deviceModelStatusArrayList.add(new User_Crop_Sensor_Pojo("Sensor 1" , "Soya" , "ON"));
        deviceModelStatusArrayList.add(new User_Crop_Sensor_Pojo("Sensor 1" , "Soya" , "ON"));
        deviceModelStatusArrayList.add(new User_Crop_Sensor_Pojo("Sensor 1" , "Soya" , "ON"));
        deviceModelStatusArrayList.add(new User_Crop_Sensor_Pojo("Sensor 1" , "Soya" , "ON"));
        deviceModelStatusArrayList.add(new User_Crop_Sensor_Pojo("Sensor 1" , "Soya" , "ON"));

        deviceModelRecylerView.setAdapter(new DeviceModelStatusAdapter(getContext() , deviceModelStatusArrayList));




        return view;
    }
}