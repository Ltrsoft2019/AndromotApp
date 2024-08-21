package com.ltrsoft.andromotapp.fragment;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public class CurrentCrop_Detail extends Fragment {

    private static String baseUrl ="https://andromot.ltr-soft.com/public/andromot/";


    private ImageView current_crop_image;
    private TextView TH_value,GWater,Nvalue,Pvalue,Kvalue,CropName,current_crop_desc;

    private List<Crop_Details> crop_detailsList;

    public CurrentCrop_Detail() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.current_crop_detail, container, false);

        current_crop_image = view.findViewById(R.id.current_crop_image);
        TH_value = view.findViewById(R.id.current_crop_TH_value);
        GWater = view.findViewById(R.id.current_crop_GWater);
        Nvalue = view.findViewById(R.id.current_crop_N_value);
        Pvalue = view.findViewById(R.id.current_crop_P_value);
        Kvalue = view.findViewById(R.id.current_crop_K_value);
        CropName = view.findViewById(R.id.current_crop_name);
        current_crop_desc = view.findViewById(R.id.current_crop_description);


        fetch_current_crop();

        return view;
    }

    public void fetch_current_crop() {

        Crop_Details_api cropDetailsApi = RetrofitClient.getInstance(baseUrl).create(Crop_Details_api.class);

        cropDetailsApi.read_by_id_Crop_Details(6).enqueue(new Callback<Crop_Details>() {
            @Override
            public void onResponse(Call<Crop_Details> call, Response<Crop_Details> response) {


                if(response.isSuccessful()){

                    crop_detailsList  = (List<Crop_Details>) response.body();
                    Crop_Details cropDetails = crop_detailsList.get(0);
                    String imageurl = "https://andromot.ltr-soft.com/public/andromot/inputfiles/"+ cropDetails.getCrop_image();
                    Picasso.get().load(imageurl).into(current_crop_image);

                    CropName.setText(cropDetails.getCrop_name());
                    TH_value.setText(cropDetails.getRequired_threshold_value());
                    GWater.setText("40 ml");
                    current_crop_desc.setText("Description of the current crop");
                    Nvalue.setText("50 mg-N/kg");
                    Pvalue.setText("4.5 mg/dl");
                    Kvalue.setText("4.2 mEq/L");

                    Toast.makeText(getContext(), "Success", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Crop_Details> call, Throwable t) {


                Toast.makeText(getContext(), "Failed", Toast.LENGTH_SHORT).show();
            }
        });

        //Call<List<Crop_Details>> call = cropDetailsApi.read_by_id_Crop_Details();
    }
}


