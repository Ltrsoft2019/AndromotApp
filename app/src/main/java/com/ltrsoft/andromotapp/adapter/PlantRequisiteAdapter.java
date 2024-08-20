package com.ltrsoft.andromotapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.ltrsoft.andromotapp.R;
import com.ltrsoft.andromotapp.pojoclasses.Crop_Details;

import java.util.ArrayList;

public class PlantRequisiteAdapter extends RecyclerView.Adapter<PlantRequisiteAdapter.ViewHolder> {


    //This adapter class made for plant requisite recycler view...

    private Context context;
    private ArrayList<Crop_Details> cropSugModelArrayList;

    public PlantRequisiteAdapter(Context context , ArrayList<Crop_Details> cropSugModelArrayList)
    {
        this.context = context;
        this.cropSugModelArrayList = cropSugModelArrayList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.plant_requisite_row , parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.cropImage.setImageResource(cropSugModelArrayList.get(position).getCrop_image());
        holder.tvCropName.setText(cropSugModelArrayList.get(position).getCrop_name());
        holder.tvDeviceName.setText(cropSugModelArrayList.get(position).getDevice_name());
        holder.tvStatus.setText("Ready");

        holder.plant_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Open plant requisite description", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return cropSugModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView cropImage;
        private TextView tvCropName , tvDeviceName , tvStatus;
        private CardView plant_card;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            cropImage = itemView.findViewById(R.id.cropImagePR);
            tvCropName = itemView.findViewById(R.id.tvCropNamePR);
            tvDeviceName = itemView.findViewById(R.id.tvDeviceNamePR);
            tvStatus = itemView.findViewById(R.id.tvStatusPR);
            plant_card = itemView.findViewById(R.id.plant_requisite_card);
        }
    }
}
