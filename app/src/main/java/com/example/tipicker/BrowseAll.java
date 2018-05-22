package com.example.tipicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BrowseAll extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_all);
    }

    public void goToArborec(View view) {
        Intent intent = new Intent(this, viewArborec.class);
        startActivity(intent);
    }
}