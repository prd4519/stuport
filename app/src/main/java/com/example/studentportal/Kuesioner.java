package com.example.studentportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kuesioner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuesioner);
        Button button = (Button) findViewById(R.id.evaluasiDos);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Kuesioner.this,EvaluasiDosen.class);
                startActivity(intent);
            }
        });

        Button button1 = (Button) findViewById(R.id.visiMisi);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Kuesioner.this,VisiMisi.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.layanan);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Kuesioner.this,LayananKemahasiswaan.class);
                startActivity(intent);
            }
        });

    }
}