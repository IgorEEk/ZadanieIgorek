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


        Cat cat32 = new Cat(1, "Ball");
        cat32.talk();
        Cat cat33 = new Cat(5, "Murzella");
        cat33.talk();
        Cat cat34 = new Cat(8, "Petr");
        cat34.talk();


    }
}