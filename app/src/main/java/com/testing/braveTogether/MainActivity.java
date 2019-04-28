package com.testing.braveTogether;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Main class of the application
 */
public class MainActivity extends AppCompatActivity {

    private String BRAVE_TOGETHER_WEBSITE = "http://www.brave-together.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Opens the homepage in a separate application
     *
     * @param view
     */
    public void openAboutPageModule(View view) {
        Uri homepage = Uri.parse(BRAVE_TOGETHER_WEBSITE);
        Intent intent = new Intent(Intent.ACTION_VIEW, homepage);
        startActivity(intent);
    }

    /**
     * Opens a new activity page that manages the march
     *
     * @param view
     */
    public void openManageMarchModule(View view) {
        Intent intent = new Intent(this, Manage_march.class);
        startActivity(intent);
    }

    /**
     * Opens a new activity that manages the recording, uploading, and sharing of a video
     *
     * @param view
     */
    public void openRecordVideoModule(View view) {
        Intent intent = new Intent(this, recordActivityInstructions.class);
        startActivity(intent);
    }


    public void openDonatePage(View view) {
    }

    public void openSignUpPage(View view) {
    }
}
