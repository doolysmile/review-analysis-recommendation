package com.usm.reviewar.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Getter @Setter
public class WishList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wishId;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private String itemId;

    @Column(nullable = false)
    private int priceToday;

    @Column(nullable = true)
    private int priceYesterday;
}
