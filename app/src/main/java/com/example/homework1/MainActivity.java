/***
  Aleksandra Klein
  wariant A,2,1
***/


package com.example.homework1;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView);
        ImageView imgView = findViewById(R.id.imageButton3);

        String fullname = getIntent().getStringExtra("FULLNAME");
        textView.setText(fullname);

        Random rand = new Random();
        int number = 0;
        number = rand.nextInt(3);


        Drawable drawab ;


            switch (number) {
                case 0:
                    drawab = ResourcesCompat.getDrawable(getResources(), R.drawable.pobrane, null);
                    imgView.setImageDrawable(drawab);
                    break;
                case 1 :
                    drawab = ResourcesCompat.getDrawable(getResources(), R.drawable.pobrane2, null);
                    imgView.setImageDrawable(drawab);
                    break;
                case 2:

                    drawab = ResourcesCompat.getDrawable(getResources(), R.drawable.pobrane3, null);
                    imgView.setImageDrawable(drawab);
                    break;

            }



    }



    public void onClickChangeContact (View view) {

        Intent intent = new Intent (this, ContactActivity.class);
        startActivity(intent);


    }


public void onClickChangeSound  (View view) {

    Intent i = new Intent (this, SoundActivity.class);
    startActivity(i);
    }








}
