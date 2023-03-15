package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isimg=true;
    public void change(View view){
        ImageView iv=findViewById(R.id.img);
            if(isimg){
                iv.setImageResource(R.drawable.img_1);
                isimg=false;
            }else{
                iv.setImageResource(R.drawable.img);
                isimg=true;
            }

    }
                       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}