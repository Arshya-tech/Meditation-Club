package com.example.meditationclub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    public CardView cardhome , cardMembers , cardAchievements, cardSchedule , cardLogin, cardSignUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardhome = (CardView)  findViewById(R.id.cardhome);
        cardMembers = (CardView) findViewById(R.id.cardMembers);
        cardAchievements = (CardView) findViewById(R.id.cardAchievements);
        cardSchedule = (CardView) findViewById(R.id.cardSchedule);
        cardLogin = (CardView) findViewById(R.id.cardLogin);
        cardSignUp= (CardView) findViewById(R.id.cardSignUp);

        cardhome.setOnClickListener(this);
        cardMembers.setOnClickListener(this);
        cardAchievements.setOnClickListener(this);
        cardSchedule.setOnClickListener(this);
        cardLogin.setOnClickListener(this);
        cardSignUp.setOnClickListener(this);}

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {

            case R.id.cardhome:
                i = new Intent(this,home.class);
                startActivity(i);
                break;

            case R.id.cardMembers:
                i = new Intent(this, Members.class);
                startActivity(i);
                break;

            case R.id.cardAchievements:
                i = new Intent(this, Achievements.class);
                startActivity(i);
                break;

            case R.id.cardSchedule:
                i = new Intent(this, Schedule.class);
                startActivity(i);
                break;

            case R.id.cardLogin:
                i = new Intent(this, Login.class);
                startActivity(i);
                break;

            case R.id.cardSignUp:
                i = new Intent(this, SignUp.class);
                startActivity(i);
                break;
        }
    }

        }