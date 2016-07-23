package com.example.taku.dagger2unittestsample.models;

import com.example.taku.dagger2unittestsample.services.GitHubServiceMock;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by taku on 2016/07/23.
 */
public class GithubModelTest {

    GithubModel githubModel;

    @Before
    public void setUp() throws Exception {
        githubModel = new GithubModel();
        githubModel.gitHubService = new GitHubServiceMock();
    }

    @Test
    public void testGetUser() throws Exception {
        String userName = "takuaraki";
        githubModel.getUser(userName).subscribe(user -> {
            assertEquals(userName, user.login);
        });
    }
}