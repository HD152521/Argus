package com.sejong.project.argus.member.dto;

import com.sejong.project.argus.global.auth.token.vo.TokenResponse;
import org.yj.sejongauth.domain.SjProfile;

public class MemberResponse {

    public record MemberLocalLoginRequestDto(
            String name,
            String major,
            String studentCode
    ){
        public static MemberLocalLoginRequestDto from(SjProfile profile){
            return new MemberLocalLoginRequestDto(
                    profile.getName(),
                    profile.getMajor(),
                    profile.getStudentCode()
            );
        }
    }

    public record MemberTokenResDto(
            TokenResponse tokenResponse
    ){
        public static MemberTokenResDto from(TokenResponse tokenResponse) {
            return new MemberTokenResDto(tokenResponse);
        }
    }
}
