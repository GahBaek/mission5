package com.example.demo.repository;

import com.example.demo.domain.MemberMission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MemberMissionRepository extends JpaRepository<MemberMission, UUID> {
    void deleteByMemberId(UUID memberId);
}
