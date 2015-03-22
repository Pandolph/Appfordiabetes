package com.example.linpan1.appfordiabetes;

import android.app.Application;

import com.avos.avoscloud.AVAnalytics;
import com.avos.avoscloud.AVOSCloud;
import com.avos.avoscloud.AVObject;

/**
 * Created by linpan1 on 15/3/23.
 */
public class AppApplication extends Application {

    @Override
    public  void onCreate(){
        super.onCreate();
        //如果使用美国节点，请加上这行代码 AVOSCloud.useAVCloudUS();
        AVOSCloud.initialize(this, "2s4amu2ol6y6j369flxy4orr38o4rtpoj2tldfvx4yk1945g", "x0wktubwarcb37tp4i3mhxvlbgaretjaxxiakua3mcjjt3ft");
        // 启用崩溃错误报告
        AVOSCloud.setDebugLogEnabled(true);


    }


}
