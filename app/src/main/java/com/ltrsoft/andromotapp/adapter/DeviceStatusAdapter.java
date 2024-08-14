package com.ltrsoft.andromotapp.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.ltrsoft.andromotapp.modelclasses.User_Crop_Sensor_Pojo;
import com.ltrsoft.andromotapp.R;
import com.ltrsoft.andromotapp.utils.PercentageCircleView;

import java.util.List;

public class DeviceStatusAdapter extends RecyclerView.Adapter<DeviceStatusAdapter.StatusViewHolder> {
    Context context;
    List<User_Crop_Sensor_Pojo> sensorList;
    public String st,status;
    String sensor_list_id;
    public DeviceStatusAdapter(Context context, List<User_Crop_Sensor_Pojo> sensorList) {
        this.context=context;
        this.sensorList=sensorList;
    }

    @NonNull
    @Override
    public StatusViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.devicestatus_item,parent,false);
        return new StatusViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StatusViewHolder holder, int position) {
        User_Crop_Sensor_Pojo sensor = sensorList.get(position);
        holder.sensername.setText(sensor.getSensor_name_id());
        holder.status.setText(sensor.getSensor_status());
        st = sensor.getSensor_status();
        holder.cropname.setText(sensor.getCrop_name());

        sensor_list_id = sensor.getSensor_list_id();

        int sensorValue = Integer.parseInt(sensor.getSensor_value());
        int defaultvalue =
                (sensorValue*100)/1000;
        Log.d("value",""+sensorValue);
        Log.d("cal value",""+defaultvalue);

        holder.probar.setPercentage(defaultvalue);


       }

    @Override
    public int getItemCount() {
        return sensorList.size();
    }

    public static class StatusViewHolder extends RecyclerView.ViewHolder{
        private ProgressBar progressBar;
        private TextView sensername,cropname,status;
        private PercentageCircleView probar;
//        Switch aSwitch;

        public StatusViewHolder(@NonNull View itemView) {
            super(itemView);
            sensername = itemView.findViewById(R.id.sensorname);
            cropname = itemView.findViewById(R.id.cropname);
            status = itemView.findViewById(R.id.status);
            probar = itemView.findViewById(R.id.probar);
//            aSwitch = itemView.findViewById(R.id.toggle);
        }
    }
}
