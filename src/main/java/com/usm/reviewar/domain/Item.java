package com.usm.reviewar.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long id;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private String itemUrl;

    @Column(nullable = false)
    private String review;

    @Column(nullable = false)
    private String mainCate;

    @Column(nullable = false)
    private String subCate;
}
