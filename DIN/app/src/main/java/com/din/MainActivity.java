package com.din;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.*;
import android.content.Intent;
import android.graphics.Color;
import android.os.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.din.kelasX.BABtigasatu;
import com.din.kelasX.Babdua;
import com.din.kelasX.Babempatsatu;
import com.din.kelasX.Babsatu;


public class MainActivity extends AppCompatActivity {

    Button a,b,c,d,e,f,g,h,i,j,k,X,XI,XII;
    int aha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        X=(Button)findViewById(R.id.X);
        XII=(Button)findViewById(R.id.XII);
        XI=(Button)findViewById(R.id.XI);
        a=(Button)findViewById(R.id.a);
        b=(Button)findViewById(R.id.b);
        c=(Button)findViewById(R.id.c);
        d=(Button)findViewById(R.id.d);
        e=(Button)findViewById(R.id.e);
        f=(Button)findViewById(R.id.f);
        g=(Button)findViewById(R.id.g);
        h=(Button)findViewById(R.id.h);
        i=(Button)findViewById(R.id.i);
        j=(Button)findViewById(R.id.j);
        k=(Button)findViewById(R.id.k);

        X.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                X.setBackgroundColor(Color.parseColor("#5F9EA0"));
                XI.setBackgroundColor(Color.parseColor("#FFFFFF"));
                XII.setBackgroundColor(Color.parseColor("#FFFFFF"));

                a.setText("BAB I BIOLOGI SEBAGAI ILMU");
                a.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent bab1 = new Intent(MainActivity.this, Babsatu.class);
                        startActivity(bab1);
                        finish();
                    }
                });
                b.setText("BAB II KLASIFIKASI MAKHLUK HIDUP");
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent bab2 = new Intent(MainActivity.this, Babdua.class);
                        startActivity(bab2);
                        finish();
                    }
                });
                c.setText("BAB III VIRUS");
                c.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent bab3 = new Intent(MainActivity.this, BABtigasatu.class);
                        startActivity(bab3);
                        finish();
                    }
                });
                d.setText("BAB IV BAKTERI");
                d.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent bab4 = new Intent(MainActivity.this, Babempatsatu.class);
                        startActivity(bab4);
                        finish();
                    }
                });
                e.setText("BAB V PROTISTA");
                f.setText("BAB VI JAMUR/FUNGI");
                g.setText("BAB VII DUNIA TUMBUHAN");
                h.setText("BAB VIII DUNIA HEWAN");
                i.setText("BAB IX KEANEKARAGAMAN HAYATI DI INDONESIA");
                j.setText("BAB X EKOSISTEM");
                k.setText("BAB XI KESEIMABNGAN LINGKUNGAN DAN PERUBAHANNYA");
            }
        });
        XI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                X.setBackgroundColor(Color.parseColor("#FFFFFF"));
                XI.setBackgroundColor(Color.parseColor("#5F9EA0"));
                XII.setBackgroundColor(Color.parseColor("#FFFFFF"));
                a.setText("BAB I ORGANISASI TINGKAT SEL");
                b.setText("BAB II ORGANISASI TINGKAT JARINGAN");
                c.setText("BAB III SISTEM GERAK PADA MANUSIA");
                d.setText("BAB IV SISTEM PEREDARAN DARAH PADA MANUSIA");
                e.setText("BAB V SISTEM PENCERNAAN MAKANAN");
                f.setText("BAB VI SISTEM PERNAFASAN");
                g.setText("BAB VII SISTEM EKSRESI");
                h.setText("BAB VIII SISTEM REGULASI");
                i.setText("BAB IX SISTEM REPRODUKSI");
                j.setText("BAB X SISTEM PERTAHANAN TUBUH");
                k.setText(" ");

            }
        });
        XII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                X.setBackgroundColor(Color.parseColor("#FFFFFF"));
                XI.setBackgroundColor(Color.parseColor("#FFFFFF"));
                XII.setBackgroundColor(Color.parseColor("#5F9EA0"));
                a.setText("BAB I PERTUMBUHAN DAN PERKEMBANGAN TUMBUHAN");
                b.setText("BAB II METABOLISME SEL");
                c.setText("BAB III MATERI GENETIK");
                d.setText("BAB IV REPRODUKSI SEL");
                e.setText("BAB V HEREDITAS DAN MUTASI");
                f.setText("BAB VI ASAL-USUL KEHIDUPAN");
                g.setText("BAB VII EVOLUSI");
                h.setText("BAB VIII BIOTEKNOLOGI");
                i.setText(" ");
                j.setText(" ");
                k.setText(" ");
            }
        });



    }
}
