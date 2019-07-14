package com.lco.multiapps;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b10=findViewById(R.id.b10);
        b11=findViewById(R.id.b11);
        b12=findViewById(R.id.b12);

      b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case  R.id.b1:
                Intent faceintent=new Intent(MainActivity.this,Main2Activity.class);
                faceintent.putExtra("uri","https://www.facebook.com/");
                startActivity(faceintent);
                break;
            case  R.id.b2:
                Intent instaintent=new Intent(MainActivity.this,Main2Activity.class);
                instaintent.putExtra("uri","https://www.instagram.com/");
                startActivity(instaintent);
                break;
            case  R.id.b3:
                Intent twitintent=new Intent(MainActivity.this,Main2Activity.class);
                twitintent.putExtra("uri","https://twitter.com/");
                startActivity(twitintent);
                break;
            case  R.id.b4:
                Intent linkintent=new Intent(MainActivity.this,Main2Activity.class);
                linkintent.putExtra("uri","https://www.linkden.com/");
                startActivity(linkintent);
                break;
            case  R.id.b5:
                Intent youintent=new Intent(MainActivity.this,Main2Activity.class);
                youintent.putExtra("uri","https://www.youtube.com/");
                startActivity(youintent);
                break;
            case  R.id.b6:
                Intent whatsintent=new Intent(MainActivity.this,Main2Activity.class);
                whatsintent.putExtra("uri","https://www.whatsapp.com/");
                startActivity(whatsintent);
                break;
            case  R.id.b7:
                Intent gmailintent=new Intent(MainActivity.this,Main2Activity.class);
                gmailintent.putExtra("uri","https://www.gmail.com/");
                startActivity(gmailintent);
                break;
            case  R.id.b8:
                Intent yahoointent=new Intent(MainActivity.this,Main2Activity.class);
                yahoointent.putExtra("uri","https://www.yahoo.com/");
                startActivity(yahoointent);
                break;
            case  R.id.b9:
                Intent googleintent=new Intent(MainActivity.this,Main2Activity.class);
                googleintent.putExtra("uri","https://www.google.com/");
                startActivity(googleintent);
                break;
            case  R.id.b10:
                Intent bingintent=new Intent(MainActivity.this,Main2Activity.class);
                bingintent.putExtra("uri","https://www.bing.com/");
                startActivity(bingintent);
                break;
            case  R.id.b11:
                Intent netflixintent=new Intent(MainActivity.this,Main2Activity.class);
                netflixintent.putExtra("uri","https://www.netflix.com/");
                startActivity(netflixintent);
                break;
            case  R.id.b12:
                Intent quoraintent=new Intent(MainActivity.this,Main2Activity.class);
                quoraintent.putExtra("uri","https://www.quora.com/");
                startActivity(quoraintent);
                break;




        }
    }
}
