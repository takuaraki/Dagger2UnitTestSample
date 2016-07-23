package com.example.taku.dagger2unittestsample.services;

import com.example.taku.dagger2unittestsample.entities.User;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by taku on 2016/07/23.
 */
public interface GitHubService {
    @GET("users/{user}")
    Observable<User> getUser(@Path("user") String userName);
}
