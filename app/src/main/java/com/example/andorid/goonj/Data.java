package com.example.andorid.goonj;

/**
 * Created by Sourabh on 25-Feb-17.
 */

public class Data {
    private String mEventName;
    private String mEventDate;
    private String mEventSummary;
    private int mEventClass;

    public Data(int mEventClass, String mEventName, String mEventDate,String mEventSummary) {
        this.mEventClass = mEventClass;
        this.mEventSummary = mEventSummary;
        this.mEventName = mEventName;
        this.mEventDate = mEventDate;
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
}
