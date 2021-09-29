package yassen.salam.salamproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class SplashScreenActivity extends AppCompatActivity {
    private ImageView imViewPhoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        imViewPhoto = findViewById(R.id.imViewPhoto);
    }
}