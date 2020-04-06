package com.example.semestercourseselection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {

     RadioGroup radioGroup1;
     RadioGroup radioGroup2;
     Button Clearcourses;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        radioGroup1=findViewById(R.id.radioGroup);
        radioGroup2=findViewById(R.id.radioGroup2);
        Clearcourses=findViewById(R.id.button3);








        radioGroup2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {  boolean checked = ((RadioButton) view).isChecked();

                switch(view.getId()) {
                    case R.id.radioButton3:
                        if (checked)
                        {
                            Toast toast=Toast.makeText(getApplicationContext(),"Hint On",Toast.LENGTH_LONG);
                            toast.show();


                            break;
                        }


                    case R.id.radioButton4:
                        if (checked)
                        {
                            Toast toast=Toast.makeText(getApplicationContext(),"Hint off",Toast.LENGTH_LONG);
                            toast.show();



                            break;
                        }


                }

            }});




        radioGroup1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {  boolean checked = ((RadioButton) view).isChecked();

                switch(view.getId()) {
                    case R.id.radioButton:
                        if (checked)
                        {
                            Toast toast=Toast.makeText(getApplicationContext(),"Notification On",Toast.LENGTH_LONG);
                            toast.show();


                            break;
                        }


                    case R.id.radioButton2:
                        if (checked)
                        {
                            Toast toast=Toast.makeText(getApplicationContext(),"Notification off",Toast.LENGTH_LONG);
                            toast.show();



                            break;
                        }


                }

            }});



        Clearcourses.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
        Intent i = new Intent(MainActivity.this,Settings.class);

        startActivity(i);
            }});







    }


}