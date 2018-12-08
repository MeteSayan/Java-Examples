package com.info.androidgrselnesneler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    private CheckBox checkBoxJava,checkBoxC,checkBoxPhp;
    private RadioButton radioButtonBJK,radioButtonFB,radioButtonGS;
    private Button buttonYap;
    private String dilSonuc = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        checkBoxJava = findViewById(R.id.checkBoxJava);
        checkBoxC = findViewById(R.id.checkBoxC);
        checkBoxPhp = findViewById(R.id.checkBoxPhp);

        radioButtonBJK = findViewById(R.id.radioButtonBJK);
        radioButtonGS = findViewById(R.id.radioButtonGS);
        radioButtonFB = findViewById(R.id.radioButtonFB);

        buttonYap = findViewById(R.id.buttonYap);

        buttonYap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (checkBoxJava.isChecked()){
                    dilSonuc = dilSonuc + " JAVA";
                }
                if (checkBoxC.isChecked()){
                    dilSonuc = dilSonuc + " C#";
                }
                if (checkBoxPhp.isChecked()){
                    dilSonuc = dilSonuc + " PHP";
                }

                Toast.makeText(getApplicationContext(), dilSonuc, Toast.LENGTH_SHORT).show();

                dilSonuc = "";
            }
        });

        radioButtonBJK.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.e("Beşiktaş", String.valueOf(isChecked));
            }
        });

        radioButtonFB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.e("Fenerbahçe", String.valueOf(isChecked));
            }
        });

        radioButtonGS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Log.e("Galatasaray", String.valueOf(isChecked));
            }
        });

    }
}
