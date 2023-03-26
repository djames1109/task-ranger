package org.castle.djames.taskranger.commandservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommandController {

    @GetMapping("/test")
    public ResponseEntity<?> test() {
        return ResponseEntity.ok("The quick brown fox jumps over the head of the lazy dog.");
    }

}
