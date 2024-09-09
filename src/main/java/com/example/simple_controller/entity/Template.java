package com.example.simple_controller.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "created_template")
@Data
public class Template {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "template_id", nullable = false)
    private String templateId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "body_message")
    private String bodyMessage;

    @Column(name = "button_message")
    private String buttonMessage;

    @Column(name = "user_phone")
    private String phoneNumber;

    @Column(name = "button1")
    private String button1;

    @Column(name = "button2")
    private String button2;

    @Column(name = "button3")
    private String button3;

    @Column(name = "button1_id")
    private String button1Id; // New field for button ID

    @Column(name = "button2_id")
    private String button2Id; // New field for button ID

    @Column(name = "button3_id")
    private String button3Id; // New field for button ID

    @Column(name = "list_items", columnDefinition = "TEXT[]")
    private String[] listItems;

    @Column(name = "template_name")
    private String templateName;

    @Column(name = "template_type")
    private String templateType;

    @Column(name = "created_at", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @PrePersist
    protected void onCreate() {
        createdAt = new Date();
    }
}
