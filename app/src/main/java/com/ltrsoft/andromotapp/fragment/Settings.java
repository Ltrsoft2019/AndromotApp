package com.ltrsoft.andromotapp.fragment;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;


import com.ltrsoft.andromotapp.R;

import java.util.Random;


public class Settings extends Fragment {

    private static final int NOTIFICATION_ID = 1;
    private Switch notification_switch;
    private ImageView back;

    public Settings() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.settings, container, false);
//        back=view.findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                NavigationDrawerFragment navigationDrawer = new NavigationDrawerFragment();
//                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main,navigationDrawer).commit();
            }
        });

//        notification_switch = view.findViewById(R.id.notification_switch);


        notification_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    // Enable notifications
                    showRandomNotification();
                } else {
                    // Disable notifications
                }
            }

            private void showRandomNotification() {
                String[] notificationMessages = {
                        "Hello there!",
                        "How are you today?",
                        "Don't forget to check the app!",
                        "A new update is available!",
                        "Have a great day!"
                };

                // Select a random message from the array
                String randomMessage = notificationMessages[new Random().nextInt(notificationMessages.length)];

                // Create a notification
                NotificationCompat.Builder builder = new NotificationCompat.Builder(requireContext(), "channel_id")
                        .setSmallIcon(R.drawable.andlogo)
                        .setContentTitle("Random Notification")
                        .setContentText(randomMessage)
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT);

                // Get the NotificationManager system service
                NotificationManager notificationManager = (NotificationManager) requireContext().getSystemService(Context.NOTIFICATION_SERVICE);

                // Check if the SDK version is Oreo or higher and create a notification channel
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    NotificationChannel channel = new NotificationChannel("channel_id", "Channel Name", NotificationManager.IMPORTANCE_DEFAULT);
                    notificationManager.createNotificationChannel(channel);
                }

                // Notify with the unique ID for the notification
                notificationManager.notify(NOTIFICATION_ID, builder.build());
            }
        });


        return view;
    }
}