package com.din;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class menuUtama extends AppCompatActivity {
    Button but1, but2, but3, but4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
        but1=(Button)findViewById(R.id.but1);
        but2=(Button)findViewById(R.id.but2);
        but3=(Button)findViewById(R.id.but3);
        but4=(Button)findViewById(R.id.but4);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a =new Intent(menuUtama.this, MainActivity.class);
                startActivity(a);

            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent b =new Intent(menuUtama.this, latihan.class);
                startActivity(b);

            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(menuUtama.this,"Activity Ini Belum Selesai", Toast.LENGTH_SHORT).show();


            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(menuUtama.this,"Activity Ini Belum Selesai", Toast.LENGTH_SHORT).show();


            }
        });
    }
}
