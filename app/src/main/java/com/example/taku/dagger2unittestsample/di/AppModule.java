package com.example.taku.dagger2unittestsample.di;

import com.example.taku.dagger2unittestsample.MyApplication;
import com.example.taku.dagger2unittestsample.services.GitHubService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

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

    @Provides
    public GitHubService provideGitHubService() {
        return new Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build()
                .create(GitHubService.class);
    }

}
