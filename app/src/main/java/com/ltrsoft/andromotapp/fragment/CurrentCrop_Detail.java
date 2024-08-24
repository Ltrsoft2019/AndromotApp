package com.ltrsoft.andromotapp.fragment;



import static android.content.ContentValues.TAG;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.ltrsoft.andromotapp.R;
import com.ltrsoft.andromotapp.apimodelclasses.Crop_Details_api;
import com.ltrsoft.andromotapp.pojoclasses.Crop_Details;
import com.ltrsoft.andromotapp.utils.RetrofitClient;
import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CurrentCrop_Detail extends Fragment {

    private ImageView cropImage;
    private TextView cropName, cropDescription, cropTHValue, cropGWater;
    private TextView cropNValue, cropPValue, cropKValue;
    private Button backButton;

    private static final int STATIC_CROP_ID = 4; // Use your static crop ID here


    public CurrentCrop_Detail() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.current_crop_detail, container, false);

        cropImage = view.findViewById(R.id.current_crop_image);
        cropName = view.findViewById(R.id.current_crop_name);
        cropDescription = view.findViewById(R.id.current_crop_description);
        cropTHValue = view.findViewById(R.id.current_crop_TH_value);
        cropGWater = view.findViewById(R.id.current_crop_GWater);
        cropNValue = view.findViewById(R.id.current_crop_N_value);
        cropPValue = view.findViewById(R.id.current_crop_P_value);
        cropKValue = view.findViewById(R.id.current_crop_K_value);
        backButton = view.findViewById(R.id.btn_back_from_current_crop);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getFragmentManager() != null) {
                    getFragmentManager().popBackStack();
                }
            }
        });

        fetch_current_crop();

        return view;
    }

    public void fetch_current_crop() {

        Crop_Details_api api = RetrofitClient.getRetrofitInstance()
                .create(Crop_Details_api.class);

        Call<List<Crop_Details>> call = api.read_by_id_Crop_Details(STATIC_CROP_ID);

        call.enqueue(new Callback<List<Crop_Details>>() {
            @Override
            public void onResponse(Call<List<Crop_Details>> call, Response<List<Crop_Details>> response) {

                if (response.isSuccessful() && response.body() != null && !response.body().isEmpty()) {
                    Crop_Details cropDetails = response.body().get(0);
                    updateUIWithCropDetails(cropDetails);
                } else {
                    Toast.makeText(getContext(), "No crop details found", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<Crop_Details>> call, Throwable t) {

                Toast.makeText(getContext(), "Failed to fetch crop details", Toast.LENGTH_SHORT).show();

            }
        });

    }

    private void updateUIWithCropDetails(Crop_Details cropDetails) {


        cropName.setText(cropDetails.getCrop_name());
        cropDescription.setText(cropDetails.getDescription());
        cropTHValue.setText(cropDetails.getRequired_threshold_value());


        cropGWater.setText("Ground Water Data");
        cropNValue.setText("N Value Data");
        cropPValue.setText("P Value Data");
        cropKValue.setText("K Value Data");

        String imageUrl = "https://andromot.ltr-soft.com/public/andromot/inputfiles/" + cropDetails.getCrop_image();
        Picasso.get()
                .load(imageUrl)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(cropImage);
    }
    }




