package com.example.koszykowka;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.example.koszykowka.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private PunktyViewModel punktyViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        punktyViewModel = new ViewModelProvider(this).get(PunktyViewModel.class);


        //binding.textView.setText(String.valueOf(punktyViewModel.getPunkty()));

        punktyViewModel.getPunkty().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                binding.textView.setText(integer.toString());
            }
        });

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                punktyViewModel.zwiekszPunkty(1);
                //binding.textView.setText(String.valueOf(punktyViewModel.getPunkty()));
            }
        });

        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                punktyViewModel.zwiekszPunkty(2);
                //binding.textView.setText(String.valueOf(punktyViewModel.getPunkty()));
            }
        });

        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                punktyViewModel.zwiekszPunkty(3);
                //binding.textView.setText(String.valueOf(punktyViewModel.getPunkty()));
            }
        });
    }



}