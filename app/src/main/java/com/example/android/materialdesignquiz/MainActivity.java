package com.example.android.materialdesignquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.R.attr.checked;
import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /*
   *This method is used to check the answers, show the correct ones and display a toast message with the score.
    */
    public void submit(View view) {
        //Checks whether the correct radio button is clicked in Question 1
        RadioButton radioButtonOne = (RadioButton) findViewById(R.id.metaphor_radio_button);
        boolean checkedOne = radioButtonOne.isChecked();
        if (checkedOne)
            score += 1;
        //Changes color of the text of the correct radio button to green
        radioButtonOne.setTextColor(0xAA00bcd4);

        //Checks that the entered answer in question 2 is correct
        EditText hexColor = (EditText) findViewById(R.id.hex_color_anwser);
        if (hexColor.getText().toString().equals(getString(R.string.A200))) {
            score += 1;
            //Changes the color of the answer to green if correct
            hexColor.setTextColor(0xAA00bcd4);
        } else {
            //Displays the correct answer compared to the incorrect one in red color
            hexColor.setText((getString(R.string.A200)) + ", not " + hexColor.getText());
            hexColor.setTextColor(rgb(255, 0, 0));
        }


        //Checks that the entered answer in question 3 is correct
        EditText mostUsedColor = (EditText) findViewById(R.id.most_used_color_anwser);
        if (mostUsedColor.getText().toString().equals(getString(R.string.primary))) {
            score += 1;
            //Changes the color of the answer to green if correct
            mostUsedColor.setTextColor(0xAA00bcd4);
        } else {
            //Displays the correct answer compared to the incorrect one in red color
            mostUsedColor.setText((getString(R.string.primary)) + ", not " + mostUsedColor.getText());
            mostUsedColor.setTextColor(rgb(255, 0, 0));
        }


        //Checks whether the correct checkboxes are marked in Question 4
        CheckBox checkBoxAccentColor1 = (CheckBox) findViewById(R.id.accent_color_1);
        boolean checkedAccentColor1 = checkBoxAccentColor1.isChecked();
        CheckBox checkBoxAccentColor3 = (CheckBox) findViewById(R.id.accent_color_3);
        boolean checkedAccentColor3 = checkBoxAccentColor3.isChecked();
        if (checkedAccentColor1 && checkedAccentColor3)
            score += 1;
        //Changes the color of the text of the correct checkboxes to green
        checkBoxAccentColor1.setTextColor(0xAA00bcd4);
        checkBoxAccentColor3.setTextColor(0xAA00bcd4);


        //Checks whether the correct radio button is clicked in Question 5
        RadioButton radioButtonFive = (RadioButton) findViewById(R.id.twentysp_radio_button);
        boolean checkedFive = radioButtonFive.isChecked();
        if (checkedFive)
            score += 1;
        //Changes color of the text of the correct radio button to green
        radioButtonFive.setTextColor(0xAA00bcd4);


        //Checks that the entered answer in question 6 is correct
        EditText mostCommonTypeface = (EditText) findViewById(R.id.typeface_answer);
        if (mostCommonTypeface.getText().toString().equals(getString(R.string.typeface))) {
            score += 1;
            //Changes the color of the answer to green if correct
            mostCommonTypeface.setTextColor(0xAA00bcd4);
        } else {
            //Displays the correct answer compared to the incorrect one in red color
            mostCommonTypeface.setText((getString(R.string.typeface)) + ", not " + mostCommonTypeface.getText());
            mostCommonTypeface.setTextColor(rgb(255, 0, 0));
        }


        //Checks whether the correct radio button is clicked in Question 7
        RadioButton radioButtonSeven = (RadioButton) findViewById(R.id.density_independent_pixels_button);
        boolean checkedSeven = radioButtonSeven.isChecked();
        if (checkedSeven)
            score += 1;
        //Changes color of the text of the correct radio button to green
        radioButtonSeven.setTextColor(0xAA00bcd4);


        //Checks whether the correct radio button is clicked in Question 7
        RadioButton radioButtonEight = (RadioButton) findViewById(R.id.sixteen_radio_button);
        boolean checkedEight = radioButtonEight.isChecked();
        if (checkedEight)
            score += 1;
        //Changes color of the text of the correct radio button to green
        radioButtonEight.setTextColor(0xAA00bcd4);


        //Prevents the Submit method from being pressed more than once
        Button myButton = (Button) findViewById(R.id.submit_button);
        myButton.setClickable(false);

        //Displays toast message with the score
        Toast.makeText(this, getString(R.string.score_is) + " " + score + " " + getString(R.string.from_8), Toast.LENGTH_LONG).show();
    }

    }
