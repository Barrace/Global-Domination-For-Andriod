package com.barrace.globaldomination.feature.splash;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.barrace.globaldomination.R;
import com.barrace.globaldomination.feature.about.AboutActivity;
import com.barrace.globaldomination.feature.play.PlayActivity;
import com.barrace.globaldomination.feature.settings.SettingsActivity;

public class SplashActivity extends AppCompatActivity {

    Button playBtn;
    Button settingsBtn;
    Button aboutBtn;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        // binds layout to activity
        setContentView(R.layout.activity_splash);

        // bind views to ids in layout
        playBtn = findViewById(R.id.playBtn);
        settingsBtn = findViewById(R.id.settingsBtn);
        aboutBtn = findViewById(R.id.aboutBtn);
    }

    @Override
    protected void onStart() {
        super.onStart();

        // listen for events once activity is brought to foreground
        playBtn.setOnClickListener(v -> goTo(PlayActivity.class));
        settingsBtn.setOnClickListener(v -> goTo(SettingsActivity.class));
        aboutBtn.setOnClickListener(v -> goTo(AboutActivity.class));

    }

    // helper method
    private void goTo(Class activityClass) {

        // create intent for next activity
        Intent intent = new Intent(this, activityClass);

        // start next activity using intent
        startActivity(intent);

    }

}
