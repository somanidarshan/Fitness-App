package com.example.health_is_wealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class workout extends AppCompatActivity {
    Button gymwk,abss,stomachflat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        gymwk=findViewById(R.id.gymwork);
        gymwk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(workout.this,gymworkout.class);
                startActivity(intent);
            }

        });
        abss=findViewById(R.id.abs);

        abss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(workout.this,powerabs.class);
                startActivity(intent);
            }

        });
        stomachflat=findViewById(R.id.stomach);

        stomachflat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(workout.this,flatstomach.class);
                startActivity(intent);
            }

        });

    }
}