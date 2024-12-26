package com.sejong.project.argus.member.repository;

import com.sejong.project.argus.member.model.Member;
import com.sejong.project.argus.member.model.MemberOAuth;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberOAuthRepository extends JpaRepository<MemberOAuth, Long> {
    Optional<MemberOAuth> findById(long id);
    Optional<MemberOAuth> findByMember(Member member);
}
