package com.example.shashi.suntec.retrofit2example;

/**
 * Created by suntec on 14/12/15.
 */


public class GitRepo {

    private int id;
    private String name;
    private String description;

    public String isDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    private  class Owner {
            private String login;
            private  int id;


        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    @Override
    public String toString() {
        super.toString();

            Owner repoOwner = this.new Owner();


            return "GitRepo = name = "+this.getName()+" id = "+this.getId()+" owner user-name ="+repoOwner.getLogin();
    }
}
