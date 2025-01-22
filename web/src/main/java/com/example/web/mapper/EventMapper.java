package com.example.web.mapper;

import com.example.web.dto.EventDto;
import com.example.web.models.Event;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EventMapper {
    public static Event mapToEvent(EventDto eventDto) {
        return Event.builder()
                .id(eventDto.getId())
                .name(eventDto.getName())
                .startTime(LocalDate.parse(eventDto.getStartTime(), DateTimeFormatter.ofPattern("yyyy-MM-dd")).atStartOfDay())
                .endTime(LocalDate.parse(eventDto.getEndTime(), DateTimeFormatter.ofPattern("yyyy-MM-dd")).atStartOfDay())
                .type(eventDto.getType())
                .photoUrl(eventDto.getPhotoUrl())
                .createdOn(eventDto.getCreatedOn())
                .updatedOn(eventDto.getUpdatedOn())
                .club(eventDto.getClub())
                .build();
    }

    public static EventDto mapToEventDto(Event event) {
        return EventDto.builder()
                .id(event.getId())
                .name(event.getName())
                .startTime(event.getStartTime().toString())
                .endTime(event.getEndTime().toString())
                .type(event.getType())
                .photoUrl(event.getPhotoUrl())
                .createdOn(event.getCreatedOn())
                .updatedOn(event.getUpdatedOn())
                .club(event.getClub())
                .build();
    }
}
