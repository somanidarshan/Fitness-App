package com.example.health_is_wealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gymworkout extends AppCompatActivity {
        Button e1,e2,e3,e4,e5,e6,e7,e8,e9,e10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gymworkout);
        e1=findViewById(R.id.button21);
        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(gymworkout.this,biseps1.class);
                startActivity(intent);
            }
        });
        e2=findViewById(R.id.button20);
        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(gymworkout.this,biseps2.class);
                startActivity(intent);
            }
        });
        e3=findViewById(R.id.button19);
        e3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(gymworkout.this,chest1.class);
                startActivity(intent);
            }
        });
        e4=findViewById(R.id.button17);
        e4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(gymworkout.this,chest2.class);
                startActivity(intent);
            }
        });
        e5=findViewById(R.id.button18);
        e5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(gymworkout.this,specialpushpups.class);
                startActivity(intent);
            }
        });
        e6=findViewById(R.id.button16);
        e6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(gymworkout.this,exercise7.class);
                startActivity(intent);
            }
        });
        e7=findViewById(R.id.button15);
        e7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(gymworkout.this,trisep1.class);
                startActivity(intent);
            }
        });
        e8=findViewById(R.id.button10);
        e8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(gymworkout.this,Exercise8.class);
                startActivity(intent);
            }
        });
        e9=findViewById(R.id.button14);
        e9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(gymworkout.this,Exercise9.class);
                startActivity(intent);
            }
        });
        e10=findViewById(R.id.button2);
        e10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(gymworkout.this,Exercise10.class);
                startActivity(intent);
            }
        });




    }
}