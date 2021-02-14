package com.example.health_is_wealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity1 extends AppCompatActivity {
    EditText Height1;
    EditText Weight1;
    Button bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first1);
        Height1 = (EditText) findViewById(R.id.height);
        Weight1 = (EditText) findViewById(R.id.Weight);
        Height1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String s2= Height1.getText().toString();

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        Weight1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String s2 = Weight1.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        bt2 = findViewById(R.id.button3);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int weight = Integer.parseInt(Weight1.getText().toString());
                int height = Integer.parseInt(Height1.getText().toString());

                if (height > 137 && height <=152) {
                    if (weight > 38 && weight <= 43) {
                        Intent intent = new Intent(FirstActivity1.this, EqualWeight.class);
                        startActivity(intent);
                    } else if (weight > 43) {
                        Intent intent = new Intent(FirstActivity1.this, MainActivity2.class);
                        startActivity(intent);
                    } else {
                        Intent intent = new Intent(FirstActivity1.this, UnderWeight.class);
                        startActivity(intent);
                    }
                }
                if (height > 152 && height <=167) {
                    if (weight > 43 && weight <= 54) {
                        Intent intent = new Intent(FirstActivity1.this, EqualWeight.class);
                        startActivity(intent);
                    } else if (weight > 54) {
                        Intent intent = new Intent(FirstActivity1.this, MainActivity2.class);
                        startActivity(intent);
                    } else {
                        Intent intent = new Intent(FirstActivity1.this, UnderWeight.class);
                        startActivity(intent);
                    }
                }
                if (height > 167 && height <= 180) {
                    if (weight > 54 && weight <= 70) {
                        Intent intent = new Intent(FirstActivity1.this, EqualWeight.class);
                        startActivity(intent);
                    } else if (weight > 70) {
                        Intent intent = new Intent(FirstActivity1.this, MainActivity2.class);
                        startActivity(intent);
                    } else {
                        Intent intent = new Intent(FirstActivity1.this, UnderWeight.class);
                        startActivity(intent);
                    }
                }
                if (height > 180 && height <= 195) {
                    if (weight > 70 && weight <= 85) {
                        Intent intent = new Intent(FirstActivity1.this, EqualWeight.class);
                        startActivity(intent);
                    } else if (weight > 85) {
                        Intent intent = new Intent(FirstActivity1.this, MainActivity2.class);
                        startActivity(intent);
                    } else {
                        Intent intent = new Intent(FirstActivity1.this, UnderWeight.class);
                        startActivity(intent);
                    }
                }
            }
        });
    }
}