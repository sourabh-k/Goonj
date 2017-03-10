package com.example.andorid.goonj;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.amulyakhare.textdrawable.TextDrawable;
import com.amulyakhare.textdrawable.util.ColorGenerator;

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
        TextDrawable drawable = TextDrawable.builder().buildRoundRect(String.valueOf(currentData.getmEventName().charAt(0)), ColorGenerator.MATERIAL.getRandomColor(), 100);
        TextView event_name= (TextView) listItemView.findViewById(R.id.tv_event_name);
        TextView event_date =(TextView) listItemView.findViewById(R.id.tv_event_date);
        ImageView event_img = (ImageView) listItemView.findViewById(R.id.imgv);
        event_name.setText(currentData.getmEventName());
        event_date.setText(currentData.getmEventDate());
        event_img.setImageDrawable(drawable);
        return listItemView;
    }
}
