package com.example.pasarimagenes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.pasarimagenes.databinding.ActivityMain2Binding;
import com.example.pasarimagenes.databinding.ActivityMain4Binding;

public class MainActivity4 extends AppCompatActivity {
    private ActivityMain4Binding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding= ActivityMain4Binding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mBinding.Regresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity4.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
}