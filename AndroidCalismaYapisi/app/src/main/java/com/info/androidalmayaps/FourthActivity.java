package com.info.androidalmayaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourthActivity extends AppCompatActivity {

    private Button buttonGit2e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        buttonGit2e = findViewById(R.id.buttonGit2e);

        buttonGit2e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(FourthActivity.this,SecondActivity.class) ;

                startActivity(i);
                finish();
            }
        });


    }
}
