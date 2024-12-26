package com.sejong.project.argus.global.auth.token.vo;

public record RefreshToken(
        String token
) {
    public static RefreshToken of(String token) {
        return new RefreshToken(token);
    }
}

