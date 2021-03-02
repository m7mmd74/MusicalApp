package com.example.mohamed.musicalapp;

public class Song {

    private  String songName , artistName ;

    public Song(String songName,String artistName ){
        this.songName = songName;
        this.artistName = artistName;
    }

    public String getSongName() {
        return songName;
    }

    public String getArtistName() {
        return artistName;
    }
}

