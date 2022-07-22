package com.example.ice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.ice.MainActivity;
import com.example.ice.R;
import com.example.ice.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class register extends AppCompatActivity implements View.OnClickListener {

    EditText editUsername, editEmail, editPassword;
    Button signupbutton;

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        getSupportActionBar().hide();

        mAuth = FirebaseAuth.getInstance();

        signupbutton = (Button) findViewById(R.id.signupbutton);
        signupbutton.setOnClickListener(this);

        editUsername = (EditText) findViewById(R.id.regusername);
        editEmail = (EditText) findViewById(R.id.regemail);
        editPassword = (EditText) findViewById(R.id.regpassword);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.signupbutton:
                signupbutton();
                break;
        }

    }

    private void signupbutton() {

        String name = editUsername.getText().toString().trim();
        String email = editEmail.getText().toString().trim();
        String password = editPassword.getText().toString().trim();

        if (name.isEmpty()){
            editUsername.setError("Name is Required");
            editUsername.requestFocus();
            return;
        }
        if (!name.matches("[a-z,A-Z, .]*")){
            editUsername.setError("Enter Characters Only");
            editUsername.requestFocus();
            return;
        }

        if (email.isEmpty()){
            editEmail.setError("Email Address is Required");
            editEmail.requestFocus();
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            editEmail.setError("Please enter a valid Email Address");
            editEmail.requestFocus();
            return;
        }


        if (password.isEmpty()){
            editPassword.setError("Password is Required");
            editPassword.requestFocus();
            return;
        }
        if (password.length()>8){
            editPassword.setError("Password is maximum of 8 Characters");
            editPassword.requestFocus();
            return;
        }

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()) {

                            User user = new User(name, email);

                            FirebaseDatabase.getInstance().getReference("Users")
                                    .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                    .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {

                                    if (task.isSuccessful()){

                                        Toast.makeText(register.this, "User has been Registered Successfully", Toast.LENGTH_SHORT).show();
                                        startActivity(new Intent(register.this, MainActivity.class));

                                    }
                                    else{
                                        Toast.makeText(register.this, "Registration Failed. Please try again", Toast.LENGTH_SHORT).show();


                                    }


                                }
                            });

                        }
                        else{

                            Toast.makeText(register.this, "Registration Failed. Please try again", Toast.LENGTH_SHORT).show();



                        }
                    }
                });

















    }
}