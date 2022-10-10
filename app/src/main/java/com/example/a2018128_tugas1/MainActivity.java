package com.example.a2018128_tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void biodata(View view) {
        Intent i = new Intent(MainActivity.this, Biodata.class);
        startActivity(i);
    }

    public void segitiga(View view) {
        Intent i = new Intent(MainActivity.this, Segitiga.class);
        startActivity(i);
    }
}