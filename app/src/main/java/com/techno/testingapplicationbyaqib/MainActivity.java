package com.techno.testingapplicationbyaqib;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {



    EditText text, message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.ntitle);
        message = findViewById(R.id.nmessage);

    }
//        FirebaseMessaging.getInstance().getToken()
//                .addOnCompleteListener(new OnCompleteListener<String>() {
//                    @Override
//                    public void onComplete(@NonNull Task<String> task) {
//                        if (!task.isSuccessful()) {
//                            System.out.println("Fetching FCM registration token failed");
//                            return;
//                        }
//
//                        // Get new FCM registration token
//                        String token = task.getResult();
//
//                        // Log and toast
//                        System.out.println(token);
//
//                        Log.d("Resposne_1 " , token);
//
//                        Toast.makeText(MainActivity.this, token, Toast.LENGTH_SHORT).show();
//                    }
//                });
//    }

    public void send(View view) {

        String title = text.getText().toString();
        String mess = message.getText().toString();


        if (title.equals("") && mess.equals("")){
            Toast.makeText(this, "please fill the fields..!!", Toast.LENGTH_SHORT).show();
        }
        else {

            FCMSsend.PushNotification(MainActivity.this,
                    "cVGfUy6fQk-DF9Di--qiFA:APA91bF55Dvi9WS54Rd55-qq8s7T54VIM7zeLuOstMwgrKkmFzXd8Q1pcWSYeblSMlapGY5W5m3_Df2x3tcVmyM2UIuSDBSk6tRyZ1zcrAhNU57p8FevmXLuRBTdnA48HSIz8_xwWP_o",
                    title,
                    mess
                    );

            Toast.makeText(this, "notification send", Toast.LENGTH_SHORT).show();

            text.setText("");
            message.setText("");


        }

    }
}