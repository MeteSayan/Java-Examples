package com.info.androidgrselnesneler2;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;

public class Main2Activity extends AppCompatActivity {

    private Button buttonDegistir,buttonBasla,buttonDurdur;
    private ImageView ımageView;
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonDegistir = findViewById(R.id.buttonDegistir);
        buttonBasla = findViewById(R.id.buttonBasla);
        buttonDurdur = findViewById(R.id.buttonDurdur);
        ımageView = findViewById(R.id.imageView);
        videoView = findViewById(R.id.videoView);

        buttonDegistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ımageView.setImageResource(R.drawable.ic_brightness_4_black_24dp);
            }
        });

        buttonBasla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri adres = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video);

                videoView.setVideoURI(adres);
                videoView.start();
            }
        });

        buttonDurdur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.stopPlayback();
            }
        });

    }
}
