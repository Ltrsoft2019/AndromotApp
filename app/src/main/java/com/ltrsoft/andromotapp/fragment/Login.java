package com.ltrsoft.andromotapp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.ltrsoft.andromotapp.R;

import java.util.concurrent.TimeUnit;

public class Login extends Fragment {

    private EditText inputmobile;
    private Button buttonget;
    private ProgressBar progressBar;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.login, container, false);

        inputmobile = view.findViewById(R.id.inputmobile);
        buttonget = view.findViewById(R.id.buttonget);
        progressBar = view.findViewById(R.id.probar);

        buttonget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main,new OTP()).addToBackStack(null).commit();

                if (inputmobile.getText().toString().trim().isEmpty()) {
                    Toast.makeText(getActivity(), "Enter Mobile Number", Toast.LENGTH_SHORT).show();
                    return;
                }
                progressBar.setVisibility(View.VISIBLE);
                buttonget.setVisibility(View.INVISIBLE);

                PhoneAuthProvider.getInstance().verifyPhoneNumber("+91" + inputmobile.getText().toString(),
                        60, TimeUnit.SECONDS, getActivity(), new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                            @Override
                            public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
                                progressBar.setVisibility(View.GONE);
                                buttonget.setVisibility(View.VISIBLE);
                            }

                            @Override
                            public void onVerificationFailed(@NonNull FirebaseException e) {
                                progressBar.setVisibility(View.GONE);
                                buttonget.setVisibility(View.VISIBLE);
                                Toast.makeText(getActivity(), e.getMessage(), Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onCodeSent(@NonNull String s, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                                progressBar.setVisibility(View.GONE);
                                buttonget.setVisibility(View.VISIBLE);
//                                Intent intent = new Intent(getActivity(), VerifyOtp.class);
//                                intent.putExtra("mobile", inputmobile.getText().toString());
//                                intent.putExtra("verificationId", s);
//                                startActivity(intent);

                                OTP verifyOtpFragment = new OTP();

                                // Create a bundle and set arguments


                                Bundle bundle = new Bundle();
                                bundle.putString("mobile", inputmobile.getText().toString());
                                bundle.putString("verificationId", s);
                                verifyOtpFragment.setArguments(bundle);

                                // Replace the current fragment with VerifyOtpFragment
                                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                                transaction.replace(R.id.main, verifyOtpFragment);
                                transaction.addToBackStack(null);
                                transaction.commit();
                            }
                        });
            }
        });

        return view;
    }
}