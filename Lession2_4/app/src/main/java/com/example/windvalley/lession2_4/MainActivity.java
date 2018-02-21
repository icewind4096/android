package com.example.windvalley.lession2_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "CREATE");
        Log.i(TAG, this.toString());

        setContentView(R.layout.activity_main);

        if (savedInstanceState != null){
            Log.i(TAG, savedInstanceState.getString("key"));
        }

        Button btnStartNormal = (Button) findViewById(R.id.start_normal_activity);
        btnStartNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button btnStartDialog = (Button) findViewById(R.id.start_dialog_activity);
        btnStartDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DialogActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        Log.i(TAG, "START");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i(TAG, "RESUME");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i(TAG, "PAUSE");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i(TAG, "STOP");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.i(TAG, "RESTART");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.i(TAG, "DESTORY");
        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.i(TAG, "save instance state");
        super.onSaveInstanceState(outState);
        outState.putString("key", "abc");
    }
}
