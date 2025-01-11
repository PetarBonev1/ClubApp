package com.example.web.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class ClubDto {
    private Long id;
    @NotEmpty(message = "Club title should not be empty")
    private String title;
    @NotEmpty(message = "Photo link should not be empty")
    private String photoUrl;
    @NotEmpty(message = "Content should not be empty")
    private String content;
    private LocalDate createdOn;
    private List<EventDto> events;


    public List<EventDto> getEvents() {return events;}

    public void setEvents(List<EventDto> events) {this.events = events;}

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public String getPhotoUrl() {return photoUrl;}

    public void setPhotoUrl(String photoUrl) {this.photoUrl = photoUrl;}

    public String getContent() {return content;}

    public void setContent(String content) {this.content = content;}

    public LocalDate getCreatedOn() {return createdOn;}

    public void setCreatedOn(LocalDate createdOn) {this.createdOn = createdOn;}

    public LocalDate getUpdatedOn() {return updatedOn;}

    public void setUpdatedOn(LocalDate updatedOn) {this.updatedOn = updatedOn;}

    private LocalDate updatedOn;
}
