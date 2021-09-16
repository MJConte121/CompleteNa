package com.example.last;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Earthquake extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earthquake);

    }


    public void kat(View view) {
        if (view.getId() == R.id.btn_c1) {

            Intent intent = new Intent(Earthquake.this, DropCoverHoldon.class);
            startActivity(intent);

        } else if (view.getId() == R.id.btn_c2) {

            Intent intent1 = new Intent(Earthquake.this, OutsideCar.class);
            startActivity(intent1);

        } else if (view.getId() == R.id.btn_c3) {

            Intent intent2 = new Intent(Earthquake.this, AfterEarthquake.class);
            startActivity(intent2);
        }
    }
}





