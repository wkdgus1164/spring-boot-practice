package com.fastcampus.springbootpractice.domain;

import com.fastcampus.springbootpractice.constant.EventStatus;

import java.time.LocalDateTime;

public class Event {
    private Long id;

    private Long placeId;
    private String eventName;
    private EventStatus eventStatus;
    private LocalDateTime eventStartDatetime;
    private LocalDateTime eventEndDatetime;
    private Integer currentNumberOfPeople;
    private Integer capacity;
    private String name;

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}
