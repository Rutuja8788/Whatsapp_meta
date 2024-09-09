package com.example.simple_controller.dtos;




import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter     @Setter
public class InteractiveMessageDTO {
    @JsonProperty("type")
    private String type;

    @JsonProperty("button_reply")
    private ButtonReplyDTO buttonReply;
}