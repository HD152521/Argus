package com.sejong.project.argus.global.handler;


import com.sejong.project.argus.global.exception.BaseException;
import com.sejong.project.argus.global.exception.codes.BaseCode;

public class MyExceptionHandler extends BaseException {
    public MyExceptionHandler (BaseCode code){
        super(code);
    }
}
