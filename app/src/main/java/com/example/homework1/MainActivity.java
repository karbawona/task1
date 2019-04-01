/***
  Aleksandra Klein
  wariant A,2,1
***/


package com.example.homework1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // String zmienna1 = getIntent().getStringExtra("aaa");
        TextView txt = (TextView)findViewById(R.id.textView);


    }



    public void onClickChangeContact (View view) {

        Intent i = new Intent (this, ContactActivity.class);
        startActivity(i);

    }


public void onClickChangeSound  (View view) {

    Intent i = new Intent (this, SoundActivity.class);
    startActivity(i);
    }






}
