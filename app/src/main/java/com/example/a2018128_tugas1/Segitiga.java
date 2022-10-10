package com.example.a2018128_tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Segitiga extends AppCompatActivity {

    EditText input_tinggi, input_alas, input_hasil;
    Button btn_hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);
        input_alas = findViewById(R.id.input_alas);
        input_tinggi = findViewById(R.id.input_tinggi);
        btn_hasil = findViewById(R.id.btn_hasil);
        input_hasil = findViewById(R.id.input_hasil);
        btn_hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input_alas.length() == 0 || input_tinggi.length() == 0) {
                    Toast.makeText(getApplication(), "Alas dan Tinggi tidak boleh kosong",
                            Toast.LENGTH_SHORT).show();
                } else {
                    double alas = Double.parseDouble(input_alas.getText().toString());
                    double tinggi = Double.parseDouble(input_tinggi.getText().toString());
                    double hasil = LuasSegitiga(alas, tinggi);
                    String hsl = String.valueOf(hasil);
                    input_hasil.setText(hsl);
                }
            }
        });
    }

    double LuasSegitiga(double input_alas, double input_tinggi) {
        return input_alas * input_tinggi / 2;
    }

}