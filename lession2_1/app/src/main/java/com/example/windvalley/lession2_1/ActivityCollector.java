package com.example.windvalley.lession2_1;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by windvalley on 2018/2/10.
 */

public class ActivityCollector {
    public static List<Activity> activityList = new ArrayList<Activity>();

    public static void addActivity(Activity activity){
        activityList.add(activity);
    }

    public static void removeActivity(Activity activity){
        activityList.remove(activity);
    }

    public static void finishAll(){
        for (Activity activity: activityList){
            if (activity.isFinishing() == false){
                activity.finish();
            }
        }
    }
}
