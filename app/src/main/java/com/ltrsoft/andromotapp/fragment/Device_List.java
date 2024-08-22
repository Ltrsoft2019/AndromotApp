package com.ltrsoft.andromotapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.ltrsoft.andromotapp.R;
import com.ltrsoft.andromotapp.adapter.ServerAdapter;
import com.ltrsoft.andromotapp.pojoclasses.Server_List;

import java.util.ArrayList;


public class Device_List extends Fragment {

    //This fragment is made for show the serverlist

    private RecyclerView serverRecylerView;
    private ImageView backImage;
    private FloatingActionButton btnAddServer;
    private ArrayList<Server_List>  serverListArrayList;

    public Device_List() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.device_list, container, false);

        serverRecylerView=view.findViewById(R.id.serverCardRecyclerView);
        backImage =view.findViewById(R.id.btnBack);
        btnAddServer = view.findViewById(R.id.btnAddServer);

        serverRecylerView.setLayoutManager(new LinearLayoutManager(getContext() , LinearLayoutManager.VERTICAL , false));

        serverListArrayList.add(new Server_List("Server 1", "This server installed on farm of soyabin"));
        serverRecylerView.setAdapter(new ServerAdapter(getContext() , serverListArrayList));



        backImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main,new NavigationDrawer()).commit();
            }
        });


        return view;
    }
}