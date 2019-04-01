package com.example.homework1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;



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




}
