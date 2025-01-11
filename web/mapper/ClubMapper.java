package com.example.web.mapper;

import com.example.web.dto.ClubDto;
import com.example.web.models.Club;

import java.util.stream.Collectors;

import static com.example.web.mapper.EventMapper.mapToEventDto;

public class ClubMapper {
    public static Club mapToClub(ClubDto club) {
        Club clubDto = Club.builder()
                .id(club.getId())
                .title(club.getTitle())
                .photoUrl(club.getPhotoUrl())
                .content(club.getContent())

                .createdOn(club.getCreatedOn())
                .updatedOn(club.getUpdatedOn())
                .build();
        return  clubDto;
    }

    public static ClubDto mapToClubDto(Club club) {
        ClubDto clubDto = ClubDto.builder()
                .id(club.getId())
                .title(club.getTitle())
                .photoUrl(club.getPhotoUrl())
                .content(club.getContent())

                .createdOn(club.getCreatedOn())
                .updatedOn(club.getUpdatedOn())
                .events(club.getEvents().stream().map((event) -> mapToEventDto(event)).collect(Collectors.toList()))
                .build();
        return clubDto;
    }
}
