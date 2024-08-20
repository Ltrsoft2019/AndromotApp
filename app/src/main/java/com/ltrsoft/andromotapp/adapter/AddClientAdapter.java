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

import java.util.ArrayList;

public class AddClientAdapter extends RecyclerView.Adapter<AddClientAdapter.ViewHolder> {

    //This adapter class made for add client recycler view in user appliction

    private Context context;
    private ArrayList<Client_List> addClientModelArrayList ;

    public AddClientAdapter(Context context , ArrayList<Client_List> addClientModelArrayList)
    {
        this.context = context;
        this.addClientModelArrayList = addClientModelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.add_client_row  , parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.clientImage.setImageResource(R.drawable.ll);
        holder.tvClientName.setText(addClientModelArrayList.get(position).getClient_name_id());
        holder.tvClientDescription.setText(addClientModelArrayList.get(position).getClient_description());
        holder.tvdescription.setText("Description : ");
        holder.clientCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Open client scanner", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return addClientModelArrayList.size();
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
