package com.example.thutonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TrangFrofile extends AppCompatActivity {
  Button btnfrofile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_frofile);
        btnfrofile=(Button)findViewById(R.id.buttonprofile);
        btnfrofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mhfrofile=new Intent(TrangFrofile.this,MainActivity.class);
                startActivity(mhfrofile);
            }
        });

    }
}