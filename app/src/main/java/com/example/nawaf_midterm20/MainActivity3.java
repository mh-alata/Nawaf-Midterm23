package com.example.nawaf_midterm20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button btAc1 =(Button) this.findViewById(R.id.btAAA1);
        Button btAc2 =(Button) this.findViewById(R.id.btAAA2);

        btAc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity3.this,MainActivity.class));
            }
        });
        btAc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity3.this,MainActivity2.class));
            }
        });
    }
}