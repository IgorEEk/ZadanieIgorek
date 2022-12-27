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


        Cat cat1 = new Cat();
        Log.i("numberOfLegs", "cat1 number of legs" + cat1.number0fLegs + Cat.whatCatsLike());


        Lion lion = new Lion();
        lion.talk();

    }
}