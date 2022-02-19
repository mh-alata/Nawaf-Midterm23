package com.example.nawaf_midterm20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    String Name,message,year;
    int age=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btAc1 =(Button) this.findViewById(R.id.btAA1);
        Button btAc2 =(Button) this.findViewById(R.id.btAA2);


        //*******************************************************
        final TextView txName = (TextView) this.findViewById(R.id.txtName);
        final TextView txYear = (TextView) this.findViewById(R.id.txtYear);
        final Button btsh = (Button) this.findViewById(R.id.btShow);
        final TextView txSh = (TextView) this.findViewById(R.id.txtShow);
        final RadioButton rm = (RadioButton) this.findViewById(R.id.radioMale);
        final RadioButton rf = (RadioButton) this.findViewById(R.id.radioFemale);




        //************************************************

        btAc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,MainActivity.class));
            }
        });
        btAc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,MainActivity3.class));
            }
        });

        //***********************************************

        btsh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Name = txName.getText().toString();


                if(Name.length()>0) {
                    year= txYear.getText().toString();
                    if(year.length()>0) {


                        age =  Integer.parseInt(year);
                        if (age > 1900 && age < 2022) {
                            age = 2022 - age;

                            if (rm.isChecked()) {
                                message = "Hi Mr, " + txName.getText().toString() + " ,You are " + age + " old years";
                            } else if (rf.isChecked()) {
                                message = "Hi Ms, " + txName.getText().toString() + " ,You are " + age + " old years";
                            } else {
                                Toast.makeText(MainActivity2.this, "Please select gender", Toast.LENGTH_LONG).show();
                            }
                        } else {
                            Toast.makeText(MainActivity2.this, "Please Insert right birth year between (1900 - 2022)", Toast.LENGTH_LONG).show();
                        }
                    }
                    else{
                        Toast.makeText(MainActivity2.this, "Please Insert your birth Year", Toast.LENGTH_LONG).show();
                    }

                }
                else{
                    Toast.makeText(MainActivity2.this, "Please Insert your name", Toast.LENGTH_LONG).show();
                }



                txSh.setText(message);


            }
        });

    }
}