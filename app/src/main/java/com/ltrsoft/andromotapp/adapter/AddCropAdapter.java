package com.ltrsoft.andromotapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.ltrsoft.andromotapp.modelclasses.Crop_Details;
import com.ltrsoft.andromotapp.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AddCropAdapter extends RecyclerView.Adapter<AddCropAdapter.AddCropViewHolder> {
    Context context;
    List<Crop_Details> list;
    public AddCropAdapter(Context context, List<Crop_Details> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public AddCropViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.addcrop_item, parent, false);
        return new AddCropViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AddCropViewHolder holder, int position) {
        Crop_Details details = list.get(position);
        holder.cropname.setText(details.getCrop_name());
//        holder.threshold_value.setText(details.getRequired_threshold_value());
        holder.desc.setText(details.getDescription());
        String imageurl = "https://andromot.ltr-soft.com/public/andromot/inputfiles/"+ details.getCrop_image();
        Picasso.get().load(imageurl).into(holder.imageView);

//        holder.cardView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String cropId = details.getCrop_id();// Assuming you have a method to get cropId from Crop_Details
//                AddCropDetail fragment = AddCropDetail.newInstance(cropId);
//                AppCompatActivity activity = (AppCompatActivity) v.getContext();
//                activity.getSupportFragmentManager().beginTransaction().replace(R.id.main, fragment).addToBackStack(null).commit();
//
//            }
//        });
    }




    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class AddCropViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView cropname,desc,threshold_value;
        CardView cardView;
        public AddCropViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.image);
            cropname = itemView.findViewById(R.id.name);
            desc = itemView.findViewById(R.id.desc);
            cardView = itemView.findViewById(R.id.card);
//            threshold_value = itemView.findViewById(R.id.threshold_value);



        }
    }
}
