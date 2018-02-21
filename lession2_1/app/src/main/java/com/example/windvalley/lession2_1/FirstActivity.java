package com.example.windvalley.lession2_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button1 = (Button) findViewById(R.id.btnFinish);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Toast.makeText(FirstActivity.this, "You quit app", Toast.LENGTH_SHORT).show();
            }
        });

        Button button2 = (Button) findViewById(R.id.btnShowSecondActivity);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //显式调用
                //Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                //隐式调用 "com.example.windvalley.lession2_1.ACTION_START" 与AndroidManifest.xml中的
                //Intent中的filter匹配
                Intent intent = new Intent("com.example.windvalley.lession2_1.ACTION_START");
                intent.addCategory("com.example.windvalley.lession2_1.MY_CATEGORY");
                intent.putExtra("name", "sony");
                intent.putExtra("product", "mobil phone");
                intent.putExtra("price", 123.45);
                //启动窗口
                startActivity(intent);
            }
        });

        Button button3 = (Button) findViewById(R.id.btnShowSecondActivityResult);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //显式调用
                //Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                //隐式调用 "com.example.windvalley.lession2_1.ACTION_START" 与AndroidManifest.xml中的
                //Intent中的filter匹配
                Intent intent = new Intent(FirstActivity.this, ThirdActivity.class);
                intent.putExtra("name", "sony");
                intent.putExtra("product", "mobil phone");
                intent.putExtra("price", 123.45);
                //启动窗口
                startActivityForResult(intent, 1);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item: Toast.makeText(FirstActivity.this, "You click add item", Toast.LENGTH_SHORT).show();
                                break;
            case R.id.remove_item: Toast.makeText(FirstActivity.this, "You click remove item", Toast.LENGTH_SHORT).show();
                                    break;
            default:return super.onOptionsItemSelected(item);
        }
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    Log.d("name", data.getStringExtra("name"));
                }
                break;
            default: ;
        }
    }
}
