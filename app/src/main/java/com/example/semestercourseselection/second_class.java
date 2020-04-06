package com.example.semestercourseselection;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class second_class extends AppCompatActivity
{



    Spinner spinner4;
    Spinner spinner5;
    Spinner spinner6;

    Spinner section4 ;
    Spinner section5;
    Spinner section6;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        spinner4 = findViewById(R.id.spinner2a);
        spinner5 =  findViewById(R.id.spinner3a);
        spinner6 = findViewById(R.id.spinner4a);


        section4 =  findViewById(R.id.spinner2b);
        section5 =  findViewById(R.id.spinner3b);
        section6 =  findViewById(R.id.spinner4b);




        String sections[]=
                {
                        "A","B","C","D","E","F","G","H","I","J","GR1","GR2","GR3","GR4"};

        String[] semester1 = {
                "English Composition and Comprehension",
                "English Composition and Comprehension  Lab",
                "Islamic and Religious Studies",
                "Programming Fundamentals",
                "Programming Fundamentals Lab",
                "Applied Physics",
                "Calculus Analytical Geometry"};


        String[]semester2=
                {
                        "Computer Programming Lab",
                        "Computer Programming",
                        "Calculus - II",
                        "Digital Logic Design",
                        "English Composition",
                        "Pakistan Studies",
                        "Digital Logic Design - Lab"
                };

        String[]semester3=
                {
                        "Data Structures",
                        "Comp. Organization and Assembly Lang. Lab",
                        "Business Communication - I",
                        "Comp. Organization and Assembly Lang",
                        "Discrete Structures",
                        "Linear Algebra"

                };
        String[]semester4=
                {
                        "Organizational Behavior",
                        " Operating Systems Lab",
                        "Theory of Automata",
                        "Computing Methods - I",
                        "Probability and Statistics",
                        "Operating Systems",
                };

        String[]semester5=
                {
                        "Communication for Managers",
                        " Database Systems",
                        "Object Oriented Analysis and Design Lab",
                        "Computer Architecture",
                        "Design and Analysis of Algorithms",
                        "Database Systems Lab",
                        "Object Oriented Analysis and Design",
                };

        String[]semester6=
                {
                        "Technical and Business Writing",
                        "Data Science",
                        "Computer Networks Lab",
                        "Computer Networks",
                        "Software Engineering",
                        "Artificial Intelligence"
                };

        String[]semester7=
                {
                        "Information Systems Security",
                        "Professional Issues in IT",
                        "Human Computer Interaction",
                        "Design Defects and Restructuring",
                        "Project - I",
                };


        String [] objects1=semester1;
        String [] section_data=sections;

        ArrayAdapter adapter5 = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1 ,semester4   );
        spinner4 .setAdapter(adapter5);
        ArrayAdapter adapter6 = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1 ,objects1   );
        spinner5.setAdapter(adapter6);
        ArrayAdapter adapter7 = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1 ,semester2   );
      spinner6 .setAdapter(adapter7);


        ArrayAdapter adapter12 = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1 ,section_data   );
        section4 .setAdapter(adapter12);
        ArrayAdapter adapter13 = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1 ,section_data   );
        section5 .setAdapter(adapter13);
        ArrayAdapter adapter14 = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1 ,section_data   );
        section6 .setAdapter(adapter14);






    }


    public void back(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }




    public void next(View view)
    {


        String a[]=new String[6];

        int count=0;

        a[0]=Data.x.get(0).getName();
        a[1]=Data.x.get(1).getName();
        a[2]=Data.x.get(2).getName();
        a[3]=spinner4.getSelectedItem().toString();
        a[4]=spinner5.getSelectedItem().toString();
        a[5]=spinner6.getSelectedItem().toString();

        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                if (a[i].equals(a[j]))
                {
                    count++;
                    System.out.println("Mathcedssadad"+count+"  "+a[i]  );
                }
            }
        }
        if(count >6)
        {

            Toast.makeText(getApplicationContext(),"work done", Toast.LENGTH_LONG).show();
            count = 0;
            //comdtion

        }
        else
        {
            count = 0;
            Toast.makeText(getApplicationContext(),"YAYAYAY YOURE DONE", Toast.LENGTH_LONG).show();

            Data.x.add(new CoursesModel(spinner4.getSelectedItem().toString(),section4.getSelectedItem().toString()));
            Data.x.add(new CoursesModel(spinner5.getSelectedItem().toString(),section5.getSelectedItem().toString()));
            Data.x.add(new CoursesModel(spinner6.getSelectedItem().toString(),section6.getSelectedItem().toString()));

            //Data.x.get(0).getName();

        }



    }
    }



