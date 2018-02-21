package com.example.windvalley.lession3_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonViewActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_view);
        initListen();
    }

    private void initListen() {
        Button button = (Button) findViewById(R.id.buttonViewActivity_buttonView_1);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonViewActivity_buttonView_1: Toast.makeText(view.getContext(), "自定义位置Toast", Toast.LENGTH_LONG).show();
                                                       break;
        }
    }
}
