package com.din.kelasXI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.din.MainActivity;
import com.din.R;

public class BabDuadua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bab_duadua);
    }
    public void onBackPressed(){
        Intent d = new Intent(BabDuadua.this, MainActivity.class);
        startActivity(d);
        finish();
    }
}
