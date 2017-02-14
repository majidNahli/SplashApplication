package ma.co.majid.splashapplication.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import ma.co.majid.splashapplication.R;

/**
 * Created by Majid on 14/02/2017.
 */

public class SplashActivity extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGTH = 4000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {

                // TODO  Create an Intent that will start the MainActivity if user is connected or send it in LoginActivity.

                Intent filterIntent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(filterIntent);
                finish();
            }
        }, SPLASH_DISPLAY_LENGTH);

    }
}
