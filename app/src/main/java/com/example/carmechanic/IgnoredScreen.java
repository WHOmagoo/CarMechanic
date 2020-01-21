package com.example.carmechanic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class IgnoredScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ignored_screen);
    }

    public void onSwitchViewClick(MenuItem item) {
        Intent backToMain = new Intent(this, MainActivity.class);
        startActivity(backToMain);
        finish();
    }

    public void returnToStartScreen(View view) {
        Intent toMain = new Intent(this, MechanicHomeView.class);
        startActivity(toMain);
        finish();
    }
}
