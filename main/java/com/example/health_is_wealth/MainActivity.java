package com.example.health_is_wealth;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button start;
//    public void startbtnn(View v){
//       Intent intent=new Intent(this,FirstActivity.class);
//       startActivity(intent);
//       finish();
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start=findViewById(R.id.startbtn);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,FirstActivity1.class);
                startActivity(i);
                Toast.makeText(MainActivity.this, "Start Training", Toast.LENGTH_SHORT).show();
            }
        });

    }
}