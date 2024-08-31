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
import com.ltrsoft.andromotapp.pojoclasses.Client_List;
import com.ltrsoft.andromotapp.pojoclasses.Crop_Details;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class AddClientAdapter extends RecyclerView.Adapter<AddClientAdapter.ViewHolder>   {

    //This adapter class made for add client recycler view in user appliction

    private Context context;
    private List<Client_List> addClientModelList ;

    public AddClientAdapter(Context context , List<Client_List> addClientModelList)
    {
        this.context = context;
        this.addClientModelList = addClientModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.add_client_row  , parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.clientImage.setImageResource(R.drawable.ll);
        holder.tvClientName.setText(addClientModelList.get(position).getClient_name_id());
        holder.tvClientDescription.setText(addClientModelList.get(position).getClient_description());
        holder.tvdescription.setText("Description : ");

        holder.clientCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Open client scanner", Toast.LENGTH_SHORT).show();
            }
        });


//        String imageUrl = "https://andromot.ltr-soft.com/public/andromot/inputfiles/"+ cropDetails.getCrop_image();
//        Picasso.get().load(imageUrl).into(holder.addCropImage);
//
//        Picasso.get()
//                .load(imageUrl)
//                .placeholder(R.drawable.ic_launcher_background) // Placeholder image
//                .error(R.drawable.ic_launcher_background)       // Error image
//                .into(holder.addCropImage);


    }

    @Override
    public int getItemCount() {
        return addClientModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView clientImage;
        private TextView tvClientName , tvClientDescription , tvdescription;
        private CardView clientCardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            clientImage = itemView.findViewById(R.id.addClientImage);
            tvClientName = itemView.findViewById(R.id.tvAddClientName);
            tvClientDescription = itemView.findViewById(R.id.tvAddClientDescription);
            tvdescription = itemView.findViewById(R.id.tvDescription);
            clientCardView = itemView.findViewById(R.id.addClient_card);
        }
    }
}
