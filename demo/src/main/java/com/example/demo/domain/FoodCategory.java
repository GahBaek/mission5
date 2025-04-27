package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "food_category")
public class FoodCategory extends BaseEntity{
    String name;

    @OneToMany(mappedBy = "foodCategory", orphanRemoval = true)
    private List<MemberPrefer> memberPrefers = new ArrayList<>();
}
