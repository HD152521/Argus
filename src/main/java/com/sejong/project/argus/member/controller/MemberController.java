package com.sejong.project.argus.member.controller;


import com.sejong.project.argus.global.exception.BaseResponse;
import com.sejong.project.argus.member.dto.MemberRequest;
import com.sejong.project.argus.member.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/login")
    public BaseResponse<?> login(@Valid  @RequestBody MemberRequest.MemberLocalLoginRequestDto request){
        return BaseResponse.onSuccess(memberService.login(request));
    }

}
