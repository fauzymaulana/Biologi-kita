package com.din;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class skor extends AppCompatActivity {
    TextView hasil;
    Button mee;
    private String KEY_NAME = " ";
    private String jwb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skor);
        hasil=(TextView)findViewById(R.id.skor);
        mee=(Button)findViewById(R.id.me);


        Bundle extras = getIntent().getExtras();
        jwb = extras.getString(KEY_NAME);
        hasil.setText(" "+jwb);

        mee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent z = new Intent(skor.this, menuUtama.class);
                startActivity(z);
                finish();
            }
        });
    }
    public void onBackPressed(){
        Toast.makeText(skor.this,"Silahkan Tekan Menu untuk keluar", Toast.LENGTH_SHORT).show();
    }

}

