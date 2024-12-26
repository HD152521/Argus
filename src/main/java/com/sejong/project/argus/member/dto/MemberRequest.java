package com.sejong.project.argus.member.dto;

import com.sejong.project.argus.member.model.OAuthProviderType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public class MemberRequest {

    public record MemberLocalLoginRequestDto(
            @Email String id,
            @NotEmpty String password
    ){}

    public record CallingTimeDto(
            int callingTime
    ){}
}
