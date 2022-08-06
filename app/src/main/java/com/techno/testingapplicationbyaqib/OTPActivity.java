package com.techno.testingapplicationbyaqib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OTPActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otpactivity);
    }

    public void getotp(View view) {

        startActivity(new Intent(getApplicationContext(),OTPverification.class));
        finish();
    }
}