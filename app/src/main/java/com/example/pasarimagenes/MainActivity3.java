package com.example.pasarimagenes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.example.pasarimagenes.databinding.ActivityMain2Binding;
import com.example.pasarimagenes.databinding.ActivityMain3Binding;

public class MainActivity3 extends AppCompatActivity {

    private ActivityMain3Binding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        mBinding= ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mBinding.Regresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity3.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
}