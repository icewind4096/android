package com.example.windvalley.lession3_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImageViewActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        imageView = findViewById(R.id.imageViewActivity_Image_1);
        Button button = (Button) findViewById(R.id.imageViewActivity_button_1);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageViewActivity_button_1: imageView.setImageResource(R.drawable.ic_launcher_foreground);
                                                    break;
            default:;
        }
    }
}
