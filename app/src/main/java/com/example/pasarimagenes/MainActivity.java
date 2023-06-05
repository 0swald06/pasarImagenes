package com.example.pasarimagenes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.pasarimagenes.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mBinding.imageButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, MainActivity2.class);
                startActivity(intent);

            }
        });

        mBinding.imageButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, MainActivity3.class);
                startActivity(intent);

            }
        });
        mBinding.imageButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, MainActivity4.class);
                startActivity(intent);

            }
        });
        mBinding.imageButton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, MainActivity5.class);
                startActivity(intent);

            }
        });
    }
}