package com.example.mohamed.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class MySong extends AppCompatActivity {
    ArrayList<Song> songs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_design);
        songs = new ArrayList<>();

        songs.add(new Song(getString(R.string.first_song_name), getString(R.string.first_song_artist)));
        songs.add(new Song(getString(R.string.second_song_name), getString(R.string.second_song_artist)));
        songs.add(new Song(getString(R.string.third_song_name), getString(R.string.third_song_artist)));
        songs.add(new Song(getString(R.string.forth_song_name), getString(R.string.forth_song_artist)));
        songs.add(new Song(getString(R.string.fifth_song_name), getString(R.string.fifth_song_artist)));


        ListView songsListView = (ListView) findViewById(R.id.songs_list_view);

        SongAdapter adapter = new SongAdapter(this, songs);

        songsListView.setAdapter(adapter);


        TextView album = (TextView) findViewById(R.id.albums);
        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent album = new Intent(MySong.this, MyAlbum.class);
                startActivity(album);
            }
        });
        Button Music_Library = (Button) findViewById(R.id.Library);
        Music_Library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Library = new Intent(MySong.this, MainActivity.class);
                startActivity(Library);
            }
        });
    }
}
