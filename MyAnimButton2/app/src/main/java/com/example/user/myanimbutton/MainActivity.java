package com.example.user.myanimbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void marvelTapped(View view){

        ImageView marvel = findViewById(R.id.marvel);
        ImageView marvel1 = findViewById(R.id.marvel1);

        marvel.animate().alpha(1).setDuration(1000);
        marvel1.animate().alpha(0).setDuration(1000);
    }

    public void marvel1Tapped (View view){

        ImageView marvel1 = findViewById(R.id.marvel1);
        ImageView marvel = findViewById(R.id.marvel);

        marvel1.animate().alpha(1).setDuration(1000);
        marvel.animate().alpha(0).setDuration(1000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
