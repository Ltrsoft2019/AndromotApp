package com.ltrsoft.andromotapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;



import com.ltrsoft.andromotapp.R;
import com.ltrsoft.andromotapp.adapter.DeviceModelStatusAdapter;
import com.ltrsoft.andromotapp.apimodelclasses.UserCropSensor;
import com.ltrsoft.andromotapp.pojoclasses.SenseCropNPKModel;
import com.ltrsoft.andromotapp.pojoclasses.User_Crop_Sensor_Pojo;
import com.ltrsoft.andromotapp.utils.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DeviceStatus extends Fragment {

    private RecyclerView deviceModelRecylerView;
    private List<SenseCropNPKModel> deviceModelStatusList ;

    public DeviceStatus() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.device_status, container, false);

        deviceModelRecylerView = view.findViewById(R.id.deviceModelRecylerView);

        deviceModelRecylerView.setLayoutManager(new LinearLayoutManager(getContext()));

        setDataDeviceModelStatus();

        return view;
    }

    private void setDataDeviceModelStatus() {

        UserCropSensor userCropSensorAPI = RetrofitClient.getRetrofitInstance().create(UserCropSensor.class);
        Call<List<SenseCropNPKModel>> call = userCropSensorAPI.readAllDetailOfCrop();

        call.enqueue(new Callback<List<SenseCropNPKModel>>() {
            @Override
            public void onResponse(Call<List<SenseCropNPKModel>> call, Response<List<SenseCropNPKModel>> response) {
                if(response.isSuccessful() && response.body() != null){
                    loadData(response.body());
                    Toast.makeText(getActivity(), "Successfull", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getActivity(), "Response Failed", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<SenseCropNPKModel>> call, Throwable t) {
                Toast.makeText(getActivity(), "Failed", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void loadData(List<SenseCropNPKModel> body) {

        deviceModelStatusList = body;
        deviceModelRecylerView.setAdapter(new DeviceModelStatusAdapter(getContext() , deviceModelStatusList));
    }
}