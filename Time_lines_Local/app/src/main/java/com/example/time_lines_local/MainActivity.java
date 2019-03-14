package com.example.time_lines_local;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "When Clicked go to add a deadline or Event", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        initImageBitmaps();
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
            Intent myIntent = new Intent( MainActivity.this , MainActivity.class);
            startActivityForResult(myIntent, 0);

        } else if (id == R.id.nav_travel) {
            Intent myIntent = new Intent( MainActivity.this , travel.class);
            startActivityForResult(myIntent, 0);

        } else if (id == R.id.nav_deadlines) {
            Intent myIntent = new Intent( MainActivity.this , deadlines.class);
            startActivityForResult(myIntent, 0);

        } else if (id == R.id.nav_graph) {
            Intent myIntent = new Intent( MainActivity.this , analytics.class);
            startActivityForResult(myIntent, 0);


        } else if (id == R.id.nav_manage) {
            Intent myIntent = new Intent( MainActivity.this , settings.class);
            startActivityForResult(myIntent, 0);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    private void initImageBitmaps(){

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("12:00 AM");

        mImageUrls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mNames.add("1:00 AM");

        mImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mNames.add("2:00 AM");

        mImageUrls.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mNames.add("3:00 AM");

        mImageUrls.add("https://i.redd.it/j6myfqglup501.jpg");
        mNames.add("4:00 AM");


        mImageUrls.add("https://i.redd.it/0h2gm1ix6p501.jpg");
        mNames.add("5:00 AM");

        mImageUrls.add("https://i.redd.it/k98uzl68eh501.jpg");
        mNames.add("6:00 AM");


        mImageUrls.add("https://i.redd.it/glin0nwndo501.jpg");
        mNames.add("7:00 AM");

        mImageUrls.add("https://i.redd.it/obx4zydshg601.jpg");
        mNames.add("8:00 AM");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("9:00 AM");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("10:00 AM");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("11:00 AM");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("12:00 PM");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("1:00 PM");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("2:00 PM");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("3:00 PM");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("4:00 PM");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("5:00 PM");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("6:00 PM");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("7:00 PM");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("8:00 PM");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("9:00 PM");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("10:00 PM");

        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg");
        mNames.add("11:00 PM");



        initRecyclerView();
    }

    private void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

