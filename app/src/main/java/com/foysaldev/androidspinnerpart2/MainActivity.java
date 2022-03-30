package com.foysaldev.androidspinnerpart2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String [] mymensinghdistrict;
    private String [] population;
    private Spinner spinner;
    private int [] upazila;
    private boolean firstTime = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] upazila = {R.drawable.bhaluka, R.drawable.trishal, R.drawable.haluaghat,
        R.drawable.muktagacha, R.drawable.dhobaura, R.drawable.fulbaria, R.drawable.gaffargaon, R.drawable.gauripur,
        R.drawable.ishwarganj, R.drawable.mymensingh_sadar, R.drawable.nandail, R.drawable.
        phulpur, R.drawable.tarakhanda};

        mymensinghdistrict = getResources().getStringArray(R.array.mymensingh_district);
        population = getResources().getStringArray(R.array.population);

        spinner = findViewById(R.id.SpinnerId);
        CustomAdapter customAdapter = new CustomAdapter(this,upazila,mymensinghdistrict,population);
        spinner.setAdapter(customAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (firstTime == true) {
                    firstTime = false;
                } else {
                    Toast.makeText(MainActivity.this, mymensinghdistrict[i]+"is Selected", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}