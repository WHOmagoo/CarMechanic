package com.example.carmechanic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MechanicHomeView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanic_home_view);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hamburger_menu, menu);
        return true;
    }

    public void acceptClick(View view) {
        Toast.makeText(this, "accepted!", Toast.LENGTH_SHORT).show();
    }

    public void ignoreClick(View view) {
        Intent ignored = new Intent(this, IgnoredScreen.class);
        startActivity(ignored);
    }

    public void onProfileClick(MenuItem view){
        Intent profile = new Intent(this, EditProfileActivity.class);
        startActivity(profile);
    }

    public void onSettingsClick(MenuItem view){
        Toast.makeText(this, "Edit Settings", Toast.LENGTH_SHORT).show();
    }

    public void onSwitchViewClick(MenuItem item) {
        Intent mechanicView = new Intent(this, MainActivity.class);
        startActivity(mechanicView);
        finish();
    }

    public void reviewClick(MenuItem item) {
        Intent mechanicView = new Intent(this, MechanicsReviewPage.class);
        startActivity(mechanicView);
        finish();
    }

    public void moreClick(View view) {
        Toast.makeText(this, "More information can be shown on this button press, page not implemented", Toast.LENGTH_SHORT).show();
    }
}
