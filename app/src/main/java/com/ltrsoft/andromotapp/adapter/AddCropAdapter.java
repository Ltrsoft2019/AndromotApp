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

public class AddCropAdapter extends RecyclerView.Adapter<AddCropAdapter.ViewHolder> {


    //This model class made for add crop recycler view for user application

    private Context context;
    private ArrayList<Crop_Details> addCropModelArrayList ;

    public AddCropAdapter(Context context , ArrayList<Crop_Details> addCropModelArrayList)
    {
        this.context = context;
        this.addCropModelArrayList = addCropModelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.add_crop_row , parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.addCropImage.setImageResource(addCropModelArrayList.get(position).getCrop_image());
        holder.tvAddCropName.setText(addCropModelArrayList.get(position).getCrop_name());
        holder.tvAddCropDescription.setText(addCropModelArrayList.get(position).getDescription());

        holder.addCrop_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Add crop next page`", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return addCropModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView addCropImage;
        private TextView tvAddCropName , tvAddCropDescription;
        private CardView addCrop_card;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            addCropImage = itemView.findViewById(R.id.addCropImage);
            tvAddCropName = itemView.findViewById(R.id.tvAddCropName);
            tvAddCropDescription = itemView.findViewById(R.id.tvAddCropDescription);
            addCrop_card = itemView.findViewById(R.id.addCrop_card);
        }
    }
}
