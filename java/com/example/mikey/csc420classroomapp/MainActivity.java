package com.example.mikey.csc420classroomapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Assignment> assignments;
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignments = new ArrayList<Assignment>();
        assignments.add(new Assignment("Math", "Do worksheet", "Study addition", "Create multiplication table"));
        assignments.add(new Assignment("English", "Write book report", "Read short story", "Practice penmanship"));
        assignments.add(new Assignment("Social Studies", "Study geography", "Write paper on Canada", "Create poster board of USA"));
        assignments.add(new Assignment("Science", "Create cell diagram", "Redo Experiment", "Study for quiz"));
        assignments.add(new Assignment("Gym", "Do pull ups", "Run a mile", "Practice Basketball"));

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.expListView);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

    }

    public void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();
        List l = new ArrayList();
        for (Assignment x : assignments) {
            listDataHeader.add(x.name);
            l.add("".concat(x.date));
            l.add("".concat(x.className));
            l.add("".concat(x.description));
            listDataChild.put(x.name, l);
            l = new ArrayList();
        }
    }

    public void avatarSelect(View view) {
        int[] myImageList = new int[]{R.drawable.cutebluemonstersicon, R.drawable.cutemonsters3icon, R.drawable.cutemonstersicon, R.drawable.monsters2icon, R.drawable.monsters3icon, R.drawable.monsters4icon, R.drawable.monsters5icon, R.drawable.monstersfishicon, R.drawable.monsterssnailicon};
        ImageButton avatar = (ImageButton) findViewById(R.id.imageButton);
        if (counter == 0) {
            avatar.setImageResource(myImageList[0]);
            counter++;
        } else if (counter == 1) {
            avatar.setImageResource(myImageList[1]);
            counter++;
        } else if (counter == 2) {
            avatar.setImageResource(myImageList[2]);
            counter++;
        } else if (counter == 3) {
            avatar.setImageResource(myImageList[3]);
            counter++;
        } else if (counter == 4) {
            avatar.setImageResource(myImageList[4]);
            counter++;
        } else if (counter == 5) {
            avatar.setImageResource(myImageList[5]);
            counter++;
        } else if (counter == 6) {
            avatar.setImageResource(myImageList[6]);
            counter++;
        } else if (counter == 7) {
            avatar.setImageResource(myImageList[7]);
            counter++;
        } else if (counter == 8) {
            avatar.setImageResource(myImageList[8]);
            counter++;
        } else if (counter == 9) {
            avatar.setImageResource(myImageList[0]);
            counter = counter - 9;
        }
    }

    public void help(View view){
        Intent intent = new Intent(MainActivity.this, helpAcitivity.class);
        startActivity(intent);
    }



    }



