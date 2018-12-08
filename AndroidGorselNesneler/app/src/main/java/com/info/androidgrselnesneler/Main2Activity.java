package com.info.androidgrselnesneler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Main2Activity extends AppCompatActivity {

    private ToggleButton toggleButton;
    private Switch mSwitch;
    private Button buttonYap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        toggleButton = (findViewById(R.id.toggleButton));
        mSwitch = (findViewById(R.id.mSwitch));
        buttonYap = (findViewById(R.id.buttonYap));

        buttonYap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Boolean switchDurum = mSwitch.isChecked();
                Boolean toggleDurum = toggleButton.isChecked();

                Toast.makeText(Main2Activity.this, "SD :"+ switchDurum + " TD : "+toggleDurum, Toast.LENGTH_SHORT).show();

            }
        });

        mSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                Log.e("Switch Durum", String.valueOf(b));
            }
        });


        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.e("Toggle Durum", String.valueOf(isChecked));
            }
        });

    }
}
