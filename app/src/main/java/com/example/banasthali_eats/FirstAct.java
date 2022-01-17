package com.example.banasthali_eats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FirstAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

    }
    public void toM(View v)
    {
        startActivity(new Intent(FirstAct.this,Mukteshwari.class));
    }

}