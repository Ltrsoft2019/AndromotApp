package com.ltrsoft.andromotapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.ltrsoft.andromotapp.R;

public class PlantingTime_Detail extends Fragment {

    private ImageButton btnBackImageView;
    private ImageView cropImage;
    private TextView tvCropName , tvCropDescr , tvDeviceName , tvRequiredVal , tvCurrentVal , tvStatus;

    public PlantingTime_Detail() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.planting_time_detail, container, false);

        btnBackImageView = view.findViewById(R.id.btnBackImageView);
        cropImage = view.findViewById(R.id.cropImage);
        tvCropName = view.findViewById(R.id.tvCropName);
        tvCropDescr = view.findViewById(R.id.tvCropDescr);
        tvDeviceName = view.findViewById(R.id.tvDeviceName);
        tvRequiredVal = view.findViewById(R.id.tvRequiredVal);
        tvCurrentVal = view.findViewById(R.id.tvCurrentVal);
        tvStatus = view.findViewById(R.id.tvStatus);

        return view;

    }
}