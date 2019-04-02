package com.example.homework1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class SoundActivity extends AppCompatActivity {

    String temp = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound2);
        setSpinnerSelectedListener();
    }

    public void onClickCancel(View v) {
        finish();
    }

    public void onClickOkSound(View v) {
        Intent intent = new Intent (this, MainActivity.class);
        intent.putExtra("NUMBERSOUND",temp);
        setResult(RESULT_OK, intent);
        finish();

    }



    public void setSpinnerSelectedListener () {

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        if (spinner != null) {

            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

                @Override
                public void onItemSelected (AdapterView<?> adapterView, View view, int i, long l) {

                    switch (i) {
                        case 0:
                            temp = "0";
                            break;

                        case 1:
                            temp = "1";
                            break;

                        case 2:
                            temp = "2";
                            break;

                        case 3:
                            temp = "3";
                            break;

                        case 4:
                            temp = "4";
                            break;

                    }
                }
                    @Override
                    public void onNothingSelected (AdapterView <?> adapterView){
                    }

            });



        }

    }



}
