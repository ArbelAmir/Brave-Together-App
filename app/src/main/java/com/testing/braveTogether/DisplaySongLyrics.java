package com.testing.braveTogether;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Displays a full page webpage or opens up a webpage. Can be used to display PDF files that are
 * saved in Google Drive, using their access link.
 */
public class DisplaySongLyrics extends AppCompatActivity {
    private WebView lyricsWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_song_lyrics);

        /**
         * Extracting the URL from the extra in the intent and opening it in the webview.
         */
        Intent intent = getIntent();
        String url = intent.getStringExtra("URL_MSG");

        lyricsWebView = findViewById(R.id.lyrics_web_view);

        lyricsWebView.loadUrl("https://drive.google.com/file/d/1EFQ9DoepYT0Oei9GQefsjjbSKYHo6EaN" +
                "/view?usp=sharing");
//        lyricsWebView.loadUrl(url); //todo: This isn't working! The URL is coming back as NULL.
        // Why?!?

    }
}
