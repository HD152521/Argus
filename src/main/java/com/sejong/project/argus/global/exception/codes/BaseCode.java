package com.sejong.project.argus.global.exception.codes;


import com.sejong.project.argus.global.exception.codes.reason.Reason;

public interface BaseCode {
    public Reason.ReasonDto getReasonHttpStatus();
}
