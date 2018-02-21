package com.example.windvalley.lession3_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditTextViewActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text_view);
        Button button = findViewById(R.id.editTextViewActivity_button_1);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.editTextViewActivity_button_1:
                EditText editText = (EditText) findViewById(R.id.editTextViewActivity_editText_1);
                Toast.makeText(view.getContext(), editText.getText(), Toast.LENGTH_LONG).show();
                break;
            default:;
        }
    }
}
