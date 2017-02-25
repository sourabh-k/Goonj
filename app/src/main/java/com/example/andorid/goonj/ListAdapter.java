package com.example.andorid.goonj;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Sourabh on 25-Feb-17.
 */

public class ListAdapter extends ArrayAdapter<Data> {

    public ListAdapter(Context context, int resource, ArrayList<Data> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView==null)
        {
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        }
        Data currentData = (Data) getItem(position);
        TextView event_name= (TextView) listItemView.findViewById(R.id.tv_event_name);
        TextView event_date =(TextView) listItemView.findViewById(R.id.tv_event_date);
        event_name.setText(currentData.getmEventName());
        event_date.setText(currentData.getmEventDate());
        return listItemView;
    }
}
