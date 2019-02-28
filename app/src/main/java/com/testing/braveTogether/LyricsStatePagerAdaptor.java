package com.testing.braveTogether;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class LyricsStatePagerAdaptor extends FragmentStatePagerAdapter {

    private final List<Fragment> mSongList = new ArrayList<>();
    private final List<String> mSongTitleList = new ArrayList<>();

    public LyricsStatePagerAdaptor(FragmentManager fm) {
        super(fm);
    }

    protected void addSong(Fragment song, String title){
        mSongList.add(song);
        mSongTitleList.add(title);

    }

    @Override
    public Fragment getItem(int i) {
        return mSongList.get(i);
    }

    @Override
    public int getCount() {
        return mSongList.size();
    }
}
