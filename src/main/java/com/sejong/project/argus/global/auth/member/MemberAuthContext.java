package com.sejong.project.argus.global.auth.member;

import com.sejong.project.argus.member.model.Member;
import com.sejong.project.argus.member.model.MemberOAuth;
import lombok.Builder;

@Builder
public record MemberAuthContext(
        Long id,
        String name,
        String role,
        String email,
        String password,
        MemberOAuth providerType
) {
    public static MemberAuthContext of(Member member, MemberOAuth providerType) {
        return MemberAuthContext.builder()
                .email(member.getMemberEmail())
                .name(member.getMemberName())
                .password(member.getMemberPassword())
                .role(member.getRole().toString())
                .id(member.getId())
                .providerType(providerType)
                .build();
    }
}
