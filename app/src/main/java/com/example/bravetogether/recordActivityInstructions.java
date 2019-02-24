package com.example.bravetogether;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

//import com.testing.app_mizad_hagvura.R;
import com.testing.braveTogether.R;
import com.testing.braveTogether.RecordsActivity;

public class recordActivityInstructions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_activity_instructions);
    }

    public void openRecordsActivity(View view) {
        Intent intent = new Intent(this, RecordsActivity.class);
        startActivity(intent);


    }
}
