package com.example.simple_controller.dtos;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter     @Setter
public class WebhookResponseDTO {
    private String object;
    private List<EntryDTO> entry;
}
