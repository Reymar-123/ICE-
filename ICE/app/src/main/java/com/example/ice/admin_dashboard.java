package com.example.ice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class admin_dashboard extends AppCompatActivity {

    ImageView listofstation, pnp, bfp, pdrrmo, redcross;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);

        //Toolbar Options
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Admin Panel");

        listofstation = (ImageView) findViewById(R.id.listofstation);
        pnp = (ImageView) findViewById(R.id.pnp);
        bfp = (ImageView) findViewById(R.id.bfp);
        pdrrmo = (ImageView) findViewById(R.id.pdrrmo);
        redcross = (ImageView) findViewById(R.id.redcross);

        listofstation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(admin_dashboard.this, list_of_station.class));
            }
        });

        pnp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(admin_dashboard.this, pnp.class));
            }
        });

        bfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(admin_dashboard.this, bfp.class));
            }
        });

        pdrrmo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(admin_dashboard.this, pdrrmo.class));
            }
        });

        redcross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(admin_dashboard.this, redcross.class));
            }
        });



    }
}