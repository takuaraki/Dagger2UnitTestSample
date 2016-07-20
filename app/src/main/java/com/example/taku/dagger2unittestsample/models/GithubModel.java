package com.example.taku.dagger2unittestsample.models;

import com.example.taku.dagger2unittestsample.entities.User;

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

    Retrofit retrofit;

    public GithubModel() {
        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }

    public Observable<User> getUser(String userName) {
        return retrofit.create(GitHubService.class).getUser(userName);
    }

    public interface GitHubService {
        @GET("users/{user}")
        Observable<User> getUser(@Path("user") String userName);
    }
}
