package com.example.studentportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Wisuda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisuda);
        Button button = (Button) findViewById(R.id.daftarWisuda);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Wisuda.this,DaftarWisuda.class);
                startActivity(intent);
            }
        });

        Button button1 = (Button) findViewById(R.id.magang);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Wisuda.this,Magang.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.prestasi);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Wisuda.this,Prestasi.class);
                startActivity(intent);
            }
        });

        Button button3 = (Button) findViewById(R.id.keterampilan);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Wisuda.this,Keterampilan.class);
                startActivity(intent);
            }
        });

        Button button4 = (Button) findViewById(R.id.organisasi);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Wisuda.this,Organisasi.class);
                startActivity(intent);
            }
        });

        Button button5 = (Button) findViewById(R.id.bhsinternasional);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Wisuda.this,BahasaInternasional.class);
                startActivity(intent);
            }
        });

        Button button6 = (Button) findViewById(R.id.pernyataan);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Wisuda.this,Pernyataan.class);
                startActivity(intent);
            }
        });

    }
}