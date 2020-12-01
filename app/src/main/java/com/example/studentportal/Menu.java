package com.example.studentportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ImageButton button = (ImageButton)findViewById(R.id.profil);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,Profil.class);
                startActivity(intent);
            }
        });

        ImageButton button7 = (ImageButton)findViewById(R.id.pengumuman);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,Pengumuman.class);
                startActivity(intent);
            }
        });

        ImageButton button1 = (ImageButton)findViewById(R.id.kuliah);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,Kuliah.class);
                startActivity(intent);
            }
        });

        ImageButton button2 = (ImageButton)findViewById(R.id.wisuda);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Menu.this,Wisuda.class);
                startActivity(intent2);
            }
        });

        ImageButton button3 = (ImageButton)findViewById(R.id.kuesioner);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Menu.this,Kuesioner.class);
                startActivity(intent3);
            }
        });

        ImageButton button4 = (ImageButton)findViewById(R.id.daftarUlang);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(Menu.this,DaftarUlang.class);
                startActivity(intent4);
            }
        });

        ImageButton button5 = (ImageButton)findViewById(R.id.setting);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Menu.this,Setting.class);
                startActivity(intent3);
            }
        });

        ImageButton button6 = (ImageButton)findViewById(R.id.logout);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(Menu.this,MainActivity.class);
                startActivity(intent4);
            }
        });
    }
}