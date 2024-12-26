package com.sejong.project.argus.member.service;

import com.sejong.project.argus.member.dto.MemberRequest;
import com.sejong.project.argus.member.dto.MemberResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface MemberService {
    MemberResponse.MemberLocalLoginRequestDto login(MemberRequest.MemberLocalLoginRequestDto requestDto);
}