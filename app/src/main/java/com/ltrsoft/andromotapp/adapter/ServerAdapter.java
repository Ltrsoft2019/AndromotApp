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
import com.ltrsoft.andromotapp.pojoclasses.Server_List;

import java.util.ArrayList;

public class ServerAdapter extends RecyclerView.Adapter<ServerAdapter.ViewHolder> {

    //This adapter made for add Server recylerview ...

    private Context context;
    private ArrayList<Server_List> serverModelArrayList;

    public ServerAdapter(Context context, ArrayList<Server_List> serverModelArrayList)
    {
        this.context = context;
        this.serverModelArrayList = serverModelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.server_row , parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.cropImage.setImageResource(R.drawable.server);
        holder.tvServerName.setText(serverModelArrayList.get(position).getServer_name_id());
        holder.tvServerDescription.setText(serverModelArrayList.get(position).getServer_description());
        holder.tvDescription.setText("Description :");
        holder.serverCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Open next page", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return serverModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView cropImage;
        private TextView tvServerName , tvServerDescription , tvDescription;
        private CardView serverCard;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            cropImage = itemView.findViewById(R.id.cropImageSr);
            tvServerName = itemView.findViewById(R.id.tvServerName);
            tvServerDescription = itemView.findViewById(R.id.tvServerDescription);
            tvDescription = itemView.findViewById(R.id.tvDescriptionSr);
            serverCard = itemView.findViewById(R.id.servers_card);
        }
    }
}
