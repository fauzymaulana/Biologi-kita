package com.din.kelasX;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.din.MainActivity;
import com.din.R;

public class BABtigasatu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babtigasatu);
    }
    public void onBackPressed(){
        Intent d = new Intent(BABtigasatu.this, MainActivity.class);
        startActivity(d);
        finish();
    }
}
