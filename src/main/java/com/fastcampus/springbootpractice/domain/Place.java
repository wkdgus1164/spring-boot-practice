package com.fastcampus.springbootpractice.domain;

import com.fastcampus.springbootpractice.constant.PlaceType;

import java.time.LocalDateTime;

public class Place {
    private Long id;

    private PlaceType placeType;
    private String placeName;
    private String address;
    private String phoneNumber;
    private Integer capacity;
    private String name;

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}
