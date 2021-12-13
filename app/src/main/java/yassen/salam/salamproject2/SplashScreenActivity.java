package yassen.salam.salamproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;

/**
 *
 */
public class SplashScreenActivity extends AppCompatActivity
{
    private ImageView imViewPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        //Thread 1.
        Thread th=new Thread(){
            //Thread 2.
            @Override
            public void run() {
                // هنا المقطع الذي سيعمل بالتزامن مع مقاطع اخرى
                //Thread 3.
                int ms=3*1000;//miiliseconds
                try {
                    sleep(ms);
                    //  فحص هل تم الدخول مسبقا
                    FirebaseAuth auth=FirebaseAuth.getInstance();
                    if(auth.getCurrentUser()!=null)
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    else
                        {
                        startActivity(new Intent(getApplicationContext(),signinActivity3.class));
                    }

                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };
        // Thread 4.
        th.start();
        imViewPhoto = findViewById(R.id.imViewPhoto);
    }
}