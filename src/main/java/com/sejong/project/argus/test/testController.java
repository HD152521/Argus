package com.sejong.project.argus.test;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yj.sejongauth.controller.Sj;
import org.yj.sejongauth.domain.SjProfile;

@RestController
@RequiredArgsConstructor
@Slf4j
public class testController {

    private final Sj sj;

    @GetMapping("/")
    public void test(){
        String id = "22011742";
        String pw = "20001130";
        try {
            SjProfile profile = sj.login(id, pw);

            System.out.println("Login successful. User profile: " + profile.toString());
            System.out.println("Login successful. User profile: " + profile.getMajor()+profile.getName()+profile.getStudentCode());


        } catch (RuntimeException e) {
            System.err.println("Login failed: " + e.getMessage());
        }
    }
}
