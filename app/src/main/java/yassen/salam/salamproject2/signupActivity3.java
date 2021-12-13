package yassen.salam.salamproject2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

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

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
              validate();
            }
        });
    }

    private void validate()
    {
        boolean isOk=true;
        String email = etEmail.getText().toString();
        String password = etPassword.getText().toString();
        String rePassword = etREpassword.getText().toString();
        String phone = etPhone.getText().toString();
        String fullName = etFullName.getText().toString();

        if(email.length()<5 || email.indexOf('@')<=0)
        {
            etEmail.setError("wrong email syntax");
            isOk=false;
        }
        if(password.length()<8)
        {
            etPassword.setError("at least 8");
            isOk=false;
        }
        if(password.equals(rePassword)==false)
        {
            etPassword.setError("not equal passwords");
            isOk=false;
        }
        if(fullName.length()==0)
        {
            etFullName.setError("must to enter full name");
            isOk=false;
        }
        if(isOk)
        {
            CreateAccount(email,password);
        }
    }

    private void CreateAccount(String email, String password)
    {
        FirebaseAuth auth=FirebaseAuth.getInstance();
        //request                                                 //wait for response
        auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            //response handler
            @Override
            public void onComplete(@NonNull Task<AuthResult> task)
            {
              if (task.isSuccessful()==true)
              {
                  finish();
                  startActivity(new Intent(getApplicationContext(),MainActivity.class));
              }
              else
              {
                  //dialog
                  Toast.makeText(getApplicationContext(), "error create account"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
              }
            }
        });
    }
}
