package com.example.taku.dagger2unittestsample.di;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by taku on 2016/07/20.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    ActivityComponent createActivityComponent(ActivityModule activityModule);

}
