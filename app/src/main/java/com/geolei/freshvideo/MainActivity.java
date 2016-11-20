package com.geolei.freshvideo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.emptyTheme);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                MainActivity.this.finish();

            }
        }).start();


    }


}
