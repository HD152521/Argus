package com.sejong.project.argus.member.service;

import com.sejong.project.argus.global.auth.member.MemberAuthContext;
import com.sejong.project.argus.global.exception.BaseException;
import com.sejong.project.argus.global.exception.codes.ErrorCode;
import com.sejong.project.argus.member.dto.MemberDetails;
import com.sejong.project.argus.member.model.Member;
import com.sejong.project.argus.member.model.MemberOAuth;
import com.sejong.project.argus.member.repository.MemberOAuthRepository;
import com.sejong.project.argus.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import static com.sejong.project.argus.global.exception.codes.ErrorCode.BAD_REQUEST;

@RequiredArgsConstructor
@Service
@Slf4j
public class MemberDetailsService implements UserDetailsService {

    private final MemberRepository memberRepository;
    private final MemberOAuthRepository memberOAuthRepository;

    @Override
    public MemberDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Member member = memberRepository.findMemberByMemberEmail(username)
                .orElseThrow(() -> {
                    log.info("[loadUserByUsername] username:{}, {}", username, ErrorCode.MEMBER_NOT_FOUND);
                    return new BaseException(ErrorCode.MEMBER_NOT_FOUND);
                });

        MemberOAuth memberOAuth = memberOAuthRepository
                .findByMember(member)
                .orElseThrow(() -> new BaseException(BAD_REQUEST));

        MemberAuthContext ctx = MemberAuthContext.of(member,memberOAuth);
        return new MemberDetails(ctx);
    }
}