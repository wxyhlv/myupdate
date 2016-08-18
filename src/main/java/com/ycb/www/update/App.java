package com.ycb.www.update;

import android.app.Application;

import org.xutils.x;

/**
 * Created by hxh on 2015/12/21.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}
