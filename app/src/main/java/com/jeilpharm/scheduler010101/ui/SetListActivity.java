package com.jeilpharm.scheduler010101.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jeilpharm.scheduler010101.R;
import com.jeilpharm.scheduler010101.databinding.ActivitySetListBinding;

public class SetListActivity extends AppCompatActivity {

    ActivitySetListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySetListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbarSetList);
        getSupportActionBar().setTitle("거래처");


    }
}