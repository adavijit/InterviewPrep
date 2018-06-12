package com.example.avijit.lco;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class homeScreen extends AppCompatActivity {
    ImageButton b1,b2,b3,b4;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        b1=(ImageButton)findViewById(R.id.learn);
        b2=(ImageButton)findViewById(R.id.play);
        b3=(ImageButton)findViewById(R.id.aboutus);
        iv=(ImageView)findViewById(R.id.lco_ad);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(homeScreen.this,MainActivity.class);
                startActivity(i);

            }
        });
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), lco_ad.class);
                intent.putExtra("url", "https://courses.learncodeonline.in/");
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(homeScreen.this,about_us.class);
                startActivity(i);
            }
        });
       /* l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent i = new Intent(homeScreen.this,MainActivity.class);
                //startActivity(i);
            }
        });*/



    }
}
