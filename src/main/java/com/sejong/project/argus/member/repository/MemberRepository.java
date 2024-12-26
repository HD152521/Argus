package com.sejong.project.argus.member.repository;

import com.sejong.project.argus.member.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member,Long> {
    Optional<Member> findMemberByMemberEmail(String email);
    Boolean existsByMemberEmail(String email);
}
