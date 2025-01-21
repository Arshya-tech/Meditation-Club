package com.example.meditationclub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class home extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

       ListView listView =  findViewById(R.id.listview);

        ArrayList<String>  arrayList = new ArrayList<>();

        arrayList.add("NOTICE- Yoga Session on 29th May 2021 at 2pm");
        arrayList.add("NOTICE- Meditation session on 31st May at 4pm");
        arrayList.add("UPDATE- Round 1 of Meditation Club inductions are scheduled to take place on 1st June");
        arrayList.add("UPDATE- Round 2 of Meditation Club inductions are scheduled to take place on 6th June");
        arrayList.add("IMPORTANT- Annual Yoga Championship 2021 on 10th June 2021, if interested please contact");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);
    }


}