package com.example.mohamed.musicalapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import org.w3c.dom.Text;
import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_view, parent, false);
        }

        Song song = getItem(position);

        TextView songNameView = (TextView) convertView.findViewById(R.id.song_name_view);
        TextView artistNameView = (TextView) convertView.findViewById(R.id.song_artist_view);

        songNameView.setText(song.getSongName());
        artistNameView.setText(song.getArtistName());


        return convertView;
    }
}
