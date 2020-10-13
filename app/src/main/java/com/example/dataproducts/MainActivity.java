package com.example.dataproducts;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.content.Context;
import android.app.TimePickerDialog;
import android.os.CountDownTimer;
import java.util.Timer;
import java.util.TimerTask;

import com.example.dataproducts.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    private static int MAIN_TIME_OUT=10000;
    static Context context;
    Timer t=new Timer();
    static Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        t.cancel();
                        Intent intent=new Intent(MainActivity.this,LoginActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        },MAIN_TIME_OUT,MAIN_TIME_OUT);
    }

}








