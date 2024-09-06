package com.ltrsoft.andromotapp.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.ltrsoft.andromotapp.MainActivity;
import com.ltrsoft.andromotapp.R;


public class DashboardFragment extends Fragment {

    private static final String ROOT_FRAGMENT_TAG = "Dashboard";

    public static DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    BottomNavigationView bottomNavigationView;
    ActionBarDrawerToggle toggle;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_dashboard, container, false);

        drawerLayout = view.findViewById(R.id.drawerLayout);
        navigationView = view.findViewById(R.id.navView);
        toolbar = view.findViewById(R.id.dashToolbar);
        bottomNavigationView = view.findViewById(R.id.bottom_nav);

       ((MainActivity)getActivity()).setSupportActionBar(toolbar);
         toggle = new ActionBarDrawerToggle(getActivity() , drawerLayout , toolbar , R.string.OpenDrawer , R.string.CloseDrawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        //for navigation drawer...
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if(id == R.id.drawProfile){
                    Toast.makeText(getActivity(), "Profile Fragment Open", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.drawSensorList) {
                    Toast.makeText(getActivity(), "Sensor List Fragment Open", Toast.LENGTH_SHORT).show();
                } else if (id == R.id.drawSettings) {
                    Toast.makeText(getActivity(), "Setting Fragment Open", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getActivity(), "Log Out", Toast.LENGTH_SHORT).show();
                }
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });


        //for bottom navigation...
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if(id == R.id.bottomHome){//home

                    loadFragment(new DashboardFragment() , false);

                } else if (id == R.id.bottomAddCrop) {//addcrop

                    loadFragment(new AddCrop() , false);

                } else if (id == R.id.bottomStatus) {//status

                    loadFragment(new DeviceStatus() , false);

                }else {//currentCrop

                    loadFragment(new CurrentCrop_Detail() , false);

                }
                return true;
            }
        });


        return view;
    }

    private void loadFragment(Fragment fragment , Boolean flag ) {

        FragmentManager fm = getActivity().getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        fm.popBackStack("Dashboard" , FragmentManager.POP_BACK_STACK_INCLUSIVE);

        ft.replace(R.id.frameLayout , fragment);
        ft.addToBackStack("").commit();
        int id = fragment.getId();
        if(id != R.id.drawerLayout){
            ((MainActivity)getActivity()).getSupportActionBar().hide();
        }
    }
}