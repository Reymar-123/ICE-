package com.example.ice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class dashboard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    NavigationView nav_view;

    SliderView sliderView;
    int[] images = {R.drawable.cover1, R.drawable.cover2, R.drawable.cover3};

    ImageView alcala, bautista, binalonan, laoac, pozorrubio, santotomas, sison, urdaneta, villasis,
            pnp, bfp, redcross, pdrrmo, website, about;

    FloatingActionButton callbtn;

    GoogleSignInOptions gso;
    GoogleSignInClient gsc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");

        drawerLayout = findViewById(R.id.drawer);
        nav_view = findViewById(R.id.nav_view);
        nav_view.setNavigationItemSelectedListener(this);

        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        drawerLayout.addDrawerListener(toggle);
        toggle.setDrawerIndicatorEnabled(true);
        toggle.syncState();

        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();

        //List of Stations
        alcala = (ImageView) findViewById(R.id.alcalaicon);
        bautista = (ImageView) findViewById(R.id.bautistaicon);
        binalonan = (ImageView) findViewById(R.id.binalonanicon);
        laoac = (ImageView) findViewById(R.id.laoacicon);
        pozorrubio = (ImageView) findViewById(R.id.pozorrubioicon);
        santotomas = (ImageView) findViewById(R.id.santotomasicon);
        sison = (ImageView) findViewById(R.id.sisonicon);
        urdaneta = (ImageView) findViewById(R.id.urdanetaicon);
        villasis = (ImageView) findViewById(R.id.villasisicon);

        //Agencies
        pnp = (ImageView) findViewById(R.id.pnp);
        bfp = (ImageView) findViewById(R.id.bfp);
        redcross = (ImageView) findViewById(R.id.redcross);
        pdrrmo = (ImageView) findViewById(R.id.pdrrmo);
        website = (ImageView) findViewById(R.id.visit_website);
        about = (ImageView) findViewById(R.id.about_us);

        //Floating Action Button
        callbtn = (FloatingActionButton) findViewById(R.id.call_btn);

        //List of Stations
        alcala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, alcala_station.class);
                startActivity(intent);
            }
        });

        bautista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, bautista_station.class);
                startActivity(intent);
            }
        });

        binalonan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, binalonan_station.class);
                startActivity(intent);
            }
        });

        laoac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, laoac_station.class);
                startActivity(intent);
            }
        });

        pozorrubio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, pozorrubio_station.class);
                startActivity(intent);
            }
        });

        santotomas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, santo_tomas_station.class);
                startActivity(intent);
            }
        });

        sison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, sison_station.class);
                startActivity(intent);
            }
        });

        urdaneta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, urdaneta_station.class);
                startActivity(intent);
            }
        });

        villasis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, villasis_station.class);
                startActivity(intent);
            }
        });

        //Agencies
        pnp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, pnp_station.class);
                startActivity(intent);
            }
        });

        bfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, bfp_station.class);
                startActivity(intent);
            }
        });

        redcross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, redcross_station.class);
                startActivity(intent);
            }
        });

        pdrrmo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, call_mdrrmc.class);
                startActivity(intent);
            }
        });

        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent websiteIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://villasis.gov.ph/blog/villasis-mdrrmc-bags-regional-of-gawad-kalasag/"));
                startActivity(websiteIntent);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dashboard.this, about.class);
                startActivity(intent);
            }
        });

        callbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:09234567313" ));
                startActivity(intent);
            }
        });

        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        gsc =  GoogleSignIn.getClient(this, gso);

        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){

            case R.id.call:
                startActivity(new Intent(this, call_mdrrmc.class));
                break;

            case R.id.visit:
                startActivity(new Intent(this, visit_mdrrmc.class));
                break;

            case R.id.website:
                Intent websiteIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://villasis.gov.ph/blog/villasis-mdrrmc-bags-regional-of-gawad-kalasag/"));
                startActivity(websiteIntent);
                break;
            case R.id.logout:
                gsc.signOut().addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        finish();
                        startActivity(new Intent(dashboard.this, MainActivity.class));
                        Toast.makeText(dashboard.this, "Successfully Logout", Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            default:
                Toast.makeText(this, "Coming Soon.", Toast.LENGTH_SHORT).show();
        }
        return false;


    }
}