package com.sejong.project.argus.member.model;


import lombok.Getter;

@Getter
public enum OAuthProviderType {
    LOCAL("local"),
    GOOGLE("google");

    private final String provider;

    OAuthProviderType(String provider) {
        this.provider = provider;
    }
}