package com.example.simple_controller.dtos;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContactDTO {
    private String id;
    private ProfileDTO profile;
    private String wa_id;
}
