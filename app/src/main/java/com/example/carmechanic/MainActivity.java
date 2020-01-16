package com.example.carmechanic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

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

        if(!lr.isLoggedIn()) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }
    }
}