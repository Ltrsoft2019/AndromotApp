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
import java.util.List;

public class CropSugAdapter extends RecyclerView.Adapter<CropSugAdapter.ViewHolder> {

    //This adapter class made for "Crop Suggestion" Recyler View.

    private Context context;
    private List<Crop_Details> cropModelList;

    public CropSugAdapter(Context context , List<Crop_Details> cropSugModelList)
    {
        this.context = context;
        this.cropModelList = cropSugModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.crop_suggestion_row , parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        holder.cropImage.setImageResource(cropModelList.get(position).getCrop_image());
        holder.tvCropName.setText(cropModelList.get(position).getCrop_name());
        holder.tvDeviceName.setText(cropModelList.get(position).getDevice_name());
        holder.cropSuggestion_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Crop Description is open now", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return cropModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView cropImage;
        private TextView tvCropName , tvDeviceName;
        private CardView cropSuggestion_card; //It take for perform operation on recycler view list to get next page

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cropImage = itemView.findViewById(R.id.cropImage);
            tvCropName = itemView.findViewById(R.id.tvCropName);
            tvDeviceName = itemView.findViewById(R.id.tvDeviceName);
            cropSuggestion_card = itemView.findViewById(R.id.cropSuggestion_card);
        }
    }
}
