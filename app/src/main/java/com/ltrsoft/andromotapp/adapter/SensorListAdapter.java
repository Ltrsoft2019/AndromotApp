package com.ltrsoft.andromotapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.ltrsoft.andromotapp.modelclasses.User_Client_Sensor_List;
import com.ltrsoft.andromotapp.R;

import java.util.List;

public class SensorListAdapter extends RecyclerView.Adapter<SensorListAdapter.SensorListViewHolder> {

    Context context;
    List<User_Client_Sensor_List> sensorList;

    public SensorListAdapter(Context context, List<User_Client_Sensor_List> sensorList) {
        this.context=context;
        this.sensorList=sensorList;
    }

    @NonNull
    @Override
    public SensorListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.senser_list_card,parent,false);
        return new SensorListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SensorListViewHolder holder, int position) {
        User_Client_Sensor_List User_Client_Sensor_List = sensorList.get(position);
    holder.sensername.setText(User_Client_Sensor_List.getSensor_name_id());
    holder.status.setText(User_Client_Sensor_List.getSensor_status());
    }

    @Override
    public int getItemCount() {
        return sensorList.size();
    }

    public static class SensorListViewHolder extends RecyclerView.ViewHolder{
        TextView sensername,status;
        public SensorListViewHolder(@NonNull View itemView) {
            super(itemView);

            sensername=itemView.findViewById(R.id.sensorname);
            status = itemView.findViewById(R.id.statu);

        }
    }
}
