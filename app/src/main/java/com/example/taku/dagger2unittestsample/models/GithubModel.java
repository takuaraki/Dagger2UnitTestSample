package com.example.taku.dagger2unittestsample.models;

import com.example.taku.dagger2unittestsample.entities.User;
import com.example.taku.dagger2unittestsample.services.GitHubService;

import javax.inject.Inject;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by taku on 2016/07/20.
 */
public class GithubModel {

    @Inject
    GitHubService gitHubService;

    @Inject
    public GithubModel() {
    }

    public Observable<User> getUser(String userName) {
        return gitHubService.getUser(userName);
    }

}
