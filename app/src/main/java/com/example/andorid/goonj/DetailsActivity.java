package com.example.andorid.goonj;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class DetailsActivity extends AppCompatActivity {

    int mEventClass;
    String mEventName;
    String mEventDate;
    String mEventSummary;
    int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent incomingIntent = this.getIntent();
        Bundle bd = incomingIntent.getBundleExtra(getResources().getString(R.string.extra_data));
        extractData(bd);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null)
            actionBar.setTitle(mEventName);
        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag ==0)
                {
                    Snackbar.make(view, "Notification Enabled", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                    fab.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.notification_on));
                    flag=1;
                }
                else
                {
                    Snackbar.make(view, "Notification Disabled", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                    fab.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.notification_off));
                    flag=0;
                }
            }
        });
    }
    void extractData(Bundle bd)
    {
        mEventClass=bd.getInt(getResources().getString(R.string.event_class));
        mEventName = bd.getString(getResources().getString(R.string.event_name));
        mEventDate = bd.getString(getResources().getString(R.string.event_date));
        mEventSummary = bd.getString(getResources().getString(R.string.event_summary));
    }
}
