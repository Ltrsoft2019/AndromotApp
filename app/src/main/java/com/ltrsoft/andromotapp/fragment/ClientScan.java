package com.ltrsoft.andromotapp.fragment;

import android.os.Bundle;
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
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.google.zxing.ResultPoint;
import com.journeyapps.barcodescanner.BarcodeCallback;
import com.journeyapps.barcodescanner.BarcodeResult;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.ltrsoft.andromotapp.R;
import com.ltrsoft.andromotapp.adapter.AddClientAdapter;
import com.ltrsoft.andromotapp.adapter.AddCropAdapter;
import com.ltrsoft.andromotapp.adapter.ServerAdapter;
import com.ltrsoft.andromotapp.apimodelclasses.Client_List_api;
import com.ltrsoft.andromotapp.apimodelclasses.Server_List_api;
import com.ltrsoft.andromotapp.pojoclasses.Client_List;
import com.ltrsoft.andromotapp.pojoclasses.Server_List;
import com.ltrsoft.andromotapp.utils.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ClientScan extends Fragment implements AdapterView.OnItemSelectedListener {

    private DecoratedBarcodeView barcodeView_of_client;
    private TextView scannedDataTextView_of_client;
    private Spinner spinnerOfClientScan;
    private Button btnNextFromClientScan,btnAddClientScan;
    private RadioGroup clientTypes;
    private RadioButton clientType1, clientType2;
    private ImageButton btnBackFromClientScan;

    private String scannedCodeofClientScan = null, Selected_Server = null,Selected_Client_Type = null;


    public ClientScan() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.client_scan, container, false);

        barcodeView_of_client = view.findViewById(R.id.barcode_scanner_of_client);
        scannedDataTextView_of_client = view.findViewById(R.id.scanned_data_of_client);
        spinnerOfClientScan = view.findViewById(R.id.spinnerOfClientScan);
        btnNextFromClientScan = view.findViewById(R.id.btnNextFromClientScan);
        clientTypes = view.findViewById(R.id.rbtnClientType);
        clientType1 = view.findViewById(R.id.rdtnClientType1);
        clientType2 = view.findViewById(R.id.rbtnClientType2);
        btnAddClientScan = view.findViewById(R.id.btnAddClientScan);
        btnBackFromClientScan  = view.findViewById(R.id.btnBackFromClientScan);

        //spinner have given default listener
        spinnerOfClientScan.setOnItemSelectedListener(this);
        //spinnerOfClientScan.setPrompt("Select Server");

        loadSpinnerData();

        //for continuous getting values from our scanner which would read barcode and QR code and gives the response as result in our situation
        barcodeView_of_client.decodeContinuous(new BarcodeCallback() {
            @Override
            public void barcodeResult(BarcodeResult result) {
                // Handle the scanned barcode here
                scannedCodeofClientScan = result.getText();
                // Display the scanned code in the TextView
                scannedDataTextView_of_client.setText(scannedCodeofClientScan);
                //scannedDataTextView_of_client.setVisibility(View.VISIBLE);
            }

            @Override
            public void possibleResultPoints(List<ResultPoint> resultPoints) {
                // Optional: handle potential result points (not required for simple display)
            }
        });


          clientTypes.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                Toast.makeText(getContext(), ""+checkedId, Toast.LENGTH_SHORT).show();
                if(checkedId == clientType1.getId()){
                    Selected_Client_Type = "With NPK";
                    Toast.makeText(getContext(), "Type 1", Toast.LENGTH_SHORT).show();
                    //use for the operations if type 1 selected
                } else if (checkedId == clientType2.getId()) {
                    Selected_Client_Type = "Without NPK";
                    Toast.makeText(getContext(), "Type 2", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnAddClientScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // send data of scannedCode , Selected_Server, Selected_Client_Type

            }
        });

        btnNextFromClientScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //for jumping to new page
            }
        });


        return view;
    }

    //this is the definition for the loadSpinnerData here we are going to retrieve data from database
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

    private void generateDataList(List<Server_List> serverList){

        List<String> serverNames = new ArrayList<>();
        for (Server_List server : serverList) {
            serverNames.add(server.getServer_name_id()); // Assuming getClient_name_id() returns the client name or some identifier
        }

        // Create an ArrayAdapter using a simple spinner layout and the client names list
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, serverNames);

        // Specify the layout to use when the list of choices appears
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinnerOfClientScan.setAdapter(dataAdapter);

    }

    @Override
    public void onResume() {
        super.onResume();
        barcodeView_of_client.resume();
    }

    @Override
    public void onPause() {
        super.onPause();
        barcodeView_of_client.pause();
    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        //use this method for the operation which would be performed when one select any item from spinner

        Selected_Server = parent.getItemAtPosition(position).toString();
        Toast.makeText(getContext(), ""+Selected_Server, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}