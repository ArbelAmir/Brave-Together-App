package com.testing.braveTogether;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Manage_march extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_march);
    }

    public void openLyricsActivity(View view) {
        Intent intent = new Intent(this, LyricsActivity.class);
        startActivity(intent);
    }
}
