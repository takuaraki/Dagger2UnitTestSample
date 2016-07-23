package com.example.taku.dagger2unittestsample.di;

import com.example.taku.dagger2unittestsample.activities.MainActivity;

import dagger.Subcomponent;

/**
 * Created by taku on 2016/07/20.
 */
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    ViewModelComponent createViewModelComponent();

    void inject(MainActivity activity);

}
