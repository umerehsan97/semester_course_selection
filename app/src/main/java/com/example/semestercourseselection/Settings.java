package com.example.semestercourseselection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Settings extends AppCompatActivity {

    Spinner spinner;
    Spinner spinner1;
    Spinner spinner2;

    Spinner section ;
    Spinner section1;
    Spinner section2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ateeb);




//
//        Spinner spinner = findViewById(R.id.spinner2);
//        Spinner spinner1 =  findViewById(R.id.spinner3);
//        Spinner spinner2 = findViewById(R.id.spinner4);
//        Spinner spinner3 = findViewById(R.id.spinner5);
//        Spinner spinner4 =  findViewById(R.id.spinner6);
//        Spinner spinner5 = findViewById(R.id.spinner7);
//        Spinner spinner6 =  findViewById(R.id.spinner8);
//        Spinner section =  findViewById(R.id.spinner9);
//        Spinner section1 =  findViewById(R.id.spinner10);
//        Spinner section2 =  findViewById(R.id.spinner11);
//        Spinner section3 =  findViewById(R.id.spinner12);
//        Spinner section4 =  findViewById(R.id.spinner13);
//        Spinner section5 =  findViewById(R.id.spinner14);
//        Spinner section6 =  findViewById(R.id.spinner15);




        spinner = findViewById(R.id.spinner2a);
        spinner1 =  findViewById(R.id.spinner3a);
        spinner2 = findViewById(R.id.spinner4a);
//        Spinner spinner3 = findViewById(R.id.spinner5);
//        Spinner spinner4 =  findViewById(R.id.spinner6);
//        Spinner spinner5 = findViewById(R.id.spinner7);
//        Spinner spinner6 =  findViewById(R.id.spinner8);
        section =  findViewById(R.id.spinner2b);
        section1 =  findViewById(R.id.spinner3b);
        section2 =  findViewById(R.id.spinner4b);
//        Spinner section3 =  findViewById(R.id.spinner12);
//        Spinner section4 =  findViewById(R.id.spinner13);
//        Spinner section5 =  findViewById(R.id.spinner14);
//        Spinner section6 =  findViewById(R.id.spinner15);


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

        ArrayAdapter adapter1 = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1 ,objects1   );
        spinner .setAdapter(adapter1);
        ArrayAdapter adapter2 = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1 ,objects1  );
        spinner1 .setAdapter(adapter2);
        ArrayAdapter adapter3 = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1 ,objects1
        );
        spinner2 .setAdapter(adapter3);
//        ArrayAdapter adapter4 = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1 ,objects1   );
//        spinner3 .setAdapter(adapter4);
//        ArrayAdapter adapter5 = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1 ,semester4   );
//        spinner4 .setAdapter(adapter5);
//        ArrayAdapter adapter6 = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1 ,objects1   );
//        spinner5.setAdapter(adapter6);
//        ArrayAdapter adapter7 = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1 ,semester2   );
//        spinner6 .setAdapter(adapter7);


        ArrayAdapter adapter8 = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1 ,section_data   );
        section.setAdapter(adapter8);
        ArrayAdapter adapter9 = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1 ,section_data   );
        section1 .setAdapter(adapter9);
        ArrayAdapter adapter10 = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1 ,section_data   );
        section2 .setAdapter(adapter10);





    }

    public void next(View view)
    {


        Data.x = new ArrayList<CoursesModel>();

        Data.x.add(new CoursesModel(spinner.getSelectedItem().toString(),section.getSelectedItem().toString()));
        Data.x.add(new CoursesModel(spinner1.getSelectedItem().toString(),section1.getSelectedItem().toString()));
        Data.x.add(new CoursesModel(spinner2.getSelectedItem().toString(),section2.getSelectedItem().toString()));

        String a[]=new String[3];

        int count=0;

        a[0]=Data.x.get(0).getName();
        a[1]=Data.x.get(1).getName();
        a[2]=Data.x.get(2).getName();
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if (a[i].equals(a[j]))
                {
                    count++;
                    System.out.println("dad"+count+"  "+a[i]  );
                }
            }
        }



        if(count >3)
        {

            Toast.makeText(getApplicationContext(),"work done", Toast.LENGTH_LONG).show();
            count = 0;
            //comdtion

        }
        else
        {
            count = 0;
            Intent i = new Intent(this, ateeb2.class);
            System.out.println("afagasbnasnba");
            startActivity(i);


            //Data.x.get(0).getName();

        }

    }
    public void run()
    {
        Toast.makeText(getApplicationContext(),"work done", Toast.LENGTH_LONG).show();
    }
}



