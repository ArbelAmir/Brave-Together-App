package com.testing.braveTogether.songs;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.testing.braveTogether.LyricsActivity;
import com.testing.braveTogether.R;

public class Hatikva extends Fragment {

    private static final String TITLE = "hatikva";

    private Button nextSong;
    private Button prevSong;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.hatikva, container, false);
        nextSong = view.findViewById(R.id.nextSong_button);
        prevSong = view.findViewById(R.id.previousSong_button);

        nextSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((LyricsActivity)getActivity()).setViewPager(1); //todo: change the 1
            }
        });


        return null;
    }


}
