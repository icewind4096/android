package com.example.windvalley.lession2_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);

        Button button = (Button) findViewById(R.id.btnBackFirstActivityData);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                Log.d("Second Activity String paramater name", intent.getStringExtra("name"));
                Log.d("Second Activity String paramater product", intent.getStringExtra("product"));
                Log.d("Second Activity double paramater price", String.valueOf(intent.getDoubleExtra("price", 0)));

                Intent intentResult = new Intent();
                intentResult.putExtra("name", "ibm");
                setResult(RESULT_OK, intentResult);
                finish();
            }
        });

        Button buttonCloseAppp = (Button) findViewById(R.id.btnCloseApp);
        buttonCloseAppp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityCollector.finishAll();
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intentResult = new Intent();
        intentResult.putExtra("name", "ibm");
        setResult(RESULT_OK, intentResult);
        finish();
    }
}
