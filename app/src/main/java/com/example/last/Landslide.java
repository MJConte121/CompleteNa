package com.example.last;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Landslide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landslide);
    }

    public void kath(View view) {
        if (view.getId() == R.id.btn_c1) {

            Intent intent = new Intent(Landslide.this, Before_Landslide.class);
            startActivity(intent);
        }
        else if (view.getId() == R.id.btn_c2) {

            Intent intent1 = new Intent(Landslide.this, During_Landslide.class);
            startActivity(intent1);
        }
        else if (view.getId() == R.id.btn_c3) {

            Intent intent2 = new Intent(Landslide.this, After_Landslide.class);
            startActivity(intent2);
        }
    }
}