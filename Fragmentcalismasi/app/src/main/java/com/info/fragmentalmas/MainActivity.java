package com.info.fragmentalmas;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();

        FragmentTransaction ft = fm.beginTransaction();

        ft.add(R.id.birinciFragmentTutucu, new BirinciFragment());
        ft.add(R.id.ikinciFragmentTutucu,new IkinciFragment() );

        ft.commit();


    }
}
