package com.example.homework1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static com.example.homework1.MainActivity.FULLNAME;


public class ContactActivity extends AppCompatActivity {

    String name = "Rafał Brzozowski";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact2);

    }

    public void onClickCancel (View v) {
        finish();

    }

    public void onClickOk (View v) {
        Intent intent = new Intent ();
        intent.putExtra(FULLNAME,name);
        setResult(RESULT_OK, intent);
        finish();

    }


    public void onRadioButtonClick(View view)
    {

      //  boolean checked =((RadioButton)view).isChecked();

        int id = view.getId();
        switch(id)
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
