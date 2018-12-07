package com.info.androidalmayaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    private Button buttonGit4e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        buttonGit4e = findViewById(R.id.buttonGit4e);

        buttonGit4e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ThirdActivity.this,FourthActivity.class);

                startActivity(i);
                finish();

            }
        });


    }
}
