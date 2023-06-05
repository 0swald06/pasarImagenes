package com.example.pasarimagenes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.pasarimagenes.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {
    private ActivityMain2Binding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding=ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mBinding.Regresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity2.this, MainActivity.class);
                startActivity(intent);

            }
        });
}
}