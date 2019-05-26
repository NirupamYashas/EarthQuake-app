package com.example.android.quakereport;

public class Earthquake {

    private double nMagnitude;
    private String nLocation;
    //private String nDate;
    private long mTimeInMilliseconds;
    private String mUrl;

    public Earthquake(double magnitude, String location, long timeInMilliseconds,String url){
        nMagnitude = magnitude;
        nLocation = location;
       // nDate = date;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public double getMagnitude() {
        return nMagnitude;
    }

    public String getLocation() {
        return nLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }
}
