package com.example.pasarimagenes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.pasarimagenes.databinding.ActivityMain4Binding;
import com.example.pasarimagenes.databinding.ActivityMain5Binding;

public class MainActivity5 extends AppCompatActivity {
    private ActivityMain5Binding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding= ActivityMain5Binding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mBinding.Regresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity5.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
}