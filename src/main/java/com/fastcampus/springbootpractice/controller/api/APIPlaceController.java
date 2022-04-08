package com.fastcampus.springbootpractice.controller.api;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class APIPlaceController {

    @GetMapping("/places")
    public List<String> getEvents() {
        return List.of("place1", "place2");
    }

    @PostMapping("/places")
    public Boolean createEvent() {
        return true;
    }

    @GetMapping("/places/{eventId}")
    public String getEvent(@PathVariable Integer eventId) {
        return "place " + eventId;
    }

    @PutMapping("/places/{eventId}")
    public Boolean modifyEvent(@PathVariable Integer eventId) {
        return true;
    }

    @DeleteMapping("/places/{eventId}")
    public Boolean removeEvent(@PathVariable Integer eventId) {
        return true;
    }
}
