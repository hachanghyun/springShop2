package com.hotong.springShop2.repository;

import com.hotong.springShop2.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findByEmail(String email);

}