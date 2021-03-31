package com.example.task1ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewfirst,recyclersecond,thirdrecycler,forthrecycler;
    FirstAdapter firstAdapter;
    SecondAdapter secondAdapter;
    ThirdAdapter thirdAdapter;
    ForthAdapter forthAdapter;


    String[] courses={"Robotics","Coding","Courses","3D design","Android","Java"};
    int [] roboImages={R.drawable.robo1_removebg_preview,R.drawable.robo2_removebg_preview__1_,
            R.drawable.robo3_removebg_preview,R.drawable.robo4_removebg_preview};
    String[] ages={"Ages 8-10","Ages 10-12","Ages 12-14","Ages 14-16","Ages 16-18","Ages 18-20"};
    int[] imagesn={R.drawable.campus_removebg_preview,R.drawable.class1_removebg_preview,R.drawable.popular_removebg_preview};
    String[] textforth={"Clases","Campus","Popular"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        recyclerViewfirst=findViewById ( R.id.firstrecycler );
        recyclersecond=findViewById ( R.id.secondrecycler );
        thirdrecycler=findViewById ( R.id.thirdtrecycler );
        forthrecycler=findViewById ( R.id.forthrecycler );
        firstAdapter=new FirstAdapter (MainActivity.this,courses);
        recyclerViewfirst.setAdapter ( firstAdapter );

        secondAdapter=new SecondAdapter ( MainActivity.this,roboImages );
        recyclersecond.setAdapter ( secondAdapter );

        thirdAdapter=new ThirdAdapter ( MainActivity.this,ages );
        thirdrecycler.setAdapter ( thirdAdapter );

        forthAdapter=new ForthAdapter ( MainActivity.this,imagesn,textforth );
        forthrecycler.setAdapter ( forthAdapter );



    }
}