package com.ltrsoft.andromotapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.ltrsoft.andromotapp.fragment.AddCrop;
import com.ltrsoft.andromotapp.fragment.AddCrop_Detail;
import com.ltrsoft.andromotapp.fragment.Client_List_Fragment;
import com.ltrsoft.andromotapp.fragment.CurrentCrop_Detail;
import com.ltrsoft.andromotapp.fragment.DeviceStatus;
import com.ltrsoft.andromotapp.fragment.Device_List;
import com.ltrsoft.andromotapp.fragment.Login;
import com.ltrsoft.andromotapp.pojoclasses.Server_List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Login login = new Login();
        getSupportFragmentManager().beginTransaction().add(R.id.main,login).commit();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container,new CurrentCrop_Detail());
        fragmentTransaction.commit();

    }
}