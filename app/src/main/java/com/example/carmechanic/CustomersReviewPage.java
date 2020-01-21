package com.example.carmechanic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CustomersReviewPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customers_review_page);
    }

    public void onReviewSubmit(View view) {
        Toast.makeText(this, "Submitted", Toast.LENGTH_SHORT).show();
        Intent toMain = new Intent(this, MainActivity.class);
        startActivity(toMain);
        finish();
    }

    public void onCancel(View view){
        Toast.makeText(this, "Canceled", Toast.LENGTH_SHORT).show();
        Intent toMain = new Intent(this, MainActivity.class);
        startActivity(toMain);
        finish();
    }
}
