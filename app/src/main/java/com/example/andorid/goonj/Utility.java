package com.example.andorid.goonj;

import java.util.ArrayList;

/**
 * Created by Sourabh on 25-Feb-17.
 */

public class Utility {
    static ArrayList<Data> getDataForEvents(int eventClass)
    {
        ArrayList<Data> data = new ArrayList<>();
        switch (eventClass)
        {
            case 1:// For technical data
                data.add(new Data(eventClass,"Technical Event 1","Date 1","Summary goes here"));
                data.add(new Data(eventClass,"Technical Event 2","Date 2","Summary goes here"));
                data.add(new Data(eventClass,"Technical Event 3","Date 3","Summary goes here"));
                data.add(new Data(eventClass,"Technical Event 4","Date 4","Summary goes here"));
                data.add(new Data(eventClass,"Technical Event 5","Date 5","Summary goes here"));
                data.add(new Data(eventClass,"Technical Event 6","Date 6","Summary goes here"));
                data.add(new Data(eventClass,"Technical Event 7","Date 7","Summary goes here"));
                data.add(new Data(eventClass,"Technical Event 8","Date 8","Summary goes here"));
                data.add(new Data(eventClass,"Technical Event 9","Date 9","Summary goes here"));
                data.add(new Data(eventClass,"Technical Event 10","Date 10","Summary goes here"));
                data.add(new Data(eventClass,"Technical Event 11","Date 11","Summary goes here"));
                data.add(new Data(eventClass,"Technical Event 12","Date 12","Summary goes here"));
                data.add(new Data(eventClass,"Technical Event 13","Date 13","Summary goes here"));
                data.add(new Data(eventClass,"Technical Event 14","Date 14","Summary goes here"));
                break;
            case 2: // For Cultural Data
                data.add(new Data(eventClass,"Cultural Event 1","Date 1","Summary goes here"));
                data.add(new Data(eventClass,"Cultural Event 2","Date 2","Summary goes here"));
                data.add(new Data(eventClass,"Cultural Event 3","Date 3","Summary goes here"));
                data.add(new Data(eventClass,"Cultural Event 4","Date 4","Summary goes here"));
                data.add(new Data(eventClass,"Cultural Event 5","Date 5","Summary goes here"));
                data.add(new Data(eventClass,"Cultural Event 6","Date 6","Summary goes here"));
                data.add(new Data(eventClass,"Cultural Event 7","Date 7","Summary goes here"));
                data.add(new Data(eventClass,"Cultural Event 8","Date 8","Summary goes here"));
                data.add(new Data(eventClass,"Cultural Event 9","Date 9","Summary goes here"));
                data.add(new Data(eventClass,"Cultural Event 10","Date 10","Summary goes here"));
                data.add(new Data(eventClass,"Cultural Event 11","Date 11","Summary goes here"));
                data.add(new Data(eventClass,"Cultural Event 12","Date 12","Summary goes here"));
                data.add(new Data(eventClass,"Cultural Event 13","Date 13","Summary goes here"));
                data.add(new Data(eventClass,"Cultural Event 14","Date 14","Summary goes here"));
                break;
        }
        return data;
    }
}
