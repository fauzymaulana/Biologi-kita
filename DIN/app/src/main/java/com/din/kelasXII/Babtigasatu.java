package com.din.kelasXII;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.din.MainActivity;
import com.din.R;

public class Babtigasatu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babtigasatu2);
    }
    public void onBackPressed(){
        Intent d = new Intent(Babtigasatu.this, MainActivity.class);
        startActivity(d);
        finish();
    }
}
