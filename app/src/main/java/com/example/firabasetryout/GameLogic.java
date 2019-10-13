package com.example.firabasetryout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class GameLogic extends AppCompatActivity {

    /**
     * Buttons
     * */
    Button btn_proceed1;
    Button btn_proceed2;
    Button btn_proceed3;
    /**
     * Spinner
     * */
    Spinner spn_spinner1;
    Spinner spn_spinner2_1;
    Spinner spn_spinner2_2;
    Spinner spn_spinner3;
    /**
     * Personality test
     * */
    PersonalityTest test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dots1);

        /**
         * Initialize Buttons
         * */
        btn_proceed1 = findViewById(R.id.btn_proceed);

        /**
         * Add OnClick Listeners to buttons
         * */
        btn_proceed1.setOnClickListener(new ButtonClickListener());


        /**
         * Initialize Spinners
         * */
        spn_spinner1 = findViewById(R.id.spinner);


        /**
         *Initialize Personality Test
         */
        test = new PersonalityTest();
    }

    /**
     * get Matches;
     * */
    public void getMatches(){
        //Get matches after the final proceed button hav been clicked
    }

    /**
     * Buttons OnClickListener
     * */
    private class ButtonClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v){
            switch (v.getId()){
                case R.id.btn_proceed:
                    // Proceed on the first scenario clicked
                    String text_1 = spn_spinner1.getSelectedItem().toString();
                    if (!(text_1.equals("Select Answer"))){
                        //Call personality test
                        test.update(text_1);
                        setContentView(R.layout.scenario2_1);
                        btn_proceed2 = findViewById(R.id.btnScene2Send);
                        btn_proceed2.setOnClickListener(new ButtonClickListener());
                        spn_spinner2_1 = findViewById(R.id.spnrPart1Ans);
                        spn_spinner2_2 = findViewById(R.id.spinrPart2Ans);
                    }
                    break;
                case R.id.btnScene2Send:
                    // Proceed on the second button clicked
                    String text_ans_1 = spn_spinner2_1.getSelectedItem().toString();
                    String text_ans_2 = spn_spinner2_2.getSelectedItem().toString();

                    if (!(text_ans_1.equals("Select Answer")) && !(text_ans_2.equals("Select Answer"))){
                        //Call personality test
                        test.update(text_ans_1);
                        test.update(text_ans_2);
                        setContentView(R.layout.traffic_lights);
                        btn_proceed3 = findViewById(R.id.btn_proceed4);
                        btn_proceed3.setOnClickListener(new ButtonClickListener());
                        spn_spinner3  = findViewById(R.id.spinner2);
                    }
                    break;
                case R.id.btn_proceed4:
                    // Proceed on the final scenario clicked, ready to match
                    String text_3 = spn_spinner3.getSelectedItem().toString();
                    if (!(text_3.equals("Select Answer"))){
                        //Call personality test
                        test.update(text_3);
                        //Toast to the display the results
                        Toast.makeText(v.getContext(), test.getMax(), Toast.LENGTH_LONG).show();
                        //Call Match
                    }
                default:
                    break;
            }
        }
    }
}
