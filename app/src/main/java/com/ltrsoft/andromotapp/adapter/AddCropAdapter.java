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
import com.squareup.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class AddCropAdapter extends RecyclerView.Adapter<AddCropAdapter.ViewHolder> {


    //This model class made for add crop recycler view for user application

    private Context context;
    private List<Crop_Details> addCropModelList ;

    public AddCropAdapter(Context context , List<Crop_Details> addCropModelList)
    {
        this.context = context;
        this.addCropModelList = addCropModelList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.add_crop_row , parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Crop_Details cropDetails = addCropModelList.get(position);


        holder.tvAddCropName.setText(addCropModelList.get(position).getCrop_name());
        holder.tvAddCropDescription.setText(addCropModelList.get(position).getDescription());
        //holder.required_threshold_value.setText(addCropModelList.get(position).getRequired_threshold_value());



        //commented for testing
       /* holder.addCrop_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Add crop next page`", Toast.LENGTH_SHORT).show();
            }
        });*/
        // Load crop image using Picasso


        String imageUrl = "https://andromot.ltr-soft.com/public/andromot/inputfiles/"+ cropDetails.getCrop_image();
        Picasso.get().load(imageUrl).into(holder.addCropImage);

        Picasso.get()
                .load(imageUrl)
                .placeholder(R.drawable.ic_launcher_background) // Placeholder image
                .error(R.drawable.ic_launcher_background)       // Error image
                .into(holder.addCropImage);


    }

    @Override
    public int getItemCount() {
        return addCropModelList.size();
    }


   public class ViewHolder extends RecyclerView.ViewHolder{

        public final View mView;

        public ImageView addCropImage;
        private TextView tvAddCropName , tvAddCropDescription,required_threshold_value;
        private CardView addCrop_card;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mView = itemView;

            addCropImage = mView.findViewById(R.id.addCropImage);
            tvAddCropName = mView.findViewById(R.id.tvAddCropName);
            tvAddCropDescription = mView.findViewById(R.id.tvAddCropDescription);
            //required_threshold_value = mView.findViewById(R.id.required_threshold_value);
            //addCrop_card = itemView.findViewById(R.id.addCrop_card);
        }
    }

}
