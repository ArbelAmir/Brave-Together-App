package com.testing.braveTogether;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Manages the aspects of the marches, including location, coordinating singing, songs, etc.
 */
public class Manage_march extends AppCompatActivity {

    private String BRAVE_TOGETHER_SONGS = "http://www.brave-together.com/songs";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_march);
    }

    public void openLyricsActivity(View view) {

        Uri homepage = Uri.parse(BRAVE_TOGETHER_SONGS);
        Intent intent = new Intent(Intent.ACTION_VIEW, homepage);
        startActivity(intent);

    }
}
