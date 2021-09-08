package com.din.kelasX;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.din.MainActivity;
import com.din.R;

public class Babdua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babdua);
    }
    public void onBackPressed(){
        Intent d = new Intent(Babdua.this, MainActivity.class);
        startActivity(d);
        finish();
    }
}
