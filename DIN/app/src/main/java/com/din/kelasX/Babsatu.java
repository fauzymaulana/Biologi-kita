package com.din.kelasX;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.din.MainActivity;
import com.din.R;

public class Babsatu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_babsatu);
    }
    public void onBackPressed(){
        Intent d = new Intent(Babsatu.this, MainActivity.class);
        startActivity(d);
        finish();
    }
}
