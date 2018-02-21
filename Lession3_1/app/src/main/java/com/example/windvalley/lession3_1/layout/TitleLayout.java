package com.example.windvalley.lession3_1.layout;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.windvalley.lession3_1.R;

/**
 * Created by windvalley on 2018/2/15.
 */

public class TitleLayout extends LinearLayout {
    public TitleLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title, this);
        Button btnBack = (Button) findViewById(R.id.title_back_Button);
        btnBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Activity) getContext()).finish();
            }
        });

        Button btnEdit = (Button) findViewById(R.id.title_edit_Button);
        btnEdit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "You click edit button", Toast.LENGTH_LONG).show();
            }
        });
    }
}
