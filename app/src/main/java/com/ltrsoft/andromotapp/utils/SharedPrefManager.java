package com.ltrsoft.andromotapp.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.ltrsoft.andromotapp.pojoclasses.User_Detail;

public class SharedPrefManager {

    private static String SHARE_PREF_NAME = "ltr-soft";
    private SharedPreferences sharedPreferences;
    private Context context;
    private SharedPreferences.Editor editor;

    public SharedPrefManager(Context context){
        this.context = context;
    }


    public void saveUser(User_Detail userDetail){
        sharedPreferences = context.getSharedPreferences(SHARE_PREF_NAME , context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putInt("id" , userDetail.getUser_id());
        editor.putString("userFName" , userDetail.getUser_fname());
        editor.putString("userLName" , userDetail.getUser_lname());
        editor.putString("userEmail" , userDetail.getEmail_id());
        editor.putString("userPhone" , userDetail.getUser_phone());
        editor.putBoolean("loggedStatus" , true);
        editor.apply();
    }

    public boolean isLoggedIn(){
        sharedPreferences = context.getSharedPreferences(SHARE_PREF_NAME , context.MODE_PRIVATE);
        return sharedPreferences.getBoolean("loggedStatus" , false);
    }

    public User_Detail getUser(){
        sharedPreferences = context.getSharedPreferences(SHARE_PREF_NAME , context.MODE_PRIVATE);
        return new User_Detail(sharedPreferences.getInt("id" , -1),
                sharedPreferences.getString("userFName" , null),
                sharedPreferences.getString("userLName" , null),
                sharedPreferences.getString("userEmail" , null),
                sharedPreferences.getString("userPhone" , null));
    }

    public void logoutUser(){
        sharedPreferences = context.getSharedPreferences(SHARE_PREF_NAME , context.MODE_PRIVATE);
        editor =  sharedPreferences.edit();
        editor.clear();
        editor.apply();
    }



}
