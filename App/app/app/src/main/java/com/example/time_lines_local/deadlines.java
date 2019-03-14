package com.example.time_lines_local;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class deadlines extends MainActivity implements NavigationView.OnNavigationItemSelectedListener  {

    private ArrayList<String> mDates = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deadlines_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_calendar) {
            Intent myIntent = new Intent( deadlines.this , MainActivity.class);
            startActivityForResult(myIntent, 0);

        } else if (id == R.id.nav_travel) {
            Intent myIntent = new Intent( deadlines.this , travel.class);
            startActivityForResult(myIntent, 0);

        } else if (id == R.id.nav_deadlines) {
            Intent myIntent = new Intent( deadlines.this , deadlines.class);
            startActivityForResult(myIntent, 0);

        } else if (id == R.id.nav_graph) {
            Intent myIntent = new Intent(deadlines.this , analytics.class);
            startActivityForResult(myIntent, 0);


        } else if (id == R.id.nav_manage) {
            Intent myIntent = new Intent( deadlines.this , settings.class);
            startActivityForResult(myIntent, 0);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void initImageBitmaps(){

        //mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mDates.add("Today, March 14th, 2019");
        mNames.add("Math-122 Assignment 4");

       // mImageUrls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mDates.add("Friday, March 15th, 2019");
        mNames.add("SENG-310 Assignment 3");

        //mImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mDates.add("Tuesday, March 19th, 2019");
        mNames.add("Stats-260 Midterm 3");

        //mImageUrls.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mDates.add("Thursday, March 21st, 2019");
        mNames.add("Math-122 Test 5");

        //mImageUrls.add("https://i.redd.it/j6myfqglup501.jpg");
        mDates.add("Wednesday, March 27th, 2019");
        mNames.add("SENG-265 Assignment 4");


        //mImageUrls.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        mDates.add("Friday, March 29th, 2019");
        mNames.add("ECE-260 Lab 6");

        //mImageUrls.add("https://i.redd.it/k98uzl68eh501.jpg");
        mDates.add("Thursday, April 4th, 2019");
        mNames.add("SENG-310 Project Phase 4");


        initRecyclerView();
    }

    private void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mDates, mNames);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
