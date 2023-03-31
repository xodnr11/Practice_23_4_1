package com.example.practice_23_4_1.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/v1/req")
    public ResponseEntity<?> getController() {
        return ResponseEntity.ok().body("success");
    }
}
