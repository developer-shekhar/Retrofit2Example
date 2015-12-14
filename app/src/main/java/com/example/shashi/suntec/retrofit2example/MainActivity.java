package com.example.shashi.suntec.retrofit2example;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    SHWebService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiService = new SHWebService();

    }


    private class BackgroundTask extends AsyncTask<Void, Void,
            List<GitRepo>> {


        @Override
        protected void onPreExecute() {

        }

        @Override
        protected List<GitRepo> doInBackground(Void... params) {

            return apiService.getListRepos("developer-shekhar");


        }

        @Override
        protected void onPostExecute(List<GitRepo> gitRepos) {
            super.onPostExecute(gitRepos);

            GitRepo myGitRepo;
            //show gitRepos
             for (int i=0; i< gitRepos.size(); i++){

                 myGitRepo = gitRepos.get(i);

                 if(myGitRepo != null){
                     Log.d("MainActivity", myGitRepo.toString());
                 }
             }

        }

    }

}
