package com.ltrsoft.andromotapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.ltrsoft.andromotapp.modelclasses.CropPojo;
import com.ltrsoft.andromotapp.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CurrentCrop_Adapter extends RecyclerView.Adapter<CurrentCrop_Adapter.CropViewHolder> {

    private Context context;
    private List<CropPojo> cropList;

    public CurrentCrop_Adapter(Context context, List<CropPojo> cropList) {
        this.context = context;
        this.cropList = cropList;
    }

    @NonNull
    @Override
    public CropViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.current_crop_item, parent, false);
        return new CropViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CropViewHolder holder, int position) {
        CropPojo crop = cropList.get(position);
        holder.textViewCropName.setText(crop.getCrop_name());
        String imageurl = "https://andromot.ltr-soft.com/public/andromot/inputfiles/"+ crop.getCrop_image();
        Picasso.get().load(imageurl).into(holder.imageViewCrop);


//        holder.imageViewCrop.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String cropId = crop.getCrop_id();// Assuming you have a method to get cropId from Crop_Details
//                CropDetail_Fragment fragment = CropDetail_Fragment.newInstance(cropId);
//                AppCompatActivity activity = (AppCompatActivity) v.getContext();
//                activity.getSupportFragmentManager().beginTransaction().replace(R.id.main, fragment).addToBackStack(null).commit();
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return cropList.size();
    }

    public static class CropViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewCrop;
        TextView textViewCropName;

        public CropViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewCrop = itemView.findViewById(R.id.imageViewCrop);
            textViewCropName = itemView.findViewById(R.id.textViewCropName);
        }
    }
}
