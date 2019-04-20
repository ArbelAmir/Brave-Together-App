package com.testing.braveTogether;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.testing.braveTogether.ytdl.RecordActivity;

public class recordActivityInstructions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_activity_instructions);
    }

    public void openRecordActivity(View view) {
        Intent intent = new Intent(this, RecordActivity.class);
        startActivity(intent);


    }
}
