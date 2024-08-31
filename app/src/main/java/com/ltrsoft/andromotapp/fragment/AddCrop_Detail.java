package com.ltrsoft.andromotapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import com.ltrsoft.andromotapp.R;

public class AddCrop_Detail extends Fragment {

    private ImageView btnBackImg , btnRefresh , cropImage;
    private TextView tvCropNameDet , tvCropDescDet , tvTHValue , tvWaterLevel , tvTemperatur , tvNValue , tvPValue , tvKValue;
    private Spinner deviceNameSpinner;
    private Button btnAdd;

    public AddCrop_Detail() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.add_crop_detail, container, false);

        btnBackImg = view.findViewById(R.id.btnBackImg);
        btnRefresh = view.findViewById(R.id.btnRefresh);
        cropImage  = view.findViewById(R.id.cropImag);

        tvCropNameDet = view.findViewById(R.id.tvCropNameDet);
        tvCropDescDet = view.findViewById(R.id.tvCropDescDet);
        tvTHValue = view.findViewById(R.id.tvTHValue);
        tvWaterLevel = view.findViewById(R.id.tvWaterLevel);
        tvTemperatur = view.findViewById(R.id.tvTemperature);
        tvNValue = view.findViewById(R.id.tvNValue);
        tvPValue = view.findViewById(R.id.tvPValue);
        tvKValue = view.findViewById(R.id.tvKValue);

        deviceNameSpinner = view.findViewById(R.id.deviceNameSpinner);

        btnAdd = view.findViewById(R.id.btnAdd);




        return  view;
    }
}