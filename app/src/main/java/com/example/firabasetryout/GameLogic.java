package com.example.firabasetryout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dots1);

        /**
         * Initialize Buttons
         * */
        btn_proceed1 = findViewById(R.id.btn_proceed);
        btn_proceed2 = findViewById(R.id.btnScene2Send);
        btn_proceed3 = findViewById(R.id.btn_proceed4);

        /**
         * Initialize Spinners
         * */
        spn_spinner1 = findViewById(R.id.spinner);
        spn_spinner2_1 = findViewById(R.id.spnrPart1Ans);
        spn_spinner2_2 = findViewById(R.id.spinrPart2Ans);
        spn_spinner3  = findViewById(R.id.spinner2);

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
                    }
                    break;
                case R.id.btnScene2Send:
                    // Proceed on the second button clicked
                    String text_ans_1 = spn_spinner2_1.getSelectedItem().toString();
                    String text_ans_2 = spn_spinner2_2.getSelectedItem().toString();

                    if (!(text_ans_1.equals("Select Answer")) && !(text_ans_2.equals("Select Answer"))){
                        //Call personality test
                    }
                    break;
                case R.id.btn_proceed4:
                    // Proceed on the final scenario clicked, ready to match
                    String text_3 = spn_spinner3.getSelectedItem().toString();
                    if (!(text_3.equals("Select Answer"))){
                        //Call personality test
                        //Call Match
                    }
                default:
                    break;
            }
        }
    }
}
