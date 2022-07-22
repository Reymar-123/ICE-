package com.example.ice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class call_mdrrmc extends AppCompatActivity implements View.OnClickListener {

    TextView alcalanum, bautistanum, binalonannum, laoacnum, pozorrubionum, santotomasnum, sisonnum, urdanetanum, villasisnum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_mdrrmc);

        //Toolbar Options
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("MDRRMC Station");

        // Action Bar
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        alcalanum = findViewById(R.id.alcalacontact);
         bautistanum = findViewById(R.id.bautistacontact);
        binalonannum = findViewById(R.id.binalonancontact);
        laoacnum = findViewById(R.id.laoaccontact);
        pozorrubionum = findViewById(R.id.pozorrubiocontact);
        santotomasnum = findViewById(R.id.santotomascontact);
        sisonnum = findViewById(R.id.sisoncontact);
        urdanetanum = findViewById(R.id.urdanetacontact);
        villasisnum = findViewById(R.id.villasiscontact);

        //final TextView alcalanum = (TextView) findViewById(R.id.alcalacontact);

       // alcalanum.setText(getIntent().getExtras().getString("number"));

        Button button1 = findViewById(R.id.alcalabutton);
        Button button2 = findViewById(R.id.bautistabutton);
        Button button3 = findViewById(R.id.binalonanbutton);
        Button button4 = findViewById(R.id.laoacbutton);
        Button button5 = findViewById(R.id.pozorrubiobutton);
        Button button6 = findViewById(R.id.santotomasbutton);
        Button button7 = findViewById(R.id.sisonbutton);
        Button button8 = findViewById(R.id.urdanetabutton);
        Button button9 = findViewById(R.id.villasisbutton);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);




    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.alcalabutton:
                String alcalanumber = alcalanum.getText().toString();
                Intent intent1 = new Intent(Intent.ACTION_DIAL);
                intent1.setData(Uri.parse("tel:"+alcalanumber ));
                startActivity(intent1);
                break;

            case R.id.bautistabutton:
                String bautistanumber = bautistanum.getText().toString();
                Intent intent2 = new Intent(Intent.ACTION_DIAL);
                intent2.setData(Uri.parse("tel:"+bautistanumber ));
                startActivity(intent2);
                break;

            case R.id.binalonanbutton:
                String binalonannumber = binalonannum.getText().toString();
                Intent intent3 = new Intent(Intent.ACTION_DIAL);
                intent3.setData(Uri.parse("tel:"+binalonannumber ));
                startActivity(intent3);
                break;

            case R.id.laoacbutton:
                String laoacnumber = laoacnum.getText().toString();
                Intent intent4 = new Intent(Intent.ACTION_DIAL);
                intent4.setData(Uri.parse("tel:"+laoacnumber ));
                startActivity(intent4);
                break;

            case R.id.pozorrubiobutton:
                String pozorrubionumber = pozorrubionum.getText().toString();
                Intent intent5 = new Intent(Intent.ACTION_DIAL);
                intent5.setData(Uri.parse("tel:"+pozorrubionumber ));
                startActivity(intent5);
                break;

            case R.id.santotomasbutton:
                String santotomasnumber = santotomasnum.getText().toString();
                Intent intent6 = new Intent(Intent.ACTION_DIAL);
                intent6.setData(Uri.parse("tel:"+santotomasnumber ));
                startActivity(intent6);
                break;

            case R.id.sisonbutton:
                String sisonnumber = sisonnum.getText().toString();
                Intent intent7 = new Intent(Intent.ACTION_DIAL);
                intent7.setData(Uri.parse("tel:"+sisonnumber ));
                startActivity(intent7);
                break;

            case R.id.urdanetabutton:
                String urdanetanumber = urdanetanum.getText().toString();
                Intent intent8 = new Intent(Intent.ACTION_DIAL);
                intent8.setData(Uri.parse("tel:"+urdanetanumber ));
                startActivity(intent8);
                break;

            case R.id.villasisbutton:
                String villasisnumber = villasisnum.getText().toString();
                Intent intent9 = new Intent(Intent.ACTION_DIAL);
                intent9.setData(Uri.parse("tel:"+villasisnumber ));
                startActivity(intent9);
                break;
        }

    }
}