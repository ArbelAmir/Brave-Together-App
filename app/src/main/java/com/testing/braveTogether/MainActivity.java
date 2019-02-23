package com.testing.braveTogether;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.bravetogether.recordActivityInstructions;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Opens an about page or a link to the website
     * todo: catch excepetion in main class
     *
     * @param view
     */
    public void openAboutPageModule(View view) throws Exception {
        String url = "http://www.brave-together.com/";
        Uri homepage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, homepage);
        startActivity(intent);
//        if (intent.resolveActivity(getPackageManager()) != null) {
//            startActivity(intent);
//        } else {
//            throw new Exception("Unable to open link");
//        }
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


}
