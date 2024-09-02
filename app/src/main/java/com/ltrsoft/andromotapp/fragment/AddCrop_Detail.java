package com.ltrsoft.andromotapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import com.ltrsoft.andromotapp.R;
import com.ltrsoft.andromotapp.apimodelclasses.Crop_Details_api;
import com.ltrsoft.andromotapp.pojoclasses.Crop_Details;
import com.ltrsoft.andromotapp.utils.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AddCrop_Detail extends Fragment {

    private ImageView btnBackImg , btnRefresh , cropImage;
    private TextView tvCropNameDet , tvCropDescDet , tvTHValue , tvWaterLevel , tvTemperatur , tvNValue , tvPValue , tvKValue;
    private Spinner deviceNameSpinner;
    private Button btnAdd;

    public AddCrop_Detail() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.add_crop_detail, container, false);

        btnBackImg = view.findViewById(R.id.btnBackImg);
        btnRefresh = view.findViewById(R.id.btnRefresh);
        cropImage  = view.findViewById(R.id.cropImag);

        tvCropNameDet = view.findViewById(R.id.tvCropNameDet);
        tvCropDescDet = view.findViewById(R.id.tvCropDescDet);
        tvTHValue = view.findViewById(R.id.tvTHValue);
        tvWaterLevel = view.findViewById(R.id.tvWaterLevel);
        tvTemperatur = view.findViewById(R.id.tvTemperature);
        tvNValue = view.findViewById(R.id.tvNValue);
        tvPValue = view.findViewById(R.id.tvPValue);
        tvKValue = view.findViewById(R.id.tvKValue);

        deviceNameSpinner = view.findViewById(R.id.deviceNameSpinner);

        btnAdd = view.findViewById(R.id.btnAdd);


        Crop_Details_api cropDetailsApi = RetrofitClient.getRetrofitInstance().create(Crop_Details_api.class);
        Call<List<Crop_Details>> call = cropDetailsApi.read_by_id_Crop_Details(4);

        call.enqueue(new Callback<List<Crop_Details>>() {
            @Override
            public void onResponse(Call<List<Crop_Details>> call, Response<List<Crop_Details>> response) {
                Crop_Details cropDetails = (Crop_Details) response.body();
                if(response.isSuccessful() && response.body() != null){
                    tvCropNameDet.setText(cropDetails.getCrop_name());
                    tvCropDescDet.setText(cropDetails.getDescription());
                    tvTHValue.setText(cropDetails.getRequired_threshold_value());
                    Toast.makeText(getContext(), "Successfull", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getContext(), "Body is null", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<Crop_Details>> call, Throwable t) {
                Toast.makeText(getActivity(), "Failed", Toast.LENGTH_SHORT).show();
            }
        });




        return  view;
    }
}