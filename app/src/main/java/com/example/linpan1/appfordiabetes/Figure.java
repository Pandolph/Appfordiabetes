package com.example.linpan1.appfordiabetes;

import android.app.Activity;
import android.os.Bundle;
import com.avos.avoscloud.AVObject;
import com.avos.avoscloud.AVException;

import android.util.Log;

import com.avos.avoscloud.*;

import java.util.List;

/**
 * Created by linpan1 on 15/3/25.
 */
public class Figure extends Activity{
    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.figure);

        AVQuery<AVObject> query = new AVQuery<AVObject>("GameScore");
        query.whereEqualTo("playerName", "steve");
        query.findInBackground(new FindCallback<AVObject>() {
            public void done(List<AVObject> avObjects, AVException e) {
                if (e == null) {
                    Log.d("成功", "查询到" + avObjects.size() + " 条符合条件的数据");
                } else {
                    Log.d("失败", "查询错误: " + e.getMessage());
                }
            }
        });

    }
}
