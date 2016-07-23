package com.example.taku.dagger2unittestsample.services;

import com.example.taku.dagger2unittestsample.entities.User;

import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by taku on 2016/07/23.
 */
public class GitHubServiceMock implements GitHubService {

    @Override
    public Observable<User> getUser(@Path("user") String userName) {
        return Observable.fromCallable(() -> {
            User user = new User();
            user.id = 12345;
            user.login = userName;
            return user;
        });
    }

}
