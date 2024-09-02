package com.ltrsoft.andromotapp.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.ResultPoint;
import com.journeyapps.barcodescanner.BarcodeCallback;
import com.journeyapps.barcodescanner.BarcodeResult;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.ltrsoft.andromotapp.R;
import com.ltrsoft.andromotapp.adapter.ServerAdapter;
import com.ltrsoft.andromotapp.apimodelclasses.Cock_List_api;
import com.ltrsoft.andromotapp.apimodelclasses.Server_List_api;
import com.ltrsoft.andromotapp.pojoclasses.Cock_List;
import com.ltrsoft.andromotapp.pojoclasses.Server_List;
import com.ltrsoft.andromotapp.utils.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Cock_ScanFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    private DecoratedBarcodeView barcodeView_of_cock;
    private TextView scannedDataTextView_of_cock;
    private Spinner spinnerOfCockScan;
    private Button btnNextFromCockScan,btnAddCockScan;
    private ImageButton btnBackFromCockScan;

    private String scannedCodeofCockScan = null, Selected_Server_fromCock_Scan = null;


    public Cock_ScanFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cock__scan, container, false);

//        barcodeView_of_cock = view.findViewById(R.id.barcode_scanner_of_cock);
        scannedDataTextView_of_cock = view.findViewById(R.id.scanned_data_of_cock);
//        spinnerOfCockScan = view.findViewById(R.id.spinnerOfCockScan);
        btnNextFromCockScan = view.findViewById(R.id.btnNextFromCockScan);
        btnAddCockScan = view.findViewById(R.id.btnAddClientScan);
        btnBackFromCockScan  = view.findViewById(R.id.btnBackFromCockScan);

        spinnerOfCockScan.setOnItemSelectedListener(this);

        loadSpinnerData();



        barcodeView_of_cock.decodeContinuous(new BarcodeCallback() {
            @Override
            public void barcodeResult(BarcodeResult result) {
                scannedCodeofCockScan = result.getText();
                // Display the scanned code in the TextView
                scannedDataTextView_of_cock.setText(scannedCodeofCockScan);
            }

            @Override
            public void possibleResultPoints(List<ResultPoint> resultPoints) {
               // BarcodeCallback.super.possibleResultPoints(resultPoints);
            }
        });

        return view;
    }

    private void loadSpinnerData() {

        Server_List_api api = RetrofitClient.getRetrofitInstance().create(Server_List_api.class);
        Call<List<Server_List>> call = api.readall_Server_List();

        call.enqueue(new Callback<List<Server_List>>() {
            @Override
            public void onResponse(Call<List<Server_List>> call, Response<List<Server_List>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    generateDataList(response.body());
                    Toast.makeText(getContext(), "Hello", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<Server_List>> call, Throwable t) {

            }
        });

    }

    private void generateDataList(List<Server_List> serverList) {

        List<String> serverNames = new ArrayList<>();
        for (Server_List server : serverList) {
            serverNames.add(server.getServer_name_id()); // Assuming getClient_name_id() returns the client name or some identifier
        }

        // Create an ArrayAdapter using a simple spinner layout and the client names list
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, serverNames);

        // Specify the layout to use when the list of choices appears
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinnerOfCockScan.setAdapter(dataAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        //use this method for the operation which would be performed when one select any item from spinner

        Selected_Server_fromCock_Scan = parent.getItemAtPosition(position).toString();
        Toast.makeText(getContext(), ""+Selected_Server_fromCock_Scan, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onResume() {
        super.onResume();
        barcodeView_of_cock.resume();
    }

    @Override
    public void onPause() {
        super.onPause();
        barcodeView_of_cock.pause();
    }

}