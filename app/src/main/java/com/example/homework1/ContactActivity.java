package com.example.homework1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;



public class ContactActivity extends AppCompatActivity {



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
        Intent i = new Intent (this, MainActivity.class);
        String name = "aaa";
        i.putExtra(name, "aaa");
        startActivity(i);

    }


    public String getNames(int i) {
        String[] names = new String[5];
        names[0] = "Jan Kowalski";
        names[1] = "Anna Nowak";
        names[2] = "Johny Depp";
        names[3] = "Robert Pattinson";
        names[4] = "Rafał Brzozowski";

        return names[i];
    }



    public void onRadioButtonClick(View view)
    {

        boolean checked =((RadioButton)view).isChecked();

        switch(view.getId())
        {
            case R.id.radioButton:

                break;

            case R.id.radioButton2:
                break;

            case R.id.radioButton3:

                break;
            case R.id.radioButton4:
                break;

            case R.id.radioButton5:
                break;

            default:


        }

    }




}
