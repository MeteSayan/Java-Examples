package com.info.androidalmayaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonGiris;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("MainActivity", "onCreate");

        buttonGiris = findViewById(R.id.buttonGiris);

        buttonGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent yeniIntent = new Intent(MainActivity.this,SecondActivity.class);

               /* yeniIntent.putExtra("mesaj", "Merhaba");
                yeniIntent.putExtra("yas", 19);
                yeniIntent.putExtra("boy", 1.92);
                yeniIntent.putExtra("bekarmi", true);*//*

               Kisiler kisi = new Kisiler("Mete", 19, 1.92, true);

               yeniIntent.putExtra("nesne", kisi);*/


                startActivity(yeniIntent);




            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("MainActivity","onStart" );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("MainActivity","onResume" );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("MainActivity","onPause" );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("MainActivity","onStop" );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("MainActivity","onDestroy" );
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("MainActivity","onRestart " );
    }
}

