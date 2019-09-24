package com.serifgungor.videoviewkullanimi;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.videoView);

        // Durdur,devam et, geri al gibi işlemleri yapan nesnedir.
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        String videoPath="https://sample-videos.com/video123/mp4/720/big_buck_bunny_720p_1mb.mp4";
        Uri uri= Uri.parse(videoPath);

        //Video nereden yüklenecek
        videoView.setVideoURI(uri);
        videoView.start();


    }
}
