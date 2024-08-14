package com.ltrsoft.andromotapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;


import com.ltrsoft.andromotapp.modelclasses.CropPojo;
import com.ltrsoft.andromotapp.R;

import java.util.List;

public class CurrentCrop extends Fragment {

    private RecyclerView croprecyclerView;
    public static String url = "https://andromot.ltr-soft.com";

    List<CropPojo> list;

    public CurrentCrop() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.current_crop, container, false);
        croprecyclerView = view.findViewById(R.id.crop_recycler);
        currentCrop();

        return view;
    }

    private void currentCrop() {



    }
}