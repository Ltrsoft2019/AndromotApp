package com.ltrsoft.andromotapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.ltrsoft.andromotapp.R;
import com.ltrsoft.andromotapp.apimodelclasses.User_Detail_api;
import com.ltrsoft.andromotapp.pojoclasses.User_Detail;
import com.ltrsoft.andromotapp.utils.RetrofitClient;
import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Profile extends Fragment {

    private ImageView userImage, backButton;
    private TextView fullName, email, mobile, address, city, district, state, country;
    private Button editProfileButton;

    private static final int STATIC_USER_ID = 7; // Use your static crop ID here


    public Profile() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.profile, container, false);

        userImage = view.findViewById(R.id.imageView);
        backButton = view.findViewById(R.id.btn_back_from_profile);
        fullName = view.findViewById(R.id.fullname);
        email = view.findViewById(R.id.email);
        mobile = view.findViewById(R.id.mobile);
        address = view.findViewById(R.id.address);
        city = view.findViewById(R.id.city);
        district = view.findViewById(R.id.district);
        state = view.findViewById(R.id.state);
        country = view.findViewById(R.id.country);
        editProfileButton = view.findViewById(R.id.btnEditProfile);


        //commented to check
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                NavigationDrawerFragment navigationDrawer = new NavigationDrawerFragment();
//                getActivity().getSupportFragmentManager()
//                        .beginTransaction().replace(R.id.main,navigationDrawer).commit();
            }
        });



        fetch_current_user();

        return view;
    }

    public void fetch_current_user() {

        User_Detail_api api = RetrofitClient.getRetrofitInstance().create(User_Detail_api.class);

        Call<List<User_Detail>> call = api.read_by_id_User_Detail(STATIC_USER_ID);

        call.enqueue(new Callback<List<User_Detail>>() {
            @Override
            public void onResponse(Call<List<User_Detail>> call, Response<List<User_Detail>> response) {
                if (response.isSuccessful() && response.body() != null) {

                    User_Detail userDetails = response.body().get(0);
                    updateUIWithUserDetails(userDetails);
                } else {
                    Toast.makeText(getContext(), "No user details found", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<User_Detail>> call, Throwable t) {

                Toast.makeText(getContext(), "Failed to fetch user details", Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void updateUIWithUserDetails(User_Detail userDetails) {

        fullName.setText(userDetails.getUser_fname()+" "+userDetails.getUser_mname()+" "+userDetails.getUser_lname());
       // email.setText(userDetails.getEmail_id());  //not added in db
        mobile.setText(userDetails.getUser_phone());
        address.setText(userDetails.getUser_address());
        city.setText(userDetails.getCity());
        district.setText(userDetails.getDistrict());
        state.setText(userDetails.getState());
        country.setText(userDetails.getCountry());

        String imageUrl = "https://andromot.ltr-soft.com/public/andromot/inputfiles/" + userDetails.getUser_image();
        Picasso.get()
                .load(imageUrl)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(userImage);

    }


}