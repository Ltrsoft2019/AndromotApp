package com.ltrsoft.andromotapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.ltrsoft.andromotapp.R;
import com.ltrsoft.andromotapp.adapter.AddCropAdapter;
import com.ltrsoft.andromotapp.apimodelclasses.Crop_Details_api;
import com.ltrsoft.andromotapp.pojoclasses.Crop_Details;
import com.ltrsoft.andromotapp.utils.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AddCrop extends Fragment {

    private ImageView btnBackImg;
    private RecyclerView addCropRecylerView;
    private List<Crop_Details> addCropList ;
    Toolbar toolbar;
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

        addCropRecylerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        Crop_Details_api api = RetrofitClient.getRetrofitInstance().create(Crop_Details_api.class);
        Call<List<Crop_Details>> call = api.read_Crop_Details();

        call.enqueue(new Callback<List<Crop_Details>>() {
            @Override
            public void onResponse(Call<List<Crop_Details>> call, Response<List<Crop_Details>> response) {

                if(response.isSuccessful() && response.body() != null){

                    addCropList = response.body();
                    addCropRecylerView.setAdapter(new AddCropAdapter(getActivity() , addCropList));

                    Toast.makeText(getActivity(), "Data successfully fetch", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getActivity(), "Failed to fetch data", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<Crop_Details>> call, Throwable t) {
                Toast.makeText(getActivity(), "Failed", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }



}