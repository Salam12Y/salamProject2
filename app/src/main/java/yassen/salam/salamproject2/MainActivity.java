package yassen.salam.salamproject2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
                                                //1. listener
public class MainActivity extends AppCompatActivity implements DialogInterface.OnClickListener
       {
    private SearchView svSearchView;
    private ListView lstvAllTasks;
    private FloatingActionButton FAbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        svSearchView = findViewById(R.id.svSearchView);
        lstvAllTasks = findViewById(R.id.lstvAllTasks);
        FAbtn = findViewById(R.id.FAbtn);

    }
    //1. build menu xml
    //2. to add menu (3 points right-top corner)the current activity
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    //3.select item event handler
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {

        if (item.getItemId() == R.id.mnItmSettings)
        {
            Intent i = new Intent(getApplicationContext(), SettingActivity3.class);
            startActivity(i);
        }
        if (item.getItemId() == R.id.mnItmSignOut)
        {
            Intent i = new Intent(getApplicationContext(), signupActivity3.class);
            startActivity(i);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Are you sure?");
            builder.setCancelable(true);
            // listener
            builder.setPositiveButton("yes", this);
            builder.setNegativeButton("no", this);
            AlertDialog dialog = builder.create();
            dialog.show();

        }
        if (item.getItemId() == R.id.mnItmHistory)
        {
            Intent i = new Intent(getApplicationContext(), HistoryActivity.class);
            startActivity(i);

        }
        return true;
    }
    // listener 2.implement methods

      /**
        * event handler
        *
        * @param dialog the active dialog
        * @param which  the button id which cause the event
        */
          @Override
          public void onClick(DialogInterface dialog, int which)
          {
              // 4. react for each action
              if (which == dialog.BUTTON_POSITIVE)
              {
                  Toast.makeText(getApplicationContext(), "Loging out", Toast.LENGTH_SHORT).show();
                  dialog.cancel();
                  finish();// To close current activity
              }
              if (which == dialog.BUTTON_NEGATIVE) { Toast.makeText(getApplicationContext(), "Loging out cancle", Toast.LENGTH_SHORT).show();
              dialog.cancel();
              }
          }
}





