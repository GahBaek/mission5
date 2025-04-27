package com.example.demo.domain;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "member")
public class member extends BaseEntity {
    String name;
    String gender;
    int age;
    String address;
    String spec_address;
    String status;
    LocalDateTime inactivationDate;
    String social_type;
    String email;
    int point;
}
