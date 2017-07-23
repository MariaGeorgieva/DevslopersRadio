package com.example.maria.devslopersradio.model;

/**
 * Created by Maria on 23.7.2017 г..
 */

public class Station {
    final String DRAWABLE = "drawable/";
    private String stationTitle;
    private String imgUri;

    public Station(String stationTitle, String imgUri) {
        this.stationTitle = stationTitle;
        this.imgUri=imgUri;
    }


    public String getStationTitle() {
        return stationTitle;
    }



    public String getImgUri() {
        return DRAWABLE + imgUri;
    }


}
