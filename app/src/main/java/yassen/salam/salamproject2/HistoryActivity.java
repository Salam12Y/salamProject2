package yassen.salam.salamproject2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Bundle;
import android.widget.ListView;

public class HistoryActivity extends AppCompatActivity {
    private SearchView SerView;
    private ListView lisView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        SerView = findViewById(R.id.SerView);
        lisView = findViewById(R.id.lisView);
    }
}