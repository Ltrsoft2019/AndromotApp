package com.ltrsoft.andromotapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.ltrsoft.andromotapp.R;
import com.ltrsoft.andromotapp.pojoclasses.SenseCropNPKModel;
import com.ltrsoft.andromotapp.pojoclasses.User_Crop_Sensor_Pojo;

import java.util.ArrayList;
import java.util.List;

public class DeviceModelStatusAdapter extends RecyclerView.Adapter<DeviceModelStatusAdapter.ViewHolder> {

    private Context context;
    private List<SenseCropNPKModel> deviceStatusModelList ;

    public DeviceModelStatusAdapter(Context context , List<SenseCropNPKModel> deviceStatusModelList)
    {
        this.context = context;
        this.deviceStatusModelList = deviceStatusModelList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.device_model_status_row , parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvDeviceName.setText(deviceStatusModelList.get(position).getClientId());
        holder.tvCropName.setText(deviceStatusModelList.get(position).getCropName());
        holder.tvStatusOnOf.setText(deviceStatusModelList.get(position).getClientStatus());
        holder.deviceModel_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Next Activity", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return deviceStatusModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvDeviceName , tvCropName , tvStatusOnOf;
        private CardView deviceModel_card;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvDeviceName = itemView.findViewById(R.id.tvDeviceNameDMS);
            tvCropName = itemView.findViewById(R.id.tvCropNameDMS);
            tvStatusOnOf = itemView.findViewById(R.id.tvStatusDMS);
            deviceModel_card = itemView.findViewById(R.id.deviceModel_card);
        }
    }
}
