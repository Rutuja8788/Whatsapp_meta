package com.example.simple_controller.dtos;



import lombok.Getter;
import lombok.Setter;

@Getter     @Setter
public class ConversationDTO {
    private String id;
    private String expiration_timestamp;
    private OriginDTO origin;
}
