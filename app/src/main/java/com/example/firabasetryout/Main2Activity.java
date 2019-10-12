package com.example.firabasetryout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.firabasetryout.ui.login.LoginActivity;

public class Main2Activity extends AppCompatActivity {
    Button btn_no;
    Button btn_yes;
    ImageView img_biz;
    ImageView img_quillo;
    ImageView img_venue;
    ImageView img_vibes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn_no = findViewById(R.id.btn_notMatch);
        btn_yes = findViewById(R.id.btn_Match);
        img_biz = findViewById(R.id.img_biz);
        img_quillo = findViewById(R.id.img_quillo);
        img_venue = findViewById(R.id.img_venue);
        img_vibes = findViewById(R.id.img_vibes);

        btn_yes.setOnClickListener(new ButtonClickListener());
        btn_no.setOnClickListener(new ButtonClickListener());
        img_biz.setOnClickListener(new ImageClickListener());
        img_quillo.setOnClickListener(new ImageClickListener());
        img_vibes.setOnClickListener(new ImageClickListener());
        img_venue.setOnClickListener(new ImageClickListener());
    }


    /**Listener for both buttons
     * Connects to the game when the yes button is clicked*/
    private class ButtonClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            if (v.getId()==btn_no.getId()){
                //Do something again
                Intent sendIntent = new Intent (v.getContext(), GameLogic.class);
                startActivity(sendIntent);
            }
            else{
                //Do Something
                Intent sendIntent = new Intent (v.getContext(), GameLogic.class);
                startActivity(sendIntent);
            }
        }
    }

    /**Response to a click in the images
     *Connects the image to the relevant links */
    private class ImageClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v){
            int vId = v.getId();
            try {
                Intent urlIntent;
                if (vId==img_biz.getId()){
                    urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vula.uct.ac.za/portal"));
                    startActivity(urlIntent);
                }
                else if(vId == img_quillo.getId()){
                    urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.books.quillo.io/"));
                    startActivity(urlIntent);
                }
                else if(vId == img_venue.getId()){
                    urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ictsapps.uct.ac.za/classroom/"));
                    startActivity(urlIntent);
                }
                else if(vId == img_vibes.getId()){
                    urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://varsityvibe.co.za/"));
                    startActivity(urlIntent);
                }
            } catch (ActivityNotFoundException e) {
                Toast.makeText(v.getContext(), "No application can handle this request."
                        + " Please install a webbrowser",  Toast.LENGTH_LONG).show();
                e.printStackTrace();
            }

        }
    }
}
