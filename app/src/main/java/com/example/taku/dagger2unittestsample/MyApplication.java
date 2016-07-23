package com.example.taku.dagger2unittestsample;

import android.app.Application;
import android.content.Context;

import com.example.taku.dagger2unittestsample.di.AppComponent;
import com.example.taku.dagger2unittestsample.di.AppModule;
import com.example.taku.dagger2unittestsample.di.DaggerAppComponent;

/**
 * Created by taku on 2016/07/23.
 */
public class MyApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public static AppComponent getComponent(Context context) {
        MyApplication application = (MyApplication) context.getApplicationContext();
        return application.appComponent;
    }

}
