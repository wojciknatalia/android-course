package com.example.ramki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WorkoutDetailFragment frag=(WorkoutDetailFragment) getFragmentManager().findFragmentById(R.id.detail_frag);
        frag.setWorkout(1);
    }
}
