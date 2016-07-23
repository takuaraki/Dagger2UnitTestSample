package com.example.taku.dagger2unittestsample.di;

import com.example.taku.dagger2unittestsample.viewmodels.MainViewModel;

import dagger.Subcomponent;

/**
 * Created by taku on 2016/07/20.
 */
@Subcomponent
public interface ViewModelComponent {

    void inject(MainViewModel viewModel);

}
