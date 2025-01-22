package com.example.web.service;

import com.example.web.dto.EventDto;
import com.example.web.models.Event;
import jakarta.validation.Valid;

import java.util.List;


public interface EventService {
    void createEvent(Long clubId, EventDto eventDto);

    List<EventDto> findAllEvents();

    EventDto findByEventId(Long eventId);

    void updateEvent(@Valid EventDto eventDto);

    void deleteEvent(long eventId);
}
