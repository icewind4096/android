package com.example.windvalley.lession3_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class ProgressBarViewActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar_view);
        Button button = (Button) findViewById(R.id.progressBarView_button_show);
        button.setOnClickListener(this);
        startThread();
    }

    private void startThread() {
        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBarView_progress);
        new Thread(){
            public void run(){
                while (true){
                    if (progressBar.getProgress() == 100){
                        progressBar.setProgress(0);
                    } else {
                        progressBar.setProgress(progressBar.getProgress() + 1);
                    }
                }
            }
        }.start();
    }

    @Override
    public void onClick(View view) {
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBarView_progress);
        switch (view.getId()){
            case R.id.progressBarView_button_show:
                if (progressBar.getVisibility() == View.GONE){
                    progressBar.setVisibility(View.VISIBLE);
                }
                else {
                    progressBar.setVisibility(View.GONE);
                }
        }
    }
}
