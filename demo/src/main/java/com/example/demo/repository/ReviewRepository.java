package com.example.demo.repository;

import com.example.demo.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import java.util.UUID;

public interface ReviewRepository extends JpaRepository<Review, UUID> {
    @Modifying
    void detachMember(UUID memberId);
}
