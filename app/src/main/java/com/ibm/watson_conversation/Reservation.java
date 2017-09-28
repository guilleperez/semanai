package com.ibm.watson_conversation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reservation extends AppCompatActivity {

    private Button res, Nres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation);
        getSupportActionBar().hide();

        res = (Button) findViewById(R.id.button4);
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inti = new Intent(getBaseContext(), ResNumber.class);
                startActivity(inti);
            }
        });

        Nres = (Button) findViewById(R.id.button5);
        Nres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inti = new Intent(getBaseContext(), Registrar.class);
                startActivity(inti);
            }
        });
    }
}