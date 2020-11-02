package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

import java.io.Serializable;


@JsonPropertyOrder({"login", "id", "node_id", "avatar_url", "gravatar_id", "url", "html_url", "followers_url", "following_url", "gists_url", "starred_url", "subscriptions_url"
        , "organizations_url", "repos_url", "events_url", "received_events_url", "type", "site_admin", "name", "company", "blog", "location", "email", "hireable", "bio"
        , "twitter_username", "public_repos", "public_gists", "followers", "following", "created_at", "updated_at"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BTGitHubUsersVO implements Serializable, ToString2 {
    protected String login;
    protected Long id;
    protected String node_id;
    protected String avatar_url;
    protected String gravatar_id;
    protected String url;
    protected String html_url;
    protected String followers_url;
    protected String following_url;
    protected String gists_url;
    protected String starred_url;
    protected String subscriptions_url;
    protected String organizations_url;
    protected String repos_url;
    protected String events_url;
    protected String received_events_url;
    protected String type;
    protected String site_admin;
    protected String name;
    protected String company;
    protected String blog;
    protected String location;
    protected String email;
    protected String hireable;
    protected String bio;
    protected String twitter_username;
    protected int public_repos;
    protected int public_gists;
    protected int followers;
    protected int following;
    protected String created_at;
    protected String updated_at;

    public BTGitHubUsersVO() {
    }

    public BTGitHubUsersVO(String login, Long id, String node_id, String avatar_url, String gravatar_id, String url, String html_url,
                           String followers_url, String following_url, String gists_url, String starred_url, String subscriptions_url,
                           String organizations_url, String repos_url, String events_url, String received_events_url, String type,
                           String site_admin, String name, String company, String blog, String location, String email, String hireable,
                           String bio, String twitter_username, int public_repos, int public_gists, int followers, int following,
                           String created_at, String updated_at) {
        this.login = login;
        this.id = id;
        this.node_id = node_id;
        this.avatar_url = avatar_url;
        this.gravatar_id = gravatar_id;
        this.url = url;
        this.html_url = html_url;
        this.followers_url = followers_url;
        this.following_url = following_url;
        this.gists_url = gists_url;
        this.starred_url = starred_url;
        this.subscriptions_url = subscriptions_url;
        this.organizations_url = organizations_url;
        this.repos_url = repos_url;
        this.events_url = events_url;
        this.received_events_url = received_events_url;
        this.type = type;
        this.site_admin = site_admin;
        this.name = name;
        this.company = company;
        this.blog = blog;
        this.location = location;
        this.email = email;
        this.hireable = hireable;
        this.bio = bio;
        this.twitter_username = twitter_username;
        this.public_repos = public_repos;
        this.public_gists = public_gists;
        this.followers = followers;
        this.following = following;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNode_id() {
        return node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getGravatar_id() {
        return gravatar_id;
    }

    public void setGravatar_id(String gravatar_id) {
        this.gravatar_id = gravatar_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getFollowers_url() {
        return followers_url;
    }

    public void setFollowers_url(String followers_url) {
        this.followers_url = followers_url;
    }

    public String getFollowing_url() {
        return following_url;
    }

    public void setFollowing_url(String following_url) {
        this.following_url = following_url;
    }

    public String getGists_url() {
        return gists_url;
    }

    public void setGists_url(String gists_url) {
        this.gists_url = gists_url;
    }

    public String getStarred_url() {
        return starred_url;
    }

    public void setStarred_url(String starred_url) {
        this.starred_url = starred_url;
    }

    public String getSubscriptions_url() {
        return subscriptions_url;
    }

    public void setSubscriptions_url(String subscriptions_url) {
        this.subscriptions_url = subscriptions_url;
    }

    public String getOrganizations_url() {
        return organizations_url;
    }

    public void setOrganizations_url(String organizations_url) {
        this.organizations_url = organizations_url;
    }

    public String getRepos_url() {
        return repos_url;
    }

    public void setRepos_url(String repos_url) {
        this.repos_url = repos_url;
    }

    public String getEvents_url() {
        return events_url;
    }

    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    public String getReceived_events_url() {
        return received_events_url;
    }

    public void setReceived_events_url(String received_events_url) {
        this.received_events_url = received_events_url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSite_admin() {
        return site_admin;
    }

    public void setSite_admin(String site_admin) {
        this.site_admin = site_admin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHireable() {
        return hireable;
    }

    public void setHireable(String hireable) {
        this.hireable = hireable;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getTwitter_username() {
        return twitter_username;
    }

    public void setTwitter_username(String twitter_username) {
        this.twitter_username = twitter_username;
    }

    public int getPublic_repos() {
        return public_repos;
    }

    public void setPublic_repos(int public_repos) {
        this.public_repos = public_repos;
    }

    public int getPublic_gists() {
        return public_gists;
    }

    public void setPublic_gists(int public_gists) {
        this.public_gists = public_gists;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public StringBuilder append(ObjectLocator objectLocator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(objectLocator, this, buffer);
        this.appendFields(objectLocator, buffer, strategy);
        strategy.appendEnd(objectLocator, this, buffer);
        return buffer;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        String Tlogin = this.login;
        strategy.appendField(locator, this, "login", buffer, Tlogin, this.login != null);
        Long Tid = this.id;
        strategy.appendField(locator, this, "id", buffer, Tid, true);
        String Tnode_id = this.node_id;
        strategy.appendField(locator, this, "node_id", buffer, Tnode_id, this.node_id != null);
        String Tavatar_url = this.avatar_url;
        strategy.appendField(locator, this, "avatar_url", buffer, Tavatar_url, this.avatar_url != null);
        String Tgravatar_id = this.gravatar_id;
        strategy.appendField(locator, this, "gravatar_id", buffer, Tgravatar_id, this.gravatar_id != null);
        String Turl = this.url;
        strategy.appendField(locator, this, "url", buffer, Turl, this.url != null);
        String Thtml_url = this.html_url;
        strategy.appendField(locator, this, "html_url", buffer, Thtml_url, this.html_url != null);
        String Tfollowers_url = this.followers_url;
        strategy.appendField(locator, this, "followers_url", buffer, Tfollowers_url, this.followers_url != null);

        String Tfollowing_url = this.following_url;
        strategy.appendField(locator, this, "following_url", buffer, Tfollowing_url, this.following_url != null);
        String Tgists_url = this.gists_url;
        strategy.appendField(locator, this, "gists_url", buffer, Tgists_url, this.gists_url != null);
        String Tstarred_url = this.starred_url;
        strategy.appendField(locator, this, "starred_url", buffer, Tstarred_url, this.starred_url != null);
        String Tsubscriptions_url = this.subscriptions_url;
        strategy.appendField(locator, this, "subscriptions_url", buffer, Tsubscriptions_url, this.subscriptions_url != null);
        String Torganizations_url = this.organizations_url;
        strategy.appendField(locator, this, "organizations_url", buffer, Torganizations_url, this.organizations_url != null);
        String Trepos_url = this.repos_url;
        strategy.appendField(locator, this, "repos_url", buffer, Trepos_url, this.repos_url != null);

        String Treceived_events_url = this.received_events_url;
        strategy.appendField(locator, this, "received_events_url", buffer, Treceived_events_url, this.received_events_url != null);
        String Ttype = this.type;
        strategy.appendField(locator, this, "type", buffer, Ttype, this.type != null);
        String Tsite_admin = this.site_admin;
        strategy.appendField(locator, this, "site_admin", buffer, Tsite_admin, this.site_admin != null);
        String Tname = this.url;
        strategy.appendField(locator, this, "name", buffer, Tname, this.name != null);
        String Tcompany = this.company;
        strategy.appendField(locator, this, "company", buffer, Tcompany, this.company != null);
        String Tblog = this.blog;
        strategy.appendField(locator, this, "blog", buffer, Tblog, this.blog != null);
        String Tlocation = this.location;
        strategy.appendField(locator, this, "location", buffer, Tlocation, this.location != null);
        String Temail = this.email;
        strategy.appendField(locator, this, "email", buffer, Temail, this.email != null);

        String Thireable = this.hireable;
        strategy.appendField(locator, this, "hireable", buffer, Thireable, this.hireable != null);
        String Tbio = this.bio;
        strategy.appendField(locator, this, "bio", buffer, Tbio, this.bio != null);
        String Ttwitter_username = this.twitter_username;
        strategy.appendField(locator, this, "twitter_username", buffer, Ttwitter_username, this.twitter_username != null);
        int Tpublic_repos = this.public_repos;
        strategy.appendField(locator, this, "public_repos", buffer, Tpublic_repos, true);
        int Tpublic_gists = this.public_gists;
        strategy.appendField(locator, this, "public_gists", buffer, Tpublic_gists, true);
        int Tfollowers = this.followers;
        strategy.appendField(locator, this, "followers", buffer, Tfollowers, true);
        int Tfollowing = this.following;
        strategy.appendField(locator, this, "following", buffer, Tfollowing, true);
        String Tcreated_at = this.created_at;
        strategy.appendField(locator, this, "created_at", buffer, Tcreated_at, this.created_at != null);
        String Tupdated_at = this.bio;
        strategy.appendField(locator, this, "updated_at", buffer, Tupdated_at, this.updated_at != null);
        return buffer;
    }



    public String toString() {
        ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        StringBuilder buffer = new StringBuilder();
        this.append((ObjectLocator) null, buffer, strategy);
        return buffer.toString();
    }
}


/*
{
  "login": "octocat",
  "id": 583231,
  "node_id": "MDQ6VXNlcjU4MzIzMQ==",
  "avatar_url": "https://avatars3.githubusercontent.com/u/583231?v=4",
  "gravatar_id": "",
  "url": "https://api.github.com/users/octocat",
  "html_url": "https://github.com/octocat",
  "followers_url": "https://api.github.com/users/octocat/followers",
  "following_url": "https://api.github.com/users/octocat/following{/other_user}",
  "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
  "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
  "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
  "organizations_url": "https://api.github.com/users/octocat/orgs",
  "repos_url": "https://api.github.com/users/octocat/repos",
  "events_url": "https://api.github.com/users/octocat/events{/privacy}",
  "received_events_url": "https://api.github.com/users/octocat/received_events",
  "type": "User",
  "site_admin": false,
  "name": "The Octocat",
  "company": "@github",
  "blog": "https://github.blog",
  "location": "San Francisco",
  "email": null,
  "hireable": null,
  "bio": null,
  "twitter_username": null,
  "public_repos": 8,
  "public_gists": 8,
  "followers": 3317,
  "following": 9,
  "created_at": "2011-01-25T18:44:36Z",
  "updated_at": "2020-10-28T10:41:52Z"
}
 */