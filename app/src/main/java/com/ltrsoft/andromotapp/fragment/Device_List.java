package com.ltrsoft.andromotapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.ltrsoft.andromotapp.R;
import com.ltrsoft.andromotapp.adapter.AddClientAdapter;
import com.ltrsoft.andromotapp.adapter.ServerAdapter;
import com.ltrsoft.andromotapp.apimodelclasses.Server_List_api;
import com.ltrsoft.andromotapp.pojoclasses.Server_List;
import com.ltrsoft.andromotapp.utils.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Device_List extends Fragment{

    //This fragment is made for show the serverlist

    private RecyclerView serverRecylerView;
    private ImageView btnBackImage;
    private FloatingActionButton btnAddServer;
    private List<Server_List> serverList;

    public Device_List() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.device_list, container, false);

        serverRecylerView = view.findViewById(R.id.serverRecyclerView);
        btnBackImage = view.findViewById(R.id.btnBackImg);
        btnAddServer = view.findViewById(R.id.btnAddServer);

        serverRecylerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        fetchServerList();

        return view;
    }

    private void fetchServerList() {

        Call<List<Server_List>> call = RetrofitClient.getRetrofitInstance().create(Server_List_api.class).readall_Server_List();

        call.enqueue(new Callback<List<Server_List>>() {
            @Override
            public void onResponse(Call<List<Server_List>> call, Response<List<Server_List>> response) {

                if(response.isSuccessful()){

                    if(response.body() != null){

                        serverList = response.body();
                        serverRecylerView.setAdapter(new ServerAdapter(getActivity() , serverList));
                        Toast.makeText(getActivity(), "Data fetching now", Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(getActivity(), "Response is null", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(getActivity(), "Response Failed", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<Server_List>> call, Throwable t) {
                Toast.makeText(getActivity(), "Connection Failed", Toast.LENGTH_SHORT).show();
            }
        });

    }
}