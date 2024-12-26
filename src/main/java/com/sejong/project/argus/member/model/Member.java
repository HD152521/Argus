package com.sejong.project.argus.member.model;

import com.sejong.project.argus.global.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "member")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String memberName;

    private String memberPassword;

    private String memberEmail;

    private Role role;

    //비디어 저장할거 필요

    @OneToMany(mappedBy = "member")
    private List<MemberOAuth> memberOAuths = new ArrayList<>();


    public enum Role {
        STUDENT("STUDENT"),
        PROFESSOR("PROFFESSOR");

        Role(String name) {
        }
        private String name;
    }

    public void encodePassword(String encodedPassword){
        this.memberPassword = encodedPassword;
    }

    @Builder
    private Member(String memberName, String memberPassword, String memberEmail) {
        this.memberName = memberName;
        this.memberPassword = memberPassword;
        this.memberEmail = memberEmail;
    }



}
