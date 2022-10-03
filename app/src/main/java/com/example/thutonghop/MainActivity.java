package com.example.thutonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends  AppCompatActivity {
   TextView txtvDangnhap;
   Button btnfrofile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtvDangnhap=(TextView) findViewById(R.id.textView8);
        txtvDangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mhdangnhap=new Intent(MainActivity.this,TrangDangki.class);
                startActivity(mhdangnhap);
            }
        });
        btnfrofile=(Button) findViewById(R.id.button_dangnhap);
        btnfrofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mhdangnhap1=new Intent(MainActivity.this,TrangChu.class);
                startActivity(mhdangnhap1);
            }
        });

    }
}