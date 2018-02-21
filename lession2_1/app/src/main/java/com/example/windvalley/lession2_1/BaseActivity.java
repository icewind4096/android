package com.example.windvalley.lession2_1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by windvalley on 2018/2/10.
 */

public class BaseActivity extends AppCompatActivity {
    public static ActivityCollector collector = new ActivityCollector();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        collector.addActivity(this);
        Log.d("BaseActivity", getClass().getSimpleName());
    }

    @Override
    protected void onDestroy() {
        collector.removeActivity(this);
        super.onDestroy();
    }
}
