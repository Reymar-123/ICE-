package com.example.ice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class pnp extends AppCompatActivity {

    TextView alcalacontact, bautistacontact, binalonancontact, laoaccontact, pozorrubiocontact, santotomascontact, sisoncontact, urdanetacontact, villasiscontact;
    AlertDialog dialog1, dialog2, dialog3, dialog4, dialog5, dialog6, dialog7, dialog8, dialog9;
    EditText editText1, editText2, editText3, editText4, editText5, editText6, editText7, editText8, editText9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pnp_station);

        //Toolbar Options
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("PNP Station");

        // Action Bar
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        alcalacontact = (TextView) findViewById(R.id.alcalacontact);
        bautistacontact = (TextView) findViewById(R.id.bautistacontact);
        binalonancontact = (TextView) findViewById(R.id.binalonancontact);
        laoaccontact = (TextView) findViewById(R.id.laoaccontact);
        pozorrubiocontact = (TextView) findViewById(R.id.pozorrubiocontact);
        santotomascontact = (TextView) findViewById(R.id.santotomascontact);
        sisoncontact = (TextView) findViewById(R.id.sisoncontact);
        urdanetacontact = (TextView) findViewById(R.id.urdanetacontact);
        villasiscontact = (TextView) findViewById(R.id.villasiscontact);

        dialog1 = new AlertDialog.Builder(this).create();
        editText1 = new EditText(this);

        //---------//

        dialog1.setTitle("Edit contact");
        dialog1.setView(editText1);

        dialog1.setButton(DialogInterface.BUTTON_POSITIVE, "Save", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                alcalacontact.setText(editText1.getText());


            }
        });

        alcalacontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText1.setText(alcalacontact.getText());
                dialog1.show();
            }
        });

        //---------//

        dialog2 = new AlertDialog.Builder(this).create();
        editText2 = new EditText(this);

        dialog2.setTitle("Edit contact");
        dialog2.setView(editText2);

        dialog2.setButton(DialogInterface.BUTTON_POSITIVE, "Save", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                bautistacontact.setText(editText2.getText());


            }
        });

        bautistacontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText2.setText(bautistacontact.getText());
                dialog2.show();
            }
        });

        //---------//

        dialog3 = new AlertDialog.Builder(this).create();
        editText3 = new EditText(this);

        dialog3.setTitle("Edit contact");
        dialog3.setView(editText3);

        dialog3.setButton(DialogInterface.BUTTON_POSITIVE, "Save", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                binalonancontact.setText(editText3.getText());


            }
        });

        binalonancontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText3.setText(binalonancontact.getText());
                dialog3.show();
            }
        });

        //---------//

        dialog4 = new AlertDialog.Builder(this).create();
        editText4 = new EditText(this);

        dialog4.setTitle("Edit contact");
        dialog4.setView(editText4);

        dialog4.setButton(DialogInterface.BUTTON_POSITIVE, "Save", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                laoaccontact.setText(editText4.getText());


            }
        });

        laoaccontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText4.setText(laoaccontact.getText());
                dialog4.show();
            }
        });

        //---------//

        dialog5 = new AlertDialog.Builder(this).create();
        editText5 = new EditText(this);

        dialog5.setTitle("Edit contact");
        dialog5.setView(editText5);

        dialog5.setButton(DialogInterface.BUTTON_POSITIVE, "Save", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                pozorrubiocontact.setText(editText5.getText());


            }
        });

        pozorrubiocontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText5.setText(pozorrubiocontact.getText());
                dialog5.show();
            }
        });

        //---------//

        dialog6 = new AlertDialog.Builder(this).create();
        editText6 = new EditText(this);

        dialog6.setTitle("Edit contact");
        dialog6.setView(editText6);

        dialog6.setButton(DialogInterface.BUTTON_POSITIVE, "Save", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                santotomascontact.setText(editText6.getText());


            }
        });

        santotomascontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText6.setText(santotomascontact.getText());
                dialog6.show();
            }
        });

        //---------//

        dialog7 = new AlertDialog.Builder(this).create();
        editText7 = new EditText(this);

        dialog7.setTitle("Edit contact");
        dialog7.setView(editText7);

        dialog7.setButton(DialogInterface.BUTTON_POSITIVE, "Save", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                sisoncontact.setText(editText7.getText());


            }
        });

        sisoncontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText7.setText(sisoncontact.getText());
                dialog7.show();
            }
        });

        //---------//

        dialog8 = new AlertDialog.Builder(this).create();
        editText8 = new EditText(this);

        dialog8.setTitle("Edit contact");
        dialog8.setView(editText8);

        dialog8.setButton(DialogInterface.BUTTON_POSITIVE, "Save", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                urdanetacontact.setText(editText8.getText());


            }
        });

        urdanetacontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText8.setText(urdanetacontact.getText());
                dialog8.show();
            }
        });

        //---------//

        dialog9 = new AlertDialog.Builder(this).create();
        editText9 = new EditText(this);

        dialog9.setTitle("Edit contact");
        dialog9.setView(editText9);

        dialog9.setButton(DialogInterface.BUTTON_POSITIVE, "Save", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                villasiscontact.setText(editText9.getText());


            }
        });

        villasiscontact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editText9.setText(villasiscontact.getText());
                dialog9.show();
            }
        });

        //---------//



    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}