package com.example.ice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class admin_login extends AppCompatActivity implements View.OnClickListener {

    EditText editLogEmail, editLogPassword;
    Button adminlog;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        getSupportActionBar().hide();

        adminlog = (Button) findViewById(R.id.adminlogin);
        adminlog.setOnClickListener(this);

        editLogEmail = (EditText) findViewById(R.id.loginemail);
        editLogPassword = (EditText) findViewById(R.id.loginpassword);

        mAuth = FirebaseAuth.getInstance();
    }

    @Override
    public void onClick(View view) {

        String email = editLogEmail.getText().toString().trim();
        String password = editLogPassword.getText().toString().trim();

        if (email.isEmpty()){
            editLogEmail.setError("Email Address is Required");
            editLogEmail.requestFocus();
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            editLogEmail.setError("Please enter a valid Email Address");
            editLogEmail.requestFocus();
            return;
        }


        if (password.isEmpty()){
            editLogPassword.setError("Password is Required");
            editLogPassword.requestFocus();
            return;
        }

        if (password.length()>8){
            editLogPassword.setError("Password is maximum of 8 Characters");
            editLogPassword.requestFocus();
            return;
        }

        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if (task.isSuccessful()){

                    Toast.makeText(admin_login.this, "Welcome Admin", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(admin_login.this, admin_dashboard.class));


                }
                else{

                    Toast.makeText(admin_login.this, "Failed to Log In. Please try again", Toast.LENGTH_SHORT).show();


                }

            }
        });

    }
}