package com.example.shashi.suntec.retrofit2example;

import java.io.IOException;
import java.util.List;

import retrofit.Call;
import retrofit.Retrofit;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by suntec on 14/12/15.
 */


public class SHWebService {

    public interface RestInterface {
        @GET("/users/{user}/repos")
        Call<List<GitRepo>> listRepos(@Path("user") String user);
    }


    Retrofit myRetrofit = new Retrofit.Builder().baseUrl("").build();

    RestInterface myRestInterface = myRetrofit.create(RestInterface.class);


    public List<GitRepo> getListRepos(String userName){

        Call<List<GitRepo>> repos = myRestInterface.listRepos("octocat");

        try {

             return repos.execute().body();

        } catch (IOException e) {
            e.printStackTrace();

        }

        return  null;
    }





}


