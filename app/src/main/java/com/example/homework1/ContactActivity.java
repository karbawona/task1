package com.example.homework1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

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
        startActivity(i);

    }
}
