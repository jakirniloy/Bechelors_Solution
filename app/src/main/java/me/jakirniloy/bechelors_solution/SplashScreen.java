package me.jakirniloy.bechelors_solution;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class SplashScreen extends AppCompatActivity {
private ProgressBar Progressbar;
private int progress;
    Handler mHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        mHandler = new Handler();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                for(progress=20;progress<=100;progress= progress+20){
                    try {

                        Progressbar.setProgress(progress);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                Intent intent = new Intent(SplashScreen.this,login.class);
                startActivity(intent);
                finish();
            }
        },4000);//Timer you can change time here example-1 sec=1000
    }



}