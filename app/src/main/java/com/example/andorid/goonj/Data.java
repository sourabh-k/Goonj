package com.example.andorid.goonj;

import com.amulyakhare.textdrawable.util.ColorGenerator;

/**
 * Created by Sourabh on 25-Feb-17.
 */

public class Data {
    private String mEventName;
    private String mEventDate;
    private String mEventSummary;
    private int mEventClass;
    private int mColor;

    public Data(int mEventClass, String mEventName, String mEventDate,String mEventSummary) {
        this.mEventClass = mEventClass;
        this.mEventSummary = mEventSummary;
        this.mEventName = mEventName;
        this.mEventDate = mEventDate;
        ColorGenerator generator = ColorGenerator.MATERIAL;
        mColor = generator.getRandomColor();
    }

    public String getmEventName() {
        return mEventName;
    }

    public String getmEventSummary() {
        return mEventSummary;
    }

    public String getmEventDate() {
        return mEventDate;
    }

    public int getmEventClass() {
        return mEventClass;
    }

    public int getmColor() {
        return mColor;
    }
}
