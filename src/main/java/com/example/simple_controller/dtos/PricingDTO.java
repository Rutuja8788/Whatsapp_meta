package com.example.simple_controller.dtos;



import lombok.Getter;
import lombok.Setter;

@Getter     @Setter
public class PricingDTO {
    private boolean billable;
    private String pricing_model;
    private String category;
}
