package com.ltrsoft.andromotapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;


import com.ltrsoft.andromotapp.modelclasses.Crop_Details;
import com.ltrsoft.andromotapp.R;
import com.ltrsoft.andromotapp.adapter.AddCropAdapter;

import java.util.List;

public class AddCrop extends Fragment {

    RecyclerView recycler;
    private AddCropAdapter adapter;
    public static String url="https://andromot.ltr-soft.com";

    List<Crop_Details>list;

    public AddCrop() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.add_crop, container, false);

        recycler= view.findViewById(R.id.recycler);



        return view;
    }
}