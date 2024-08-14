package com.ltrsoft.andromotapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.ltrsoft.andromotapp.R;

import java.util.List;


public class NavigationDrawer extends Fragment {
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    TextView hname;
    ImageView profilepic;
    Toolbar toolbar;
    private BottomNavigationView bottomNavigationView;
    String url = "https://andromot.ltr-soft.com";

    public NavigationDrawer() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.navigation, container, false);

        drawerLayout=view.findViewById(R.id.drawerlayout);
        navigationView=view.findViewById(R.id.navigationview);
        toolbar =view.findViewById(R.id.toolbar);
        bottomNavigationView = view.findViewById(R.id.bottomNavigationView);




        Dashboard dashboard = new Dashboard();
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,dashboard).commit();

        ((AppCompatActivity) requireActivity()).setSupportActionBar(toolbar);

        ActionBarDrawerToggle Toggle = new ActionBarDrawerToggle(getActivity(),drawerLayout,toolbar,
                R.string.open,R.string.close);

        drawerLayout.addDrawerListener(Toggle);
        Toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                int id = menuItem.getItemId();

                if (id == R.id.settings) {
                    Settings settings = new Settings();
                    loadFragment1(settings);
                }
                else if (id == R.id.profile) {
                    //Toast.makeText(getContext(), "Profile Page", Toast.LENGTH_SHORT).show();
                    Profile profile=new Profile();
                    loadFragment1(profile);
                }

//                else if (id == R.id.register) {
//                    //Toast.makeText(getContext(), "Profile Page", Toast.LENGTH_SHORT).show();
//                    Registration registration=new Registration();
//                    loadFragment1(registration);
//                }


                else if (id == R.id.sensor) {
                    Device_List sensorList = new Device_List();
                    loadFragment1(sensorList);

                } else {
                    Toast.makeText(getActivity(), "Logout", Toast.LENGTH_SHORT).show();
                }

                drawerLayout.closeDrawer(GravityCompat.START);

                return true;
            }
        });

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                int id = menuItem.getItemId();

                if (id==R.id.add){
                    AddCrop add = new AddCrop();

                    loadFragment(add);

                }
                else if (id==R.id.home) {
                    Dashboard dashboard1 = new Dashboard();
                    loadFragment(dashboard1);

                }
                else if (id==R.id.status){
                    DeviceStatus status = new DeviceStatus();
                    loadFragment(status);
                }
                else if (id==R.id.currentcrop) {
                    CurrentCrop currentCrop = new CurrentCrop();
                    loadFragment(currentCrop);
                }
                return true;
            }
        });

//        Api api = RetrofitClient.getInstance(url).create(Api.class);
//        api.get_user("7").enqueue(new Callback<List<User_Detail>>() {
//            @Override
//            public void onResponse(Call<List<User_Detail>> call, Response<List<User_Detail>> response) {
//                if (response.isSuccessful()) {
//                    list = response.body();
//                    User_Detail userDetail = list.get(0);
//
//                    hname = view.findViewById(R.id.name);
//                    profilepic = view.findViewById(R.id.propic);
//                    TextView email = view.findViewById(R.id.email);
//
//
//                    hname.setText(userDetail.getUser_fname());
//                    email.setText(userDetail.getEmail_id());
//                    String imageurl = "https://andromot.ltr-soft.com/public/andromot/inputfiles/" + userDetail.getUser_image();
//                        Picasso.get().load(imageurl).into(profilepic);
//
//                }
//                else {
//                    Toast.makeText(getContext(), "Response error", Toast.LENGTH_SHORT).show();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<User_Detail>> call, Throwable t) {
//                Toast.makeText(getContext(), ""+t.getMessage(), Toast.LENGTH_SHORT).show();
//            }
//        });


        return view;
    }

    private void loadFragment1(Fragment fragment) {
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main,fragment).commit();

    }
    private void loadFragment(Fragment fragment) {
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).addToBackStack(null).commit();
    }

}