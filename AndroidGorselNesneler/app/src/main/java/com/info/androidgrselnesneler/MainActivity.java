package com.info.androidgrselnesneler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewCikti;
    private EditText editTextGirdi;
    private Button buttonYap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewCikti = findViewById(R.id.textViewCikti);
        editTextGirdi = findViewById(R.id.editTextGirdi);
        buttonYap = findViewById(R.id.buttonYap);

        buttonYap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String alinanVeri = editTextGirdi.getText().toString();

                if (!TextUtils.isEmpty(alinanVeri)){
                    if (alinanVeri.length() < 6){
                        textViewCikti.setText("Veri en az 6 karakter olmalı");
                    }
                    else{textViewCikti.setText(alinanVeri);}
                }
                else {
                    textViewCikti.setText("Veri Yok");
                }




                editTextGirdi.setText("");
            }
        });

    }
}
