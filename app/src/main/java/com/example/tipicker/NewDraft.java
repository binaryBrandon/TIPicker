/*
    pseudo-code: display 6 races
    lol guess I forgot to write pesudo-code whoops
 */


package com.example.tipicker;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NewDraft extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_draft);


        //V READ ABOUT ADAPTERS TO AVOID THIS V


        TextView testTextView = findViewById(R.id.testTextView);

        ArrayList<TextView> racesAssigned = new ArrayList<TextView>();
            racesAssigned.add((TextView) findViewById(R.id.raceAssigned1));
            racesAssigned.add((TextView) findViewById(R.id.raceAssigned2));
            racesAssigned.add((TextView) findViewById(R.id.raceAssigned3));
            racesAssigned.add((TextView) findViewById(R.id.raceAssigned4));
            racesAssigned.add((TextView) findViewById(R.id.raceAssigned5));
            racesAssigned.add((TextView) findViewById(R.id.raceAssigned6));


        // ^ USE ADAPTERS INSTEAD OF THAT ^

        //TextView thisOne = testTextView;

        TextView testTextView2 = findViewById(R.id.testTextView2);
        //decided to use arraylist instead of String array
        /*String[] races = {"The Arborec", "The Ghosts of Creuss", "The Emirates of Hacan", "The Universities of Jol-Nar",
                "The L1Z1X Mindnet", "The Barony of Letnev", "The Mentak Coalition", "The Embers of Muaat",
                "The Naalu Collective", "The Nekro Virus", "The Clan of Saar", "Sardak N'orr", "The Federation of Sol",
                "The Winnu", "The Xxcha Kingdom", "The Yin Brotherhood", "The Yssaril Tribes"
        };*/

        //create arraylist of all races
        List<String> races = new ArrayList<String>();
        races.add("The Arborec");
        races.add("The Ghosts of Creuss");
        races.add("The Emirates of Hacan");
        races.add("The Universities of Jol-Nar");
        races.add("The L1Z1X Mindnet");
        races.add("The Barony of Letnev");
        races.add("The Mentak Coalition");
        races.add("The Embers of Muaat");
        races.add("The Naalu Collective");
        races.add("The Nekro Virus");
        races.add("The Clan of Saar");
        races.add("Sardak N'orr");
        races.add("The Federation of Sol");
        races.add("The Winnu");
        races.add("The Xxcha Kingdom");
        races.add("The Yin Brotherhood");
        races.add("The Yssaril Tribes");

        int numOfRaces = races.size();


        /*//displays all races in TextView called testTextView
        for (int i = 0; i < numOfRaces; i++) {
            testTextView.append(races.get(i) + "\n");
        }*/
        Random rand = new Random();

        for(int i = 0; i < 6; i++) {
            //displays a random race
            int selection = rand.nextInt(numOfRaces-i);
            TextView thisPlayer = racesAssigned.get(i);
            thisPlayer.setText(races.get(selection));

            //delete member races[selection]
            races.remove(selection);
            numOfRaces = races.size();
        }

        /*//now display list of remaining races
        for (int i = 0; i < numOfRaces; i++) {
            testTextView2.append(races.get(i) + "\n");
        }*/
    }
}
