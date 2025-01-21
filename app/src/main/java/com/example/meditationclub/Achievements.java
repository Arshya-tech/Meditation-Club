package com.example.meditationclub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Achievements extends AppCompatActivity {



    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievements);

        ListView listView =  findViewById(R.id.listview);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Annual Yoga Function 2020- Meditation Club secured 1st rank ");
        arrayList.add("Grand Meditation Contest 2020- Meditation Club secured 2nd rank nationally ");
        arrayList.add("Thomas Crane and Ben Bates secured 3rd rank in the Annual Yoga Festival 2019 ");
        arrayList.add("Kellen Willis secured National Rank 1 in the Yoga Olympiad 2018");
        arrayList.add("Alden Cantrell secured International Rank 3 in the Int'l Yoga Olympiad 2017");
        arrayList.add("Pierre Cox secured State Rank 2 in the Annual Yoga Festival 2016");
        arrayList.add("Miranda Shaffer won the 1st Prize in the Yoga Essay Writing Competition 2016");
        arrayList.add("Pierre Cox won the 2nd Prize in the Youth Meditation Competition 2015");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);
    }




}