package com.example.simple_controller.entity;



import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "business_accounts")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    @Column(name = "business_name")
    private String businessName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "password")
    private String password; // Store plain text password (not recommended for production)
}

