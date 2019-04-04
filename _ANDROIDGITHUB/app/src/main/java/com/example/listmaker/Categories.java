package com.example.listmaker;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

public class Categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Categories"); //title of actionBar
        ActionBar ab = getSupportActionBar();
        //ab.setLogo();//for setting logo on the action bar
        //ab.setDisplayUseLogoEnabled(true);//displays logo
        ab.setDisplayShowHomeEnabled(true);
    }
}
