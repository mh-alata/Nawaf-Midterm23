package com.example.nawaf_midterm20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton bt1 = (ImageButton) this.findViewById(R.id.btArsenal);
        Button btAc1 =(Button) this.findViewById(R.id.btA1);
        Button btAc2 =(Button) this.findViewById(R.id.btA2);

       // MediaPlayer mp = MediaPlayer.create(this,R.raw.arsenal);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.arsenal);
                mp.start();
            }
        });
        btAc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MainActivity2.class));
            }
        });
        btAc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MainActivity3.class));
            }
        });



    }
}