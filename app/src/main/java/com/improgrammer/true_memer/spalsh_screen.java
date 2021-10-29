package com.improgrammer.true_memer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class spalsh_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh_screen);

        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(100);
                }
                catch (Exception e){
                    e.getMessage();
                }
                finally {
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    finish();

                }
            }
        };
        thread.start();
    }

}