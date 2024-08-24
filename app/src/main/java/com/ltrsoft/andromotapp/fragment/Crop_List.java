package com.ltrsoft.andromotapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.ltrsoft.andromotapp.R;
import com.ltrsoft.andromotapp.adapter.AddCropAdapter;
import com.ltrsoft.andromotapp.apimodelclasses.Crop_Details_api;
import com.ltrsoft.andromotapp.pojoclasses.Crop_Details;
import com.ltrsoft.andromotapp.utils.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Crop_List extends Fragment {

    private AddCropAdapter adapter;
    private RecyclerView recyclerView;


    public Crop_List() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.crop_list, container, false);

        //recycler
        recyclerView = view.findViewById(R.id.crop_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Fetch crop details using Retrofit
        fetchCropDetails();

        return view;
    }

    private void fetchCropDetails() {


        Crop_Details_api api = RetrofitClient.getRetrofitInstance().create(Crop_Details_api.class);
        Call<List<Crop_Details>> call = api.read_Crop_Details();

        call.enqueue(new Callback<List<Crop_Details>>() {
            @Override
            public void onResponse(Call<List<Crop_Details>> call, Response<List<Crop_Details>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    generateDataList(response.body());
                    Toast.makeText(getContext(), "Hello", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<List<Crop_Details>> call, Throwable t) {

                Toast.makeText(getContext(), "Failed", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void generateDataList(List<Crop_Details> cropList) {

        // Pass the context to the adapter
        adapter = new AddCropAdapter(getContext(), cropList);
        recyclerView.setAdapter(adapter);
    }

}