package com.example.tipicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class viewArborec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_arborec);
    }

    public void viewArbLore(View view) {
        Intent intent = new Intent(this, arborecLore.class);
        startActivity(intent);
    }

    public void viewArbStats(View view) {
        Intent intent = new Intent(this, arborecStats.class);
        startActivity(intent);
    }
}
