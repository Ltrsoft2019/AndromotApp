package com.ltrsoft.andromotapp.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.ltrsoft.andromotapp.R;
import com.ltrsoft.andromotapp.apimodelclasses.User_Detail_api;
import com.ltrsoft.andromotapp.pojoclasses.User_Detail;
import com.ltrsoft.andromotapp.utils.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterPage extends Fragment {

    private ImageView back,newUserprofileImage;
    private EditText userFirstName,userMiddleName,userLastName,userEmail,userPhone,userAddress,userCountry,userState,userDistrict,userCity;
    private Button btnRegister;
    private String user_fname,user_mname,user_lname,Email,user_phone,user_address,country,state,district,city;


    public RegisterPage() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.register_page, container, false);

        userFirstName = view.findViewById(R.id.firstNameReg);
        userMiddleName = view.findViewById(R.id.middleNameReg);
        userLastName = view.findViewById(R.id.lastNameReg);
        userEmail = view.findViewById(R.id.emailReg);
        userPhone = view.findViewById(R.id.phoneReg);
        userAddress = view.findViewById(R.id.addressReg);
        userCity = view.findViewById(R.id.cityReg);
        userCountry = view.findViewById(R.id.countryReg);
        userState = view.findViewById(R.id.stateReg);
        userDistrict = view.findViewById(R.id.districtReg);
        back = view.findViewById(R.id.btn_back_from_Register_page);
        newUserprofileImage = view.findViewById(R.id.newUserImage);
        btnRegister = view.findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                user_fname = userFirstName.getText().toString();
                user_mname = userMiddleName.getText().toString();
                user_lname = userLastName.getText().toString();
                Email = userEmail.getText().toString();
                user_phone = userPhone.getText().toString();
                user_address = userAddress.getText().toString();
                city = userCity.getText().toString();
                country = userCountry.getText().toString();
                state = userState.getText().toString();
                district = userDistrict.getText().toString();

                getUserRegister(user_fname,user_mname,user_lname,user_address,user_phone,country,city,state,district);

            }
        });


        return view;
    }

    private void getUserRegister(String user_fname, String user_mname, String user_lname, String user_phone, String user_address,
                                 String country, String city, String state, String district) {


        User_Detail_api api = RetrofitClient.getRetrofitInstance().create(User_Detail_api.class);

        Call<User_Detail> call = api.create_User_Detail(user_fname,user_mname,user_lname,user_address,user_phone,state,city,country,district);

        call.enqueue(new Callback<User_Detail>() {
            @Override
            public void onResponse(Call<User_Detail> call, Response<User_Detail> response) {

                if (response.isSuccessful() && response.body() != null) {

                    Toast.makeText(getContext(), "data inserted", Toast.LENGTH_SHORT).show();
                }
                Toast.makeText(getContext(), "Connection success", Toast.LENGTH_SHORT).show();
                //Log.d("TAG","Error---=="+response.body().toString());

            }

            @Override
            public void onFailure(Call<User_Detail> call, Throwable t) {

                Toast.makeText(getContext(), "Failed", Toast.LENGTH_SHORT).show();
                //Log.d("TAG","Error Message==="+t.getMessage().toString());

            }
        });

    }
}