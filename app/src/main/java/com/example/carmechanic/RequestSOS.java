package com.example.carmechanic;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class RequestSOS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_sos);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void onCancel(View tv){
        finish();
    }

    public void onSend(View tv){
        Intent i = new Intent(this, NotifyingActivity.class);
        startActivity(i);
        finish();
    }
}
