package yassen.salam.salamproject2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class AddTaskActivity extends AppCompatActivity {
    private TextInputEditText etTitle,etSubject;
    private TextView tvImportant;
    private Spinner SpnNecc;
    private SeekBar SbImportant;
    private ImageView imageView2;
    private Button btnSave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        etTitle = findViewById(R.id.etTitle);
        etSubject = findViewById(R.id.etSubject);
        tvImportant= findViewById(R.id.tvImportant);
        SpnNecc = findViewById(R.id.SpnNecc);
        SbImportant = findViewById(R.id.SbImportant);
        imageView2= findViewById(R.id.imageView2);
        btnSave= findViewById(R.id.btnSave);
    }
}