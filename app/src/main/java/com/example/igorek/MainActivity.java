package com.example.igorek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Cat myCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myCat = new Cat(3, "Barsik", "Ball", "red");
        myCat.talk();

        Cat murzik = new Cat(4, "Murzik", "Merzella", "yellow");
        murzik.talk();

        Cat glasha = new Cat();
        glasha.age = 1;
        glasha.name = "Glasha";
        glasha.breed = "Golosha";
        glasha.color = "black";
        glasha.talk();
    }
}