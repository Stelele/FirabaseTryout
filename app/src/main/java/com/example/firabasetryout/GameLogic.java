package com.example.firabasetryout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class GameLogic extends AppCompatActivity {
    private Button btn_proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_game_logic);
        //setContentView(R.layout.dots1);
        setContentView(R.layout.traffic_lights);

        btn_proceed = findViewById(R.id.btn_proceed);
    }


}
