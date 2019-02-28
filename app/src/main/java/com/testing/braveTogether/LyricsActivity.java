package com.testing.braveTogether;

import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.testing.braveTogether.songs.Hatikva;
import com.testing.braveTogether.songs.OneHumanTapestry;


public class LyricsActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private LyricsStatePagerAdaptor mLyricsStatePageAdaptor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyrics);

        mLyricsStatePageAdaptor = new LyricsStatePagerAdaptor(getSupportFragmentManager());
        mViewPager = findViewById(R.id.lyricsContainer);
        setupViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager viewPager){
        LyricsStatePagerAdaptor adaptor = new LyricsStatePagerAdaptor(getSupportFragmentManager());
        adaptor.addSong(new Hatikva(), "hatikva");
        adaptor.addSong(new OneHumanTapestry(), "One Human Tapestry");
        viewPager.setAdapter(adaptor);
    }

    public void setViewPager(int songNum){
        mViewPager.setCurrentItem(songNum);
    }


}
