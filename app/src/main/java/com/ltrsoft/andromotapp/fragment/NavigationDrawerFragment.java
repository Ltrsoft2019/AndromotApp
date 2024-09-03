package com.ltrsoft.andromotapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.ltrsoft.andromotapp.MainActivity;
import com.ltrsoft.andromotapp.R;
import com.ltrsoft.andromotapp.adapter.CropSugAdapter;
import com.ltrsoft.andromotapp.adapter.PlantRequisiteAdapter;
import com.ltrsoft.andromotapp.apimodelclasses.Crop_Details_api;
import com.ltrsoft.andromotapp.pojoclasses.Crop_Details;
import com.ltrsoft.andromotapp.utils.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class NavigationDrawerFragment extends Fragment {

    public static  DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private Toolbar toolbar;
    private RecyclerView cropSuggRecyclerView , plantRequRecylerView;
    private List<Crop_Details> cropDetailsList;
    private List<Crop_Details> plantReqList;


    public NavigationDrawerFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.drawer_navigation_fragment, container, false);

        drawerLayout = view.findViewById(R.id.drawerlayout);
        navigationView = view.findViewById(R.id.drawerNavigationView);
        toolbar = view.findViewById(R.id.dashToolbar);
        cropSuggRecyclerView = view.findViewById(R.id.cropSuggRecyclerView);
        plantRequRecylerView = view.findViewById(R.id.plantRequisiteRecyclerView);

        cropSuggRecyclerView.setLayoutManager(new GridLayoutManager(getActivity() , 1 , GridLayoutManager.HORIZONTAL , false));
        plantRequRecylerView.setLayoutManager(new GridLayoutManager(getActivity() , 1 , LinearLayoutManager.HORIZONTAL , false));




        ((MainActivity)getActivity()).setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(getActivity() , drawerLayout , toolbar , R.string.OpenDrawer, R.string.CloseDrawer);
        drawerLayout.addDrawerListener(toggle);

        toggle.syncState();

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

        //This code make it for crop suggestions..

        Crop_Details_api cropDetailsApi =  RetrofitClient.getRetrofitInstance().create(Crop_Details_api.class);
        Call<List<Crop_Details>> call = cropDetailsApi.readAllCropDetails();

        call.enqueue(new Callback<List<Crop_Details>>() {
            @Override
            public void onResponse(Call<List<Crop_Details>> call, Response<List<Crop_Details>> response) {
                if(response.isSuccessful() && response.body() != null){
                    cropDetailsList = response.body();
                    cropSuggRecyclerView.setAdapter(new CropSugAdapter(getContext() , cropDetailsList));
                    plantReqList = response.body();
                    plantRequRecylerView.setAdapter(new PlantRequisiteAdapter(getActivity()  ,plantReqList));
                }else{
                    Toast.makeText(getActivity(), "Not Successful", Toast.LENGTH_SHORT).show();
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