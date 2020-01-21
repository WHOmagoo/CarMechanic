package com.example.carmechanic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MechanicsReviewPage extends AppCompatActivity {
    boolean enabled = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanics_review_page);
    }

    public void onCheckClick(View view){
        EditText et = findViewById(R.id.editText9);
        enabled = !enabled;
        et.setEnabled(enabled);
    }

    public void onReviewSubmit(View view) {
        Toast.makeText(this, "Submitted", Toast.LENGTH_SHORT).show();
        Intent toMain = new Intent(this, MechanicHomeView.class);
        startActivity(toMain);
        finish();
    }

    public void onCancel(View view){
        Toast.makeText(this, "Canceled", Toast.LENGTH_SHORT).show();
        Intent toMain = new Intent(this, MechanicHomeView.class);
        startActivity(toMain);
        finish();
    }
}
