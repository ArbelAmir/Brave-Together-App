package com.testing.braveTogether;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//NOTE: Currently this class is not used. Instead, the lyrics are displayed by going to the website

/**
 * This activity displays options for the user to choose what Shiron (lyrics) to view, based on
 * location he selects.
 * If adding additional locations, changes only need to be made in this module (LyricsActivity.java
 * and activity_lyrics.xml)
 * Follow these steps to add a new location (also, see comments in code):
 *      1. Add a new button in the activity_lyrics.xml file.
 *      2. Add a private Button field, naming it newLocation_lyrics
 *      3. Add a private String field with the URL, naming it newLocation_url
 *      4. Add the following line: newLocation_lyrics = findViewById(R.id.newLocation_song_lyrics)
 *      5. Set an setOnClickListener for the newLocation_lyrics button by adding the following line:
 *         newLocation_lyrics.setOnClickListener(this);
 *      6. Edit the onClick function and add the following case:
 *          case R.id.newLocation_song_lyrics:
 *               displayLyricsIntent.putExtra(URL_MSG, newLocation_url);
 *               break;
 *      That's it! Good luck :)
 *
 */
public class LyricsActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * The possible locations
     */
    private Button jerusalem_lyrics;
    private Button eilat_lyrics;
    private Button yad_mordichai_lyrics;
    private Button tel_aviv_lyrics;
    private Button kiryat_mutzkin_lyrics;
    private Button lohamei_haGetaot_lyrics;

//    private Button newLocation_lyrics


    String URL_MSG = "com.testing.braveTogether.URL_ADDRESS";

    /**
     * The Google Drive URL of the PDF document with the location's shiron (song lyrics)
     */
    private String jerusalem_url = "https://drive.google.com/file/d/1EFQ9DoepYT0Oei9GQefsjjbSKYHo6EaN/view?usp=sharing";
    private String eilat_url;
    private String yad_mordichai_url;
    private String tel_aviv_url;
    private String kiryat_mutzkin_url;
    private String lohamei_haGetaot_url;

//    private String newLocation_url = "put url here";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyrics);

        jerusalem_lyrics = findViewById(R.id.jerusalem_song_lyrics);
        eilat_lyrics = findViewById(R.id.eilat_song_lyrics);
        yad_mordichai_lyrics = findViewById(R.id.yad_mordichai_song_lyrics);
        tel_aviv_lyrics = findViewById(R.id.tel_aviv_song_lyrics);
        kiryat_mutzkin_lyrics = findViewById(R.id.kiryat_mutzkin_song_lyrics);
        lohamei_haGetaot_lyrics = findViewById(R.id.lohamei_hagetaot_song_lyrics);

//      newLocation_lyrics = findViewById(R.id.newLocation_song_lyrics);

        jerusalem_lyrics.setOnClickListener(this);
        eilat_lyrics.setOnClickListener(this);
        yad_mordichai_lyrics.setOnClickListener(this);
        tel_aviv_lyrics.setOnClickListener(this);
        kiryat_mutzkin_lyrics.setOnClickListener(this);
        lohamei_haGetaot_lyrics.setOnClickListener(this);

//        newLocation_lyrics.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent displayLyricsIntent = new Intent(this, DisplaySongLyrics.class);
        switch (v.getId()) {
            case R.id.jerusalem_song_lyrics:
                displayLyricsIntent.putExtra(URL_MSG, jerusalem_url);
                break;
            case R.id.eilat_song_lyrics:
                displayLyricsIntent.putExtra(URL_MSG, eilat_url);
                break;
            case R.id.yad_mordichai_song_lyrics:
                displayLyricsIntent.putExtra(URL_MSG, yad_mordichai_url);
                break;
            case R.id.tel_aviv_song_lyrics:
                displayLyricsIntent.putExtra(URL_MSG, tel_aviv_url);
                break;
            case R.id.kiryat_mutzkin_song_lyrics:
                displayLyricsIntent.putExtra(URL_MSG, kiryat_mutzkin_url);
                break;
            case R.id.lohamei_hagetaot_song_lyrics:
                displayLyricsIntent.putExtra(URL_MSG, lohamei_haGetaot_url);
                break;
//            case R.id.newLocation_song_lyrics:
//                displayLyricsIntent.putExtra(URL_MSG, newLocation_url);
//                break;

        }
        startActivity(displayLyricsIntent);

    }
}
