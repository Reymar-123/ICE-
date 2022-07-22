package com.example.ice;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ice.R;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editLogEmail, editLogPassword;
    Button loginbutton, adminbutton;
    TextView registerbutton;
    FirebaseAuth mAuth;

    GoogleSignInOptions gso;
    GoogleSignInClient gsc;
    ImageView gbtn, fbbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        loginbutton = (Button) findViewById(R.id.loginbutton);
        loginbutton.setOnClickListener(this);

        adminbutton = (Button) findViewById(R.id.adminbutton);
        adminbutton.setOnClickListener(this);


        registerbutton = (TextView) findViewById(R.id.registerbutton);
        registerbutton.setOnClickListener(this);

        editLogEmail = (EditText) findViewById(R.id.loginemail);
        editLogPassword = (EditText) findViewById(R.id.loginpassword);

        mAuth = FirebaseAuth.getInstance();

        gbtn = findViewById(R.id.googlesignin);

        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        gsc =  GoogleSignIn.getClient(this, gso);

        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
        if(acct!= null){
            navigateToDashboard();
        }


        gbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signIn();
            }
        });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.registerbutton:
                startActivity(new Intent(this, register.class));
                break;
            case R.id.loginbutton:
                loginbutton();
                break;

            case R.id.adminbutton:

                startActivity(new Intent(MainActivity.this, admin_login.class));
                break;

        }

    }

    private void loginbutton() {

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

                    Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, dashboard.class));


                }
                else{

                    Toast.makeText(MainActivity.this, "Failed to Log In. Please try again", Toast.LENGTH_SHORT).show();


                }

            }
        });
    }

    // Google Sign In

    void signIn(){

        Intent signInIntent = gsc.getSignInIntent();
        startActivityForResult(signInIntent, 1000);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1000){
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);

            try {
                task.getResult(ApiException.class);
                navigateToDashboard();
            }catch (ApiException e){
                Toast.makeText(getApplicationContext(), "Something went wrong", Toast.LENGTH_SHORT).show();
            }
        }

    }

    void navigateToDashboard(){
        finish();
        Intent intent = new Intent(MainActivity.this, dashboard.class);
        startActivity(intent);
        Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_SHORT).show();
    }


}