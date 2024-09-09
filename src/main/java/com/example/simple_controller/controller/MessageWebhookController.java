package com.example.simple_controller.controller;


import com.example.simple_controller.service.WebhookProcessingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/webhooks")
public class MessageWebhookController {
    private final WebhookProcessingService webhookProcessingService;

    public MessageWebhookController(WebhookProcessingService webhookProcessingService) {
        this.webhookProcessingService = webhookProcessingService;
    }

    @PostMapping("/receive")
    public void receiveWebhook(@RequestBody String responseJson) {
        try {
            webhookProcessingService.processWebhookResponse(responseJson);
        } catch (Exception e) {
            // Handle the exception
            e.printStackTrace();
        }
    }

    @GetMapping("/receive")
    public ResponseEntity<String> verifyWebhook(@RequestParam("hub.mode") String mode,
                                                @RequestParam("hub.challenge") String challenge,
                                                @RequestParam("hub.verify_token") String verifyToken) {
        // Verify token and respond with challenge
        if ("rutuja".equals(verifyToken)) {
            return ResponseEntity.ok(challenge);
        } else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Invalid token");
        }
    }
}