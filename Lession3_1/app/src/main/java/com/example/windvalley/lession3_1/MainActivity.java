package com.example.windvalley.lession3_1;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListen();
    }

    private void initListen() {
        Button button = (Button) findViewById(R.id.mainActivate_Show);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                RadioGroup radioGroup = findViewById(R.id.radViewGroup);
                switch (radioGroup.getCheckedRadioButtonId()){
                    case R.id.radTextView: intent = new Intent(MainActivity.this, TextViewActivity.class);
                    case R.id.radButtonView: intent = new Intent(MainActivity.this, ButtonViewActivity.class);
                    case R.id.textEditView: intent = new Intent(MainActivity.this, EditTextViewActivity.class);
                    case R.id.imageView: intent = new Intent(MainActivity.this, ImageViewActivity.class);
                    case R.id.progressBarView: intent = new Intent(MainActivity.this, ProgressBarViewActivity.class);
                    case R.id.alertDialogView: intent = new Intent(MainActivity.this, AlertDialogViewActivity.class);
                    case R.id.linearLayout: intent = new Intent(MainActivity.this, LinearLayoutActivity.class);
                    case R.id.inputLayout: intent = new Intent(MainActivity.this, InputLayoutActivity.class);
                    case R.id.listView: intent = new Intent(MainActivity.this, ListViewActivity.class);
                    case R.id.recyclerView: intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                }
                startActivity(intent);
            }
        });
    }
}
