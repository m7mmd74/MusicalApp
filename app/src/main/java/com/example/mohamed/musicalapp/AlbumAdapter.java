package com.example.mohamed.musicalapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumAdapter extends ArrayAdapter<Album>{
    public AlbumAdapter(Context context, ArrayList<Album> albums) {
        super(context, 0, albums);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_view, parent, false);
        }

        Album album = getItem(position);

        TextView albumNameView = (TextView) convertView.findViewById(R.id.song_name_view);
        TextView artistNameView = (TextView) convertView.findViewById(R.id.song_artist_view);
        artistNameView.setVisibility(View.INVISIBLE);


        albumNameView.setText(album.getAlbumName());


        return convertView;
    }
}
