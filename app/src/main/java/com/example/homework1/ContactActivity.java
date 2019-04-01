package com.example.homework1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;


public class ContactActivity extends AppCompatActivity {


String[] names = new String[5];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact2);

    }

    public String getNames(int i){
        String[] names = new String[5];
        names[0] = "Jan Kowalski";
        names[1] = "Anna Nowak";
        names[2] = "Johny Depp";
        names[3] = "Robert Pattinson";
        names[4] = "Rafał Brzozowski";

        return names[i];
    }

    public void onClickCancel (View v) {
        Intent i = new Intent (this, MainActivity.class);
        startActivity(i);

    }

    public void onClickOk (View v) {
        Intent i = new Intent (this, MainActivity.class);
        startActivity(i);

    }

    public void onRadioButtonClick(View view)
    {
        //rzutujemy widok kontrolki, której stan został zmieniony na RadioButton, sprawdzamy czy jest wybrana i zapisujemy jej stan do zmiennej zaznaczona
        boolean zaznaczony =((RadioButton)view).isChecked();

        //sprawdzamy zmiana której kontrolki wywołała funkcję, poprzez sprawdzenie id widoku tej kontrolki
        switch(view.getId())
        {
            case R.id.radioButton: //gdy chodzi o pierwszy RadioButton
                //wyswietlamy, którką informację Toast kontrolce, której stan został zmieniony
                Toast.makeText(ContactActivity.this, "Stan RadioButton'a 1 został zmieniony na" + String.valueOf(zaznaczony),
                        Toast.LENGTH_SHORT).show();
                break;

        }

    }




}
