package com.example.andorid.goonj;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.amulyakhare.textdrawable.TextDrawable;
import com.amulyakhare.textdrawable.util.ColorGenerator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        findViewById(R.id.techimgv).setBackground(TextDrawable.builder().buildRect(String.valueOf("Technical".charAt(0)), ColorGenerator.MATERIAL.getRandomColor()));
        findViewById(R.id.cultimgv).setBackground(TextDrawable.builder().buildRect(String.valueOf("Cultural".charAt(0)), ColorGenerator.MATERIAL.getRandomColor()));
        findViewById(R.id.theaimgv).setBackground(TextDrawable.builder().buildRect(String.valueOf("Theatre".charAt(0)), ColorGenerator.MATERIAL.getRandomColor()));
        findViewById(R.id.liteimgv).setBackground(TextDrawable.builder().buildRect(String.valueOf("Literature".charAt(0)), ColorGenerator.MATERIAL.getRandomColor()));
        findViewById(R.id.funimgv).setBackground(TextDrawable.builder().buildRect(String.valueOf("Fun".charAt(0)), ColorGenerator.MATERIAL.getRandomColor()));
        findViewById(R.id.sporimgv).setBackground(TextDrawable.builder().buildRect(String.valueOf("Sports".charAt(0)), ColorGenerator.MATERIAL.getRandomColor()));
        findViewById(R.id.fineimgv).setBackground(TextDrawable.builder().buildRect(String.valueOf("FA"), ColorGenerator.MATERIAL.getRandomColor()));

        /*NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);*/


        LinearLayout technical = (LinearLayout) findViewById(R.id.technical);
        technical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDataToList(1);
            }
        });

        LinearLayout cultural = (LinearLayout) findViewById(R.id.cultural);
        cultural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDataToList(2);
            }
        });



    }
    public void loadDataToList(final int eventClass)
    {
        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayList<Data> data = Utility.getDataForEvents(eventClass);
        final ListAdapter listAdapter = new ListAdapter(this,0,data);
        listView.setAdapter(listAdapter);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, data);
        //listView.setAdapter(adapter);
        Bundle bd= new Bundle();
        bd.putInt(getResources().getString(R.string.event_class),eventClass);
        Intent intent = new Intent(getApplicationContext(),ListActivity.class);
        intent.putExtra(getResources().getString(R.string.extra_data),bd);
        startActivity(intent);
        Log.i("SCROLLING DOWN","TRUE");
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Data current_data = listAdapter.getItem(position);
                Bundle bd = new Bundle();
                if(current_data != null)
                {
                    bd.putInt(getResources().getString(R.string.event_class),current_data.getmEventClass());
                    bd.putString(getResources().getString(R.string.event_name),current_data.getmEventName());
                    bd.putString(getResources().getString(R.string.event_date),current_data.getmEventDate());
                    bd.putString(getResources().getString(R.string.event_summary),current_data.getmEventSummary());
                }
                Intent intent = new Intent(getApplicationContext(), DetailsActivity.class);
                intent.putExtra(getResources().getString(R.string.extra_data),bd);
                startActivity(intent);
            }
        });

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

        if (id == R.id.nav_gallery) {
            // Handle the camera action
        } else if (id == R.id.nav_contacts) {

        } else if (id == R.id.nav_direction) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
