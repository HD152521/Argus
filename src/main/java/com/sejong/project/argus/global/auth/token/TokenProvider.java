package com.sejong.project.argus.global.auth.token;

import com.sejong.project.argus.global.auth.token.vo.AccessToken;
import com.sejong.project.argus.global.auth.token.vo.RefreshToken;
import com.sejong.project.argus.member.model.Member;

public interface TokenProvider {
    AccessToken generateAccessToken(Member member);

    RefreshToken generateRefreshToken(Member member);
}
