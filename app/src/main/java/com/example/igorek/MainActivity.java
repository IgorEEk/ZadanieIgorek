package com.example.igorek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Cat myCat;
    int z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Cat cat32 = new Cat(1, "Ceasar");
        cat32.talk();
        Cat cat33 = new Cat(5, "Petr");
        cat33.talk();
        Cat cat34 = new Cat(8, "Boris");
        cat34.talk();

        Cat cat35 = new Cat();
        Cat cat36 = new Cat();
        Cat cat37 = new Cat();
        Cat cat38 = new Cat();

        Log.i("count", "" + Cat.count);

        Cat.CountResetter countResetter = new Cat.CountResetter();

        Log.i("count", "" + Cat.count);


    }
}