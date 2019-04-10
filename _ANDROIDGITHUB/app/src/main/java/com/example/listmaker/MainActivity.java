package com.example.listmaker;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home"); //title of actionBar
        ActionBar ab = getSupportActionBar();
        //ab.setLogo();//for setting logo on the action bar
        //ab.setDisplayUseLogoEnabled(true);//displays logo
        ab.setDisplayShowHomeEnabled(true);
    }

    public void goToCategories(View view)
    {
        startActivity(new Intent(MainActivity.this, Category.class));
    }
}
