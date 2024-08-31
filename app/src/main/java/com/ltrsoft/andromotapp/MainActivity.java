package com.ltrsoft.andromotapp;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.ltrsoft.andromotapp.fragment.AddCrop;
import com.ltrsoft.andromotapp.fragment.AddCrop_Detail;
import com.ltrsoft.andromotapp.fragment.ClientScan;
import com.ltrsoft.andromotapp.fragment.Client_List_Fragment;
import com.ltrsoft.andromotapp.fragment.Cock_ScanFragment;
import com.ltrsoft.andromotapp.fragment.CurrentCrop_Detail;
import com.ltrsoft.andromotapp.fragment.DeviceStatus;
import com.ltrsoft.andromotapp.fragment.Device_List;
import com.ltrsoft.andromotapp.fragment.Login;
import com.ltrsoft.andromotapp.fragment.NPK_Water_Detail;
import com.ltrsoft.andromotapp.fragment.ServerScan;
import com.ltrsoft.andromotapp.pojoclasses.Server_List;

public class MainActivity extends AppCompatActivity {

    private static final int CAMERA_REQUEST_CODE = 1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

       // Login login = new Login();
        //getSupportFragmentManager().beginTransaction().add(R.id.main,login).commit();

        // Check for camera permission
        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.CAMERA},
                    CAMERA_REQUEST_CODE);
        } else {
            loadScannerFragment();
        }


    }
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == CAMERA_REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                loadScannerFragment();
            } else {
                // Permission denied
                // Show a message to the user explaining why the permission is necessary
            }
        }
    }

    private void loadScannerFragment() {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container,new Cock_ScanFragment());
        fragmentTransaction.commit();

    }
}