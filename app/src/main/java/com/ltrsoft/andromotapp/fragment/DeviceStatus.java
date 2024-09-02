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
    private List<User_Crop_Sensor_Pojo> deviceModelStatusList ;

    public DeviceStatus() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.device_status, container, false);

        btnBackImage = view.findViewById(R.id.btnBackImg);
        deviceModelRecylerView = view.findViewById(R.id.deviceModelRecylerView);

        deviceModelRecylerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }
}