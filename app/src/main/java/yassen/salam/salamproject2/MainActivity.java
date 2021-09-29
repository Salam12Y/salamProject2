package yassen.salam.salamproject2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Bundle;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private SearchView svSearchView;
    private ListView lstvAllTasks;
    private FloatingActionButton FAbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        svSearchView = findViewById(R.id.svSearchView);
        lstvAllTasks = findViewById(R.id.lstvAllTasks);
        FAbtn = findViewById(R.id.FAbtn);

    }
}