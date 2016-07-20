package com.example.taku.dagger2unittestsample.viewmodels;

import com.example.taku.dagger2unittestsample.entities.User;
import com.example.taku.dagger2unittestsample.models.GithubModel;

import rx.Observable;

/**
 * Created by taku on 2016/07/20.
 */
public class MainViewModel {

    GithubModel githubModel;

    public MainViewModel() {
        githubModel = new GithubModel();
    }

    public Observable<User> getUser(String userName) {
        return githubModel.getUser(userName);
    }
}
