package com.example.taku.dagger2unittestsample.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.taku.dagger2unittestsample.R;
import com.example.taku.dagger2unittestsample.viewmodels.MainViewModel;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainViewModel = new MainViewModel();
        mainViewModel.getUser("takuaraki")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(user -> {
                    Toast.makeText(MainActivity.this, user.toString(), Toast.LENGTH_SHORT).show();
                });
    }
}
