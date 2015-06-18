package com.github.booknara.youtube.sample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.github.booknara.youtube.OpenYouTubePlayerActivity;

public class SampleActivity extends Activity {
    private static final String TAG = SampleActivity.class.getSimpleName();

    private TextView videoIdTextView;
    private Button viewVideoButton;

    @Override
    protected void onCreate(Bundle pSavedInstanceState) {
        super.onCreate(pSavedInstanceState);

        setContentView(R.layout.activity_sample);

        videoIdTextView = (TextView) findViewById(R.id.youtube_video_id_text);
        viewVideoButton = (Button) findViewById(R.id.view_video_id_button);

        viewVideoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pV) {

                String videoId = videoIdTextView.getText().toString();

                if (videoId.isEmpty() || videoId.trim().equals("")) {
                    Log.e(TAG, SampleActivity.this.getString(R.string.err_empty_video_id));
                    return;
                }

                Intent videoIntent = new Intent(null, Uri.parse("ytv://" + videoId), SampleActivity.this, OpenYouTubePlayerActivity.class);
                startActivity(videoIntent);
            }
        });

    }
}
