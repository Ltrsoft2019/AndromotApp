package com.ltrsoft.andromotapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.ltrsoft.andromotapp.R;

public class Profile extends Fragment {
Button edit;
    ImageView profilepic,back;
    EditText full_name,email, phone, State, District, country, Address,city;

    public Profile() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.profile, container, false);
       edit=view.findViewById(R.id.button);
        full_name=view.findViewById(R.id.fullname);
        profilepic = view.findViewById(R.id.imageView);
        email=view.findViewById(R.id.email);
        phone=view.findViewById(R.id.mobile);
        State=view.findViewById(R.id.state);
        District=view.findViewById(R.id.district);
        country=view.findViewById(R.id.country);
        Address=view.findViewById(R.id.address);
        city = view.findViewById(R.id.city);
        back = view.findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavigationDrawer navigationDrawer = new NavigationDrawer();
                getActivity().getSupportFragmentManager()
                        .beginTransaction().replace(R.id.main,navigationDrawer).commit();
            }
        });

        return view;
    }









}