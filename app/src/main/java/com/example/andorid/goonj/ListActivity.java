package com.example.andorid.goonj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    int mEventClass;
    String mEventClassName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent incoming = this.getIntent();
        Bundle bd = incoming.getBundleExtra(getResources().getString(R.string.extra_data));
        mEventClass = bd.getInt(getResources().getString(R.string.event_class));
        switch (mEventClass) {
            case 1:
                mEventClassName = "Technical Events";
                break;
            case 2:
                mEventClassName = "Cultural Events";
                break;
            case 3:
                mEventClassName = "Literature Events";
                break;
            case 4:
                mEventClassName = "Fine Arts Events";
                break;
            case 5:
                mEventClassName = "Fun Events";
                break;
            case 6:
                mEventClassName = "Sports Events";
                break;
            case 7:
                mEventClassName = "Theatre Events";
                break;
        }
        setContentView(R.layout.activity_list);
        loadDataToList();
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle(mEventClassName);
        }
    }
    public void loadDataToList()
    {
        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayList<Data> data = Utility.getDataForEvents(mEventClass);
        final ListAdapter listAdapter = new ListAdapter(this,0,data);
        listView.setAdapter(listAdapter);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, data);
        //listView.setAdapter(adapter);
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
}
