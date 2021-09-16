package com.example.last;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Typhoon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typhoon);
    }

    public void kat(View view) {
        if (view.getId() == R.id.btn_c1) {

            Intent intent = new Intent(Typhoon.this, Before_Typhoon.class);
            startActivity(intent);
        }
        else if (view.getId() == R.id.btn_c2) {

            Intent intent1 = new Intent(Typhoon.this, During_Typhoon.class);
            startActivity(intent1);
        }
        else if (view.getId() == R.id.btn_c3) {

            Intent intent2 = new Intent(Typhoon.this, After_Typhoon.class);
            startActivity(intent2);
        }
    }
}