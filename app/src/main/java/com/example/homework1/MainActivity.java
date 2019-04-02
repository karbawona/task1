/***
 Aleksandra Klein
 wariant A,2,1
 ***/


package com.example.homework1;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.Image;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    public static final String FULLNAME = "FULLNAME";
    public String fullname = "Rafał Brzozowski";
    public String soundFromIntent;
    private MediaPlayer buttonPlayer;
    static public Uri[] sounds;
    public final int REQSound = 0;
    public final int REQ = 1;
 //   private int crnSnd = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FloatingActionButton btn = findViewById(R.id.floatingActionButton);


        sounds = new Uri[6];

        sounds[0] = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.mario);
        sounds[1] = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ring01);
        sounds[2] = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ring02);
        sounds[3] = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ring03);
        sounds[4] = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ring04);
        sounds[5] = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ringd);
        buttonPlayer = new MediaPlayer();
        buttonPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);

        buttonPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
            }
        });

        btn.setOnClickListener(v -> {
            buttonPlayer.reset();

            try {

                buttonPlayer.setDataSource(getApplicationContext(), sounds[Integer.parseInt(soundFromIntent)]);
            } catch (IOException e) {
                e.printStackTrace();
            }
            buttonPlayer.prepareAsync();
        });



    }


    public void onClickChangeContact(View view) {

        Intent intent = new Intent(getApplicationContext(), ContactActivity.class);
        intent.putExtra(FULLNAME, fullname);
        startActivityForResult(intent, REQ);
    }


    public void onClickChangeSound(View view) {

        Intent intent = new Intent(getApplicationContext(), SoundActivity.class);
        startActivityForResult(intent, REQSound);
    }


    @Override
    protected void onPause() {
        super.onPause();
        buttonPlayer.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onStop() {
        super.onStop();

    }

    @Override
    protected void onActivityResult (int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            if(requestCode == REQ) {
                fullname = data.getStringExtra(FULLNAME);
                TextView textView = findViewById(R.id.textView);
                textView.setText(fullname);

                ImageView imgView = findViewById(R.id.imageButton3);



                Random rand = new Random();
                int number = rand.nextInt(3);

                Drawable drawab;

                switch (number) {
                    case 0:
                        drawab = ResourcesCompat.getDrawable(getResources(), R.drawable.pobrane, null);
                        imgView.setImageDrawable(drawab);
                        break;

                    case 1:
                        drawab = ResourcesCompat.getDrawable(getResources(), R.drawable.pobrane2, null);
                        imgView.setImageDrawable(drawab);
                        break;

                    case 2:
                        drawab = ResourcesCompat.getDrawable(getResources(), R.drawable.pobrane3, null);
                        imgView.setImageDrawable(drawab);
                        break;
                }


            }
            if(requestCode == REQSound) {
                soundFromIntent = data.getStringExtra("NUMBERSOUND");
            }
        }
        else if(resultCode == RESULT_CANCELED){
            Toast.makeText(getApplicationContext(),getText(R.string.back_message),Toast.LENGTH_SHORT).show();
        }
    }


}
