package com.example.meditationclub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Schedule extends AppCompatActivity {




    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        ListView listView =  findViewById(R.id.listview);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("UPCOMING EVENT- Annual Yoga Festival 2021 ");
        arrayList.add("UPCOMING EVENT- Annual Yoga Essay Writing Competition 2021 ");
        arrayList.add("UPCOMING OLYMPIADS- Annual Yoga Olympaid 2021, Int'l Yoga Olympaid 2021 ");
        arrayList.add("UPCOMING EVENT- Youth Meditation Comptetion 2021 ");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);


    }
}