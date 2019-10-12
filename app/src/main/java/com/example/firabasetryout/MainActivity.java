package com.example.firabasetryout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.firabasetryout.ui.login.LoginActivity;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Hello, World!");
        myRef.child("gnoewngeie").child("mary").setValue("Hello World");

        Button btnLogin = findViewById(R.id.btnLogIn);

        ButtonClickListner buttonListen = new ButtonClickListner();
        btnLogin.setOnClickListener(buttonListen);

    }

    public class ButtonClickListner implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent sendIntent = new Intent (v.getContext(), LoginActivity.class);
            startActivity(sendIntent);
        }
    }
}
