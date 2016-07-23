package com.example.taku.dagger2unittestsample.activities;

import android.support.v7.app.AppCompatActivity;

import com.example.taku.dagger2unittestsample.MyApplication;
import com.example.taku.dagger2unittestsample.di.ActivityComponent;
import com.example.taku.dagger2unittestsample.di.ActivityModule;

public class BaseActivity extends AppCompatActivity {

    public ActivityComponent getComponent() {
        return MyApplication.getComponent(this).createActivityComponent(new ActivityModule(this));
    }

}
