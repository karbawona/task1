package com.example.homework1;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import java.util.Random;


public class ContactActivity extends AppCompatActivity {

    private final int REQUEST_CODE = 1;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact2);

    }

    public void onClickCancel (View v) {
        Intent i = new Intent (this, MainActivity.class);
        startActivity(i);

    }

    public void onClickOk (View v) {
        Intent intent = new Intent (this, MainActivity.class);
        intent.putExtra("FULLNAME",name);
        intent.putExtra("NUMBERAVATAR", randomNameOfAvatar());
        startActivity(intent);

    }


    public void onRadioButtonClick(View view)
    {

        boolean checked =((RadioButton)view).isChecked();

        switch(view.getId())
        {
            case R.id.radioButton:
                name = "Jan Kowalski";
                break;

            case R.id.radioButton2:
                name = "Anna Nowak";
                break;

            case R.id.radioButton3:
                name = "Johny Depp";
                break;

            case R.id.radioButton4:
                name = "Robert Pattinson";
                break;

            case R.id.radioButton5:
                name = "Rafał Brzozowski";
                break;

            default:


        }

    }


private String randomNameOfAvatar(){

        String[] temp = new String[3];

        temp[0] = "pobrane1";
        temp[1] = "pobrane2";
        temp[2] = "pobrane3";

        Random rand = new Random();
        int number = rand.nextInt(3);

        return temp[number];
    }

}
