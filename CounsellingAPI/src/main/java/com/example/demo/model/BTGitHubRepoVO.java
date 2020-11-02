package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

import java.io.Serializable;
import java.util.List;

@JsonPropertyOrder({"id", "node_id", "name", "full_name", "owner", "html_url", "description", "url", "forks_url", "keys_url", "collaborators_url"
        , "teams_url", "hooks_url", "issue_events_url", "events_url", "assignees_url", "branches_url", "tags_url", "blobs_url"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BTGitHubRepoVO implements Serializable, ToString2 {

    protected Long id;
    protected String node_id;
    protected String name;
    protected String full_name;
    protected List<BTGitHubRepoVO> owner;
    protected String html_url;
    protected String description;
    protected String url;
    protected String forks_url;
    protected String keys_url;
    protected String collaborators_url;
    protected String teams_url;
    protected String hooks_url;
    protected String issue_events_url;
    protected String events_url;
    protected String assignees_url;
    protected String branches_url;
    protected String tags_url;
    protected String blobs_url;

    public BTGitHubRepoVO() {
    }

    public BTGitHubRepoVO(Long id, String node_id, String name, String full_name, List<BTGitHubRepoVO> owner, String html_url, String description,
                          String url, String forks_url, String keys_url, String collaborators_url, String teams_url, String hooks_url, String issue_events_url,
                          String events_url, String assignees_url, String branches_url, String tags_url, String blobs_url) {
        this.id = id;
        this.node_id = node_id;
        this.name = name;
        this.full_name = full_name;
        this.owner = owner;
        this.html_url = html_url;
        this.description = description;
        this.url = url;
        this.forks_url = forks_url;
        this.keys_url = keys_url;
        this.collaborators_url = collaborators_url;
        this.teams_url = teams_url;
        this.hooks_url = hooks_url;
        this.issue_events_url = issue_events_url;
        this.events_url = events_url;
        this.assignees_url = assignees_url;
        this.branches_url = branches_url;
        this.tags_url = tags_url;
        this.blobs_url = blobs_url;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public List<BTGitHubRepoVO> getOwner() {
        return owner;
    }

    public void setOwner(List<BTGitHubRepoVO> owner) {
        this.owner = owner;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getForks_url() {
        return forks_url;
    }

    public void setForks_url(String forks_url) {
        this.forks_url = forks_url;
    }

    public String getKeys_url() {
        return keys_url;
    }

    public void setKeys_url(String keys_url) {
        this.keys_url = keys_url;
    }

    public String getCollaborators_url() {
        return collaborators_url;
    }

    public void setCollaborators_url(String collaborators_url) {
        this.collaborators_url = collaborators_url;
    }

    public String getTeams_url() {
        return teams_url;
    }

    public void setTeams_url(String teams_url) {
        this.teams_url = teams_url;
    }

    public String getHooks_url() {
        return hooks_url;
    }

    public void setHooks_url(String hooks_url) {
        this.hooks_url = hooks_url;
    }

    public String getIssue_events_url() {
        return issue_events_url;
    }

    public void setIssue_events_url(String issue_events_url) {
        this.issue_events_url = issue_events_url;
    }

    public String getEvents_url() {
        return events_url;
    }

    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    public String getAssignees_url() {
        return assignees_url;
    }

    public void setAssignees_url(String assignees_url) {
        this.assignees_url = assignees_url;
    }

    public String getBranches_url() {
        return branches_url;
    }

    public void setBranches_url(String branches_url) {
        this.branches_url = branches_url;
    }

    public String getTags_url() {
        return tags_url;
    }

    public void setTags_url(String tags_url) {
        this.tags_url = tags_url;
    }

    public String getBlobs_url() {
        return blobs_url;
    }

    public void setBlobs_url(String blobs_url) {
        this.blobs_url = blobs_url;
    }

    @Override
    public StringBuilder append(ObjectLocator objectLocator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(objectLocator, this, buffer);
        this.appendFields(objectLocator, buffer, strategy);
        strategy.appendEnd(objectLocator, this, buffer);
        return buffer;
    }

    @Override
    public StringBuilder appendFields(ObjectLocator objectLocator, StringBuilder stringBuilder, ToStringStrategy2 toStringStrategy2) {
        return null;
    }

    public String toString() {
        ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        StringBuilder buffer = new StringBuilder();
        this.append((ObjectLocator) null, buffer, strategy);
        return buffer.toString();
    }
}
