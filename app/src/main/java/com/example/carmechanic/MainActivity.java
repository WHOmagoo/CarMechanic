package com.example.carmechanic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.carmechanic.data.LoginDataSource;
import com.example.carmechanic.data.LoginRepository;
import com.example.carmechanic.ui.login.LoginActivity;
import com.example.carmechanic.ui.login.LoginViewModel;
import com.example.carmechanic.ui.login.LoginViewModelFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LoginViewModel lvm = ViewModelProviders.of(this, new LoginViewModelFactory())
                .get(LoginViewModel.class);

        LoginRepository lr = LoginRepository.getInstance(new LoginDataSource());

        setContentView(R.layout.activity_main);

        //TODO re-enable this on release
        if(!lr.isLoggedIn() && false) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hamburger_menu, menu);
        return true;
    }

    public void requesteSos(View view) {
        Intent requestSOS = new Intent(this, RequestSOS.class);
        startActivity(requestSOS);
    }

    public void requestRepair(View view){
        Intent requestRepair = new Intent(this, RequestSOS.class);
        startActivity(requestRepair);
    }

    public void onProfileClick(MenuItem view){
        Intent profile = new Intent(this, EditProfileActivity.class);
        startActivity(profile);
    }

    public void onSettingsClick(MenuItem view){
        Toast.makeText(this, "Edit Settings", Toast.LENGTH_SHORT).show();
    }
}