package com.ltrsoft.andromotapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.google.zxing.ResultPoint;
import com.journeyapps.barcodescanner.BarcodeCallback;
import com.journeyapps.barcodescanner.BarcodeResult;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.ltrsoft.andromotapp.R;

import java.util.List;

public class ServerScan extends Fragment {

    private DecoratedBarcodeView barcodeView_of_server;
    private TextView scannedDataTextView_of_server;
    private ImageButton btnBackFromServerScan;
    private Button btnNextFromServerScan, btnAddServerScan;
    private String scannedCodeFromServerScan = null;




    public ServerScan() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.server_scan, container, false);

        barcodeView_of_server = view.findViewById(R.id.barcode_scanner_of_server);
        scannedDataTextView_of_server = view.findViewById(R.id.scanned_data_of_server);
        btnBackFromServerScan = view.findViewById(R.id.btnBackFromServerScan);
        btnNextFromServerScan = view.findViewById(R.id.btnNextFromServerScan);
        btnAddServerScan = view.findViewById(R.id.btnAddServerScan);

        barcodeView_of_server.decodeContinuous(new BarcodeCallback() {
            @Override
            public void barcodeResult(BarcodeResult result) {
                // Handle the scanned barcode here
                scannedCodeFromServerScan = result.getText();
                // Display the scanned code in the TextView
                scannedDataTextView_of_server.setText(scannedCodeFromServerScan);
                //scannedDataTextView_of_server.setVisibility(View.VISIBLE);
            }

            @Override
            public void possibleResultPoints(List<ResultPoint> resultPoints) {
                // Optional: handle potential result points (not required for simple display)
            }
        });

        btnBackFromServerScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnNextFromServerScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnAddServerScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pass scannedCodeFromServerScan
            }
        });
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        barcodeView_of_server.resume();
    }

    @Override
    public void onPause() {
        super.onPause();
        barcodeView_of_server.pause();
    }
}