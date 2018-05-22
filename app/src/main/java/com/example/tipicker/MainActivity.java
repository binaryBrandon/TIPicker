//always keep it one hunnit for YoungKyng
package com.example.tipicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Called when the user taps the browse all races button
    public void browseAll(View view) {
        //do stuff
        //use inSampleSize?
        Intent intent = new Intent(this, BrowseAll.class);
        startActivity(intent);
    }

    public void newDraft(View view) {
        Intent intent = new Intent(this, NewDraft.class);
        startActivity(intent);
    }
}