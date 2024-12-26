package com.sejong.project.argus.global.auth.token.vo;


public record TokenResponse(
        AccessToken accessToken,
        RefreshToken refreshToken
) {
    public static TokenResponse of(AccessToken accessToken, RefreshToken refreshToken) {
        return new TokenResponse(accessToken, refreshToken);
    }
}
