package yassen.salam.salamproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class SettingActivity3 extends AppCompatActivity {
    private TextView tvSignIn;
    private ToggleButton TbtnSignIN;
    private Button btnSignOut;
    private RadioGroup rGroup;
    private RadioButton RbtnDelete;
    private RadioButton rbtnCross;
    private RadioButton rbtnMove;
    private Switch swkeepHistory;
    private Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting3);

        tvSignIn = findViewById(R.id.tvSignIn);
        TbtnSignIN= findViewById(R.id.TbtnSignIN);
        btnSignOut= findViewById(R.id.btnSignOut);
        rGroup = findViewById(R.id. rGroup);
        RbtnDelete = findViewById(R.id.RbtnDelete);
        rbtnCross= findViewById(R.id.rbtnCross);
        rbtnMove= findViewById(R.id.rbtnMove);
        swkeepHistory = findViewById(R.id. swkeepHistory);
        btnClear= findViewById(R.id.btnClear);

    }
}