package com.info.androidalmayaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textViewMsj;
    private Button buttonGit3e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewMsj = findViewById(R.id.textViewMsj);
        buttonGit3e = findViewById(R.id.buttonGit3e);

        buttonGit3e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(i);
                finish();
            }
        });

        /*String gelenMsj = getIntent().getStringExtra("mesaj");
        int gelenYas = getIntent().getIntExtra("yas", 0);
        double gelenBoy = getIntent().getDoubleExtra("boy", 0.0);
        boolean gelenBekarMi = getIntent().getBooleanExtra("bekarmi", false);*/

        /*Kisiler gelenKisi = (Kisiler) getIntent().getSerializableExtra("nesne");

        textViewMsj.setText(gelenKisi.getIsim() + " - " + gelenKisi.getYas() + " - " + gelenKisi.getBoy() + " - " + gelenKisi.isBekarMi() );*/

    }

   /* @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent i = new Intent(SecondActivity.this,MainActivity.class);
        startActivity(i);

    }*/
}
