package com.example.meditationclub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Members extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_members);

        ListView listView =  findViewById(R.id.listview);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("PRESIDENT-Alden Cantrell");
        arrayList.add("PRESIDENT-Kierra Gentry");
        arrayList.add("CHIEF ADVISOR-Pierre Cox");
        arrayList.add("CHIEF ADVISOR-Thomas Crane");
        arrayList.add("MEMBER-Miranda Shaffer");
        arrayList.add("MEMBER-Bradyn Kramer");
        arrayList.add("MEMBER-Alvaro Mcgee");
        arrayList.add("MEMBER-Lizeth Daniels");
        arrayList.add("MEMBER-Ben Bates");
        arrayList.add("MEMBER-Kellen Willis");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);
    }


}

