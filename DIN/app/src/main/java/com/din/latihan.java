package com.din;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class latihan extends AppCompatActivity {
    Button A, B, C, D;
    TextView nom, isii, nilai;
    ImageView gbr;
    Integer no,jawaban,w,x,y,z;
    String jwb;

    private String KEY_NAME= " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan);
        nom = (TextView) findViewById(R.id.nomor);
        isii = (TextView) findViewById(R.id.isi);
        A = (Button) findViewById(R.id.a);
        B = (Button) findViewById(R.id.b);
        C = (Button) findViewById(R.id.c);
        D = (Button) findViewById(R.id.d);
        gbr = (ImageView) findViewById(R.id.gambar);
        nilai=(TextView)findViewById(R.id.nilai);
        no = 1;
        jawaban=0;
        alatt();
    }

    public void alatt() {
        if (no == 1) {

            nom.setText("Soal 1");
            isii.setText("Makhluk hidup parasit mikroskopik yang menginfeksi sel organisme biologis dinamakan ?");
            A.setText("A.   Virus");
            A.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(latihan.this,"Jawaban Anda Benar", Toast.LENGTH_SHORT).show();
                    w=10;
                    no = no+1;
                    alatt();

                }
            });
            B.setText("B.   Bakteri");
            B.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(latihan.this,"Jawaban Anda Salah", Toast.LENGTH_SHORT).show();
                    w=0;
                    no = no+1;
                    alatt();
                }
            });
            C.setText("C.   Hydra");
            C.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(latihan.this,"Jawaban Anda Salah", Toast.LENGTH_SHORT).show();
                    w=0;
                    no = no+1;
                    alatt();
                }
            });
            D.setText("D.   Ganggang Laut");
            D.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(latihan.this,"Jawaban Anda Salah", Toast.LENGTH_SHORT).show();
                    w=0;
                    no = no+1;
                    alatt();
                }
            });
        }else if (no == 2) {
            gbr.setImageResource(R.drawable.v);
            nom.setText("Soal 2");
            isii.setText("Bentuk Makhluk hidup apakah ini ?");
            A.setText("A.   Virus");
            A.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(latihan.this,"Jawaban Anda Benar", Toast.LENGTH_SHORT).show();
                    z=10;

                    jawaban=w+z;

                    try {
                        String jwb = Integer.toString(jawaban);
                        Intent a = new Intent(latihan.this, skor.class);
                        a.putExtra(KEY_NAME, jwb);
                        startActivity(a);
                    }catch (Exception e) {
                        e.printStackTrace();
                        Toast.makeText(getApplication(), "ERROR, TRY AGAIN !",Toast.LENGTH_SHORT);
                    }

                    finish();
                }
            });
            B.setText("B.   Hydra");
            B.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(latihan.this,"Jawaban Anda Salah", Toast.LENGTH_SHORT).show();
                    z=0;
                    jawaban=w+z;
                    try {
                        String jwb = Integer.toString(jawaban);
                        Intent a = new Intent(latihan.this, skor.class);
                        a.putExtra(KEY_NAME, jwb);
                        startActivity(a);
                    }catch (Exception e) {
                        e.printStackTrace();
                        Toast.makeText(getApplication(), "ERROR, TRY AGAIN !",Toast.LENGTH_SHORT);
                    }
                    finish();
                }
            });
            C.setText("C.   Cocor Bebek");
            C.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(latihan.this,"Jawaban Anda Salah", Toast.LENGTH_SHORT).show();
                    z=0;
                    jawaban=w+z;

                    try {
                        String jwb = Integer.toString(jawaban);
                        Intent a = new Intent(latihan.this, skor.class);
                        a.putExtra(KEY_NAME, jwb);
                        startActivity(a);
                    }catch (Exception e) {
                        e.printStackTrace();
                        Toast.makeText(getApplication(), "ERROR, TRY AGAIN !",Toast.LENGTH_SHORT);
                    }
                }
            });
            D.setText("D.   Virus");
            D.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(latihan.this,"Jawaban Anda salah", Toast.LENGTH_SHORT).show();
                    z=0;
                    jawaban=w+z;

                    try {

                        String jwb = Integer.toString(jawaban);
                        Intent a = new Intent(latihan.this, skor.class);
                        a.putExtra(KEY_NAME, jwb);
                        startActivity(a);
                        finish();
                    }catch (Exception e) {
                        e.printStackTrace();
                        Toast.makeText(getApplication(), "ERROR, TRY AGAIN !",Toast.LENGTH_SHORT);
                    }

                }
            });
        }
    }


}
