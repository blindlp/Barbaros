package gt.com.irc.barbaros.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

import gt.com.irc.barbaros.R;

public class SplashActivity extends AppCompatActivity {

    static final long SCREEN_DELAY = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        // capturamos cualquier evento de error para esconder la barra
        try {
            getSupportActionBar().hide();
        } catch (Exception e) {
            Log.e("ActionBarr", e.toString());
        }


        // declaramos el evento timer
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Intent cambiar = new Intent(getApplicationContext(), MainMenuActivity.class);
                startActivity(cambiar);
                finish();
            }
        }, SCREEN_DELAY);

    }
}
