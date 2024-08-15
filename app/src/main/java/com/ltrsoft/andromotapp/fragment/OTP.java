package com.ltrsoft.andromotapp.fragment;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.ltrsoft.andromotapp.R;


import java.util.concurrent.TimeUnit;

public class OTP extends Fragment {

    private EditText inputcode1, inputcode2, inputcode3, inputcode4, inputcode5, inputcode6;
    private ProgressBar progressBar;
    private Button btnverify;
    private String verificationId, mobileNumber;
    private TextView textmobile2, resendotp;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.otp, container, false);

        textmobile2 = view.findViewById(R.id.textmobile);
        inputcode1 = view.findViewById(R.id.inputcode1);
        inputcode2 = view.findViewById(R.id.inputcode2);
        inputcode3 = view.findViewById(R.id.inputcode3);
        inputcode4 = view.findViewById(R.id.inputcode4);
        inputcode5 = view.findViewById(R.id.inputcode5);
        inputcode6 = view.findViewById(R.id.inputcode6);
        progressBar = view.findViewById(R.id.probar);
        btnverify = view.findViewById(R.id.buttonvarify);
        resendotp = view.findViewById(R.id.resend_otp);

        // Retrieve the arguments
        Bundle bundle = getArguments();
        if (bundle != null) {
            mobileNumber = bundle.getString("mobile");
            verificationId = bundle.getString("verificationId");
            textmobile2.setText(String.format("+91%s", mobileNumber));
        }

        sendotpInput();

        btnverify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main,new NavigationDrawer()).addToBackStack(null).commit();

                if (inputcode1.getText().toString().trim().isEmpty()
                        || inputcode2.getText().toString().trim().isEmpty()
                        || inputcode3.getText().toString().trim().isEmpty()
                        || inputcode4.getText().toString().trim().isEmpty()
                        || inputcode5.getText().toString().trim().isEmpty()
                        || inputcode6.getText().toString().trim().isEmpty()) {
                    Toast.makeText(getActivity(), "Please enter valid code", Toast.LENGTH_SHORT).show();
                    return;
                }

                String code = inputcode1.getText().toString() + inputcode2.getText().toString() +
                        inputcode3.getText().toString() + inputcode4.getText().toString() +
                        inputcode5.getText().toString() + inputcode6.getText().toString();

                if (verificationId != null) {
                    progressBar.setVisibility(View.VISIBLE);
                    btnverify.setVisibility(View.INVISIBLE);

                    PhoneAuthCredential phoneAuthCredential = PhoneAuthProvider.getCredential(verificationId, code);
                    FirebaseAuth.getInstance().signInWithCredential(phoneAuthCredential).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            progressBar.setVisibility(View.GONE);
                            btnverify.setVisibility(View.VISIBLE);

                            if (task.isSuccessful()) {
                                // Replace with your main activity navigation
                                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                                transaction.replace(R.id.main, new NavigationDrawer());
                                transaction.addToBackStack(null);
                                transaction.commit();
                            } else {
                                Toast.makeText(getActivity(), "Verification code is invalid!", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

                    resendotp.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            PhoneAuthProvider.getInstance().verifyPhoneNumber("+91" + mobileNumber,
                                    60, TimeUnit.SECONDS, getActivity(), new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                                        @Override
                                        public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
                                            Toast.makeText(getActivity(), "Success", Toast.LENGTH_SHORT).show();
                                        }

                                        @Override
                                        public void onVerificationFailed(@NonNull FirebaseException e) {
                                            Toast.makeText(getActivity(), e.getMessage(), Toast.LENGTH_SHORT).show();
                                        }
                                    });
                        }
                    });
                }
            }
        });

        return view;
    }

    private void sendotpInput() {
        EditText[] editText = {inputcode1, inputcode2, inputcode3, inputcode4, inputcode5, inputcode6};

        for (int i = 0; i < editText.length; i++) {
            int index = i;
            editText[i].addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    if (!s.toString().isEmpty()) {
                        if (index < editText.length - 1) {
                            editText[index + 1].requestFocus();
                        }
                    }
                }

                @Override
                public void afterTextChanged(Editable s) {
                }
            });
        }
    }
}
