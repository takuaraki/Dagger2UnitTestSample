package com.example.taku.dagger2unittestsample.di;

import com.example.taku.dagger2unittestsample.MyApplication;

import dagger.Module;
import dagger.Provides;

/**
 * Created by taku on 2016/07/20.
 */
@Module
public class AppModule {

    private MyApplication myApplication;

    public AppModule(MyApplication myApplication) {
        this.myApplication = myApplication;
    }

    @Provides
    public MyApplication provideApplication() {
        return myApplication;
    }

}
