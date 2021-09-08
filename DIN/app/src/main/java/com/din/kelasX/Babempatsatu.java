package com.din.kelasX;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.din.MainActivity;
import com.din.R;

public class Babempatsatu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babempatsatu);
    }
    public void onBackPressed(){
        Intent s = new Intent(Babempatsatu.this, MainActivity.class);
        startActivity(s);
        finish();
    }
}
