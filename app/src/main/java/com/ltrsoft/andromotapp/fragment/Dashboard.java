package com.ltrsoft.andromotapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import com.ltrsoft.andromotapp.MainActivity;
import com.ltrsoft.andromotapp.R;


public class Dashboard extends Fragment {


    private BottomNavigationView bottomNavigationView;

    public Dashboard() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.dashboard, container, false);


        bottomNavigationView = view.findViewById(R.id.bottomNavigationView);

        loadFragment(new NavigationDrawerFragment() , true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if(id == R.id.bottomHome){//home

                    loadFragment(new NavigationDrawerFragment() , false);

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
        bottomNavigationView.setSelectedItemId(R.id.bottomHome);

        return view;
    }

    private void loadFragment(Fragment fragment , boolean flag) {

        FragmentManager fm = getChildFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        if(flag){
            ft.add(R.id.dashboardFrame , fragment);
        }else {
            ft.replace(R.id.dashboardFrame , fragment);
        }
        ft.commit();
    }


}