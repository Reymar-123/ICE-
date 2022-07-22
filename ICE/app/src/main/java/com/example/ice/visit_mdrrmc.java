package com.example.ice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class visit_mdrrmc extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap mapAPI;
    SupportMapFragment mapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visit_mdrrmc);

        mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapAPI);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

        mapAPI = googleMap;

        LatLng Alcala = new LatLng(15.848838077612536, 120.52145192739094);
        mapAPI.addMarker(new MarkerOptions().position(Alcala).title("Alcala Station"));
        mapAPI.animateCamera(CameraUpdateFactory.newLatLngZoom(Alcala,11), 5000, null);

        LatLng Bautista = new LatLng(15.809877456711401, 120.47558233794445);
        mapAPI.addMarker(new MarkerOptions().position(Bautista).title("Bautista Station"));
        mapAPI.animateCamera(CameraUpdateFactory.newLatLngZoom(Bautista,11), 5000, null);

        LatLng Binalonan = new LatLng(16.05081628251749, 120.59089684357858);
        mapAPI.addMarker(new MarkerOptions().position(Binalonan).title("Binalonan Station"));
        mapAPI.animateCamera(CameraUpdateFactory.newLatLngZoom(Binalonan,11), 5000, null);

        LatLng Laoac = new LatLng(16.05296342781018, 120.54559002265889);
        mapAPI.addMarker(new MarkerOptions().position(Laoac).title("Laoac Station"));
        mapAPI.animateCamera(CameraUpdateFactory.newLatLngZoom(Laoac,11), 5000, null);

        LatLng Pozorrubio = new LatLng(16.110064207133842, 120.54513105329497);
        mapAPI.addMarker(new MarkerOptions().position(Pozorrubio).title("Pozorrubio Station"));
        mapAPI.animateCamera(CameraUpdateFactory.newLatLngZoom(Pozorrubio,11), 5000, null);

        LatLng SantoTomas = new LatLng(15.870712140035863, 120.5758641497201);
        mapAPI.addMarker(new MarkerOptions().position(SantoTomas).title("SantoTomas Station"));
        mapAPI.animateCamera(CameraUpdateFactory.newLatLngZoom(SantoTomas,11), 5000, null);

        LatLng Sison = new LatLng(16.19105239546084, 120.5105035603669);
        mapAPI.addMarker(new MarkerOptions().position(Sison).title("Sison Station"));
        mapAPI.animateCamera(CameraUpdateFactory.newLatLngZoom(Sison,11), 5000, null);

        LatLng Urdaneta = new LatLng(15.991436306366143, 120.56316789884963);
        mapAPI.addMarker(new MarkerOptions().position(Urdaneta).title("Urdaneta Station"));
        mapAPI.animateCamera(CameraUpdateFactory.newLatLngZoom(Urdaneta,11), 5000, null);

        LatLng Villasis = new LatLng(15.914380540045215, 120.57741540505013);
        mapAPI.addMarker(new MarkerOptions().position(Villasis).title("Villasis Station"));
        mapAPI.animateCamera(CameraUpdateFactory.newLatLngZoom(Villasis,11), 5000, null);

    }
}