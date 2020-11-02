package com.example.demo.enums;

public enum NTClientProfileEnum {

    USER_NOT_FOUND("SPECIFIC USER NOT FOUND"),
    REPO_NOT_FOUND("REPOS NOT FOUND FOR SPECIFIC USER");

    public String source;

    NTClientProfileEnum(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
