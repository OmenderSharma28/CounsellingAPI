package com.example.demo.model;

import java.io.Serializable;
import java.util.List;

//@JsonPropertyOrder({"user_name","display_name","avatar","geo_location","email","url","created_at","repos"})
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class BTClientResponseVO implements Serializable {
    String user_name;
    String display_name;
    String avatar;
    String geo_location;
    String email;
    String url;
    String created_at;
    List<BTNameUrlVO> repos;

    public BTClientResponseVO() {
    }

    public BTClientResponseVO(String user_name, String display_name, String avatar, String geo_location, String email, String url, String created_at, List<BTNameUrlVO> repos) {
        this.user_name = user_name;
        this.display_name = display_name;
        this.avatar = avatar;
        this.geo_location = geo_location;
        this.email = email;
        this.url = url;
        this.created_at = created_at;
        this.repos = repos;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getGeo_location() {
        return geo_location;
    }

    public void setGeo_location(String geo_location) {
        this.geo_location = geo_location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public List<BTNameUrlVO> getRepos() {
        return repos;
    }

    public void setRepos(List<BTNameUrlVO> repos) {
        this.repos = repos;
    }
}


/*
{
user_name: "octocat",
display_name: "The Octocat" ,
avatar: "https://avatars3.githubusercontent.com/u/583231?v=4 ",
geo_location: "San Francisco" ,
email: null,
url: "https://github.com/octocat ",
created_at: "2011-01-25 18:44:36" ,
repos: [
{
name: "boysenberry-repo-1" ,
 url: "https://github.com/octocat/boysenberry-repo-1 "
}, ...
 ]
}
 */