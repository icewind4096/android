package com.example.windvalley.helloworld;

import android.app.TaskStackBuilder;
import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        RelativeLayout layout = (RelativeLayout) findViewById(R.id.content);
        layout.addView(textView);

        //设置回主窗口的返回按钮,就是位于屏幕左边的返回按键
        //点击这个按键同样触发onOptionsItemSelected
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //为ActionBar扩展菜单项
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_add:   openAdd();
                                    return true;
//            case R.id.action_link:  openLink();
//                                    return true;
            case R.id.home:
                Intent intent = NavUtils.getParentActivityIntent(this);
                // 这个activity不是这个app任务的一部分
                if (NavUtils.shouldUpRecreateTask(this, intent) == true){
                    //所以当向上导航时,创建用合成后退栈(synthesized back stack)创建一个新任务
                    TaskStackBuilder.create(this)
                            // 添加这个activity的所有父activity到后退栈中
                            .addNextIntentWithParentStack(intent)
                            // 向上导航到最近的一个父activity
                            .startActivities();
                } else {
                    // 这个activity是这个app任务的一部分, 所以向上导航至逻辑父activity.
                    NavUtils.navigateUpTo(this, intent);
                }
                return true;
            default: return super.onOptionsItemSelected(item);
        }
    }

    private void openLink() {
    }

    private void openAdd() {
    }
}
