package com.example.maria.devslopersradio.services;

import com.example.maria.devslopersradio.model.Station;

import java.util.ArrayList;

/**
 * Created by Maria on 23.7.2017 г..
 * Here we put the Main(first) screen:
 * Title Text
 * Title Image
 */

public class DataService {
    private static final DataService ourInstance = new DataService();


    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {

    }

    public ArrayList<Station> getFeaturedStations() {
        //Pretend we just downloaded featured station from the Internet
        //if we wont we may bind data from internet with html...something
        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight Plan (Tunes for Travel)", "flightplanmusic"));
        list.add(new Station("Two-Wheelin (Biking Playlist)", "bicyclemusic"));
        list.add(new Station("Kids Jams (Music for Children)", "kidsmusic"));

        return list;
    }

    public ArrayList<Station> getRecentStations() {
        ArrayList<Station> list = new ArrayList<>();
        return list;
    }

    public ArrayList<Station> getPartyStations() {
        ArrayList<Station> list = new ArrayList<>();

        list.add(new Station("Vinyl Music", "vinylmusic"));
        list.add(new Station("Social Music", "socialmusic"));
        list.add(new Station("Key Music", "keymusic"));
        return list;
    }

    public ArrayList<Station> getPopMusicPlaylist() {
        ArrayList<Station> popList = new ArrayList<>();
        popList.add(new Station("Cool Pop Music", "popmusicimg"));
        popList.add(new Station("The best Disco ever", "discomusicimg"));
        popList.add(new Station("Music for Lovers", "lovemusic"));

        return popList;
    }

    public ArrayList<Station> getDiscoMusicPlaylist() {
        ArrayList<Station> discoList = new ArrayList<>();
        discoList.add(new Station("Cool Pop Music", "popmusicimg"));
        discoList.add(new Station("The best Disco ever", "discomusicimg"));
        discoList.add(new Station("Music for Lovers", "lovemusic"));

        return discoList;
    }

    public ArrayList<Station> getLoveMusicPlaylist() {
        ArrayList<Station> loveList = new ArrayList<>();
        loveList.add(new Station("Cool Pop Music", "popmusicimg"));
        loveList.add(new Station("The best Disco ever", "discomusicimg"));
        loveList.add(new Station("Music for Lovers", "lovemusic"));

        return loveList;
    }

}
