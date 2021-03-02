package com.example.mohamed.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAlbum extends AppCompatActivity {

    ArrayList<Album> albums;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_design);
        albums = new ArrayList<>();

        albums.add(new Album(getString(R.string.first_album_name)));
        albums.add(new Album(getString(R.string.second_album_name)));
        albums.add(new Album(getString(R.string.third_album_name)));
        albums.add(new Album(getString(R.string.forth_album_name)));
        albums.add(new Album(getString(R.string.fifth_album_name)));


        ListView albumsListView = (ListView) findViewById(R.id.album_list_view);

        AlbumAdapter adapter = new AlbumAdapter(this, albums);

        albumsListView.setAdapter(adapter);


        TextView songs = (TextView) findViewById(R.id.songs);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songs = new Intent(MyAlbum.this, MySong.class);
                startActivity(songs);

            }
        });
        Button Music_Library = (Button) findViewById(R.id.Library);
        Music_Library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Library = new Intent(MyAlbum.this, MainActivity.class);
                startActivity(Library);


            }
        });
    }
}
