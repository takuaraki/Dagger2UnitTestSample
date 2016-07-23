package com.example.taku.dagger2unittestsample.di;

import com.example.taku.dagger2unittestsample.activities.BaseActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by taku on 2016/07/20.
 */
@Module
public class ActivityModule {

    private BaseActivity activity;

    public ActivityModule(BaseActivity activity) {
        this.activity = activity;
    }

    @Provides
    public BaseActivity provideActivity() {
        return activity;
    }

}
