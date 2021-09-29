package yassen.salam.salamproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class signupActivity3 extends AppCompatActivity {
    private TextInputEditText etEmail, etPassword,etREpassword,etPhone,etFullName;
    private Button btnSave;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup3);

        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etREpassword= findViewById(R.id.etREpassword);
        etPhone = findViewById(R.id.etPhone);
        etFullName = findViewById(R.id.etFullName);
       btnSave= findViewById(R.id.btnSave);


    }
}