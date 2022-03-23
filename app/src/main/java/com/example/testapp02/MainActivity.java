package com.example.testapp02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.testapp02.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
     
        initListeners();

    }

    private void initListeners() {
        MyMath math = new MyMath();

        binding.btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String first = binding.etFirst.getText().toString();
                String second = binding.etSecond.getText().toString();

                String result = math.add(first, second);
                //String result = math.div(first, second);
                binding.tvResult.setText(result);
            }
        });

    }
}