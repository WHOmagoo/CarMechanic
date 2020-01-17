package com.example.carmechanic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NotifyingActivity extends AppCompatActivity {

    private Context context;
    private String text;
    private Thread updateText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_notifying);

        Runnable r = new Runnable() {
            @Override
            public void run() {

                text = "";

                for(int i = 0; i < 6; i++) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            TextView tv = findViewById(R.id.pendingStatus);
                            tv.setText(text);
                        }
                    });
                    text += ". ";
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException ignored) {
                    }

                    if(Thread.interrupted()){
                        return;
                    }
                }

                Intent toMain = new Intent(context, MainActivity.class);
                toMain.putExtra("noLogin", true);
                startActivity(toMain);
                finish();
            }
        };

         updateText = new Thread(r);
        updateText.start();
    }

    @Override
    public void finish(){
        super.finish();
        updateText.interrupt();
    }
}
