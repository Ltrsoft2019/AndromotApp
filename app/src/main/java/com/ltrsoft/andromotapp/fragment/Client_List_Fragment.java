package com.ltrsoft.andromotapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.ltrsoft.andromotapp.R;
import com.ltrsoft.andromotapp.adapter.AddClientAdapter;
import com.ltrsoft.andromotapp.apimodelclasses.Client_List_api;
import com.ltrsoft.andromotapp.pojoclasses.Client_List;
import com.ltrsoft.andromotapp.utils.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Client_List_Fragment extends Fragment implements View.OnClickListener{

    private ImageView addClientBackImage, clientRefreshImag;
    private RecyclerView addClientRecylerView;
    private FloatingActionButton btnAddClient;
    private List<Client_List> addClientList;

    public Client_List_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.client_list_fragment, container, false);

        addClientBackImage = view.findViewById(R.id.addClientBackImg);
        clientRefreshImag = view.findViewById(R.id.clientRefreshImag);
        btnAddClient = view.findViewById(R.id.btnAddClient);
        addClientRecylerView = view.findViewById(R.id.addClientRecylerView);

        addClientRecylerView.setLayoutManager(new LinearLayoutManager(getContext()));

        fetchClientDetails();
        return view;
    }

    private void fetchClientDetails() {

       Client_List_api api = RetrofitClient.getRetrofitInstance().create(Client_List_api.class);
       Call<List<Client_List>> call = api.readall_Client_List();

       call.enqueue(new Callback<List<Client_List>>() {
           @Override
           public void onResponse(Call<List<Client_List>> call, Response<List<Client_List>> response) {
               if(response.isSuccessful() ){
                   addClientList = response.body();
                   addClientRecylerView.setAdapter(new AddClientAdapter(getActivity() , addClientList));
                   Toast.makeText(getActivity(), "Successfull inserted", Toast.LENGTH_SHORT).show();
               }else {
                   Toast.makeText(getActivity(), "Not inserted", Toast.LENGTH_SHORT).show();
               }
           }

           @Override
           public void onFailure(Call<List<Client_List>> call, Throwable t) {

               Toast.makeText(getActivity(), "Failed", Toast.LENGTH_SHORT).show();
           }
       });

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if(id == R.id.addClientBackImg){

        }
        if(id == R.id.clientRefreshImag){

        }
        if(id == R.id.btnAddClient){

        }
    }
}