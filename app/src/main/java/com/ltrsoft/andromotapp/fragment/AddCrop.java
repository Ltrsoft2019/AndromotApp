package com.ltrsoft.andromotapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.ltrsoft.andromotapp.R;
import com.ltrsoft.andromotapp.adapter.AddCropAdapter;
import com.ltrsoft.andromotapp.pojoclasses.Crop_Details;

import java.util.ArrayList;
import java.util.List;

public class AddCrop extends Fragment {

    private ImageView btnBackImg;
    private RecyclerView addCropRecylerView;
    private ArrayList<Crop_Details> addCropArrayList = new ArrayList<Crop_Details>();

    public AddCrop() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.add_crop, container, false);

        btnBackImg = view.findViewById(R.id.btnBackImgAddCrop);
        addCropRecylerView = view.findViewById(R.id.addCropRecylerView);

        addCropRecylerView.setLayoutManager(new LinearLayoutManager(getContext() , LinearLayoutManager.VERTICAL , false));

        addCropArrayList.add(new Crop_Details(R.drawable.soyabin2 , "Soyabin" , "It is planted in the season of rain It is planted in the season of rain It is planted in the season of rain "));
        addCropArrayList.add(new Crop_Details(R.drawable.soyabin2 , "Soyabin" , "It is planted in the season of rain It is planted in the season of rain It is planted in the season of rain "));
        addCropArrayList.add(new Crop_Details(R.drawable.soyabin2 , "Soyabin" , "It is planted in the season of rain It is planted in the season of rain It is planted in the season of rain "));
        addCropArrayList.add(new Crop_Details(R.drawable.soyabin2 , "Soyabin" , "It is planted in the season of rain It is planted in the season of rain It is planted in the season of rain "));
        addCropArrayList.add(new Crop_Details(R.drawable.soyabin2 , "Soyabin" , "It is planted in the season of rain It is planted in the season of rain It is planted in the season of rain "));
        addCropArrayList.add(new Crop_Details(R.drawable.soyabin2 , "Soyabin" , "It is planted in the season of rain It is planted in the season of rain It is planted in the season of rain "));
        addCropArrayList.add(new Crop_Details(R.drawable.soyabin2 , "Soyabin" , "It is planted in the season of rain It is planted in the season of rain It is planted in the season of rain "));


        addCropRecylerView.setAdapter(new AddCropAdapter(getContext() , addCropArrayList));

        return view;
    }
}