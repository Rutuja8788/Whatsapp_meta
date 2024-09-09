package com.example.simple_controller.dtos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter     @Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class MetadataDTO {
    private String display_phone_number;
    private String phone_number_id;
}
