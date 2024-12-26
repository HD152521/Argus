package com.sejong.project.argus.member.service;

import com.sejong.project.argus.global.exception.BaseException;
import com.sejong.project.argus.member.dto.MemberRequest;
import com.sejong.project.argus.member.dto.MemberResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yj.sejongauth.controller.Sj;
import org.yj.sejongauth.domain.SjProfile;

import static com.sejong.project.argus.global.exception.codes.ErrorCode.BAD_REQUEST;

@RequiredArgsConstructor
@Service
@Slf4j
@Transactional(readOnly = true)
public class MemberServiceImpl implements MemberService{

    private final Sj sj;

    public MemberResponse.MemberLocalLoginRequestDto login(MemberRequest.MemberLocalLoginRequestDto requestDto) {
        try {
            SjProfile profile = sj.login(requestDto.id(), requestDto.password());

            System.out.println("Login successful. User profile: " + profile.toString());
            System.out.println("Login successful. User profile: " + profile.getMajor() + profile.getName() + profile.getStudentCode());

            return MemberResponse.MemberLocalLoginRequestDto.from(profile);

        } catch (RuntimeException e) {
            throw  new BaseException(BAD_REQUEST);
        }
    }
}
